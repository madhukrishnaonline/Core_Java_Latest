package com.bank.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import com.bank.model.BankAccount;
import com.bank.model.BankAccountDump;
import com.bank.model.Transaction;
import com.bank.repository.AccountRepository;
import com.bank.repository.TransactionRepository;

public class BankServiceImpl implements BankService {

	private final Executor executor = Executors.newFixedThreadPool(10);
	private AccountRepository<Long, BankAccount> accountRepository;

	private TransactionRepository transactionRepository;

	private Scanner scanner;

	public BankServiceImpl(AccountRepository<Long, BankAccount> accountRepository,
			TransactionRepository transactionRepository, Scanner scanner) {
		this.accountRepository = accountRepository;
		this.transactionRepository = transactionRepository;
		this.scanner = scanner;
	}

	@Override
	public boolean registerBankAccount() {
		System.out.println("Enter the Account Number");
		Long accountNumber = scanner.nextLong();
		System.out.println("Enter the Holder Name");
		scanner.next();
		String name = scanner.nextLine();
		System.out.println("Enter the balance");
		double balance = scanner.nextDouble();
		System.out.println("Enter the account type");
		String accountType = scanner.nextLine();
		LocalDate openedDate = LocalDate.now();
		BankAccount account = new BankAccount(accountNumber, name, balance, accountType, openedDate);

		BankAccount bankAccount = accountRepository.save(account);
		if (bankAccount != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean registerMultipleAccounts() {
		try {
			List<BankAccount> data = CompletableFuture.supplyAsync(BankAccountDump::addAccountData).get();
			accountRepository.saveAll(data);
			return true;
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public BankAccount findById(Long accountNumber) {
		BankAccount account = accountRepository.findById(accountNumber);
		if (account != null) {
			return account;
		}
		throw new RuntimeException("Account Not Found");
	}

	@Override
	public List<BankAccount> displayAllBankAccounts() throws InterruptedException, ExecutionException {

		/*List<CompletableFuture<List<BankAccount>>> futures = IntStream.range(0, 10)
			    .mapToObj(i -> CompletableFuture.supplyAsync(() -> accountRepository.findAll(), executorService))
			    .collect(Collectors.toList());
		
			List<BankAccount> allAccounts = futures.stream()
			    .map(CompletableFuture::join)
			    .flatMap(List::stream)
			    .collect(Collectors.toList());*/
		CompletableFuture<List<BankAccount>> completableFuture = CompletableFuture
				.supplyAsync(() -> accountRepository.findAll(), executor);
		List<BankAccount> collection = completableFuture.get();
		if (collection.isEmpty()) {
			throw new RuntimeException("No Data Found");
		}
		return collection;
	}

	@Override
	public void removeAccount(Long accountNumber) {
		accountRepository.deleteById(accountNumber);
	}

	@Override
	public String depositAmount(Long accountNumber, double amount) {
		BankAccount account = accountRepository.findById(accountNumber);
		if (account != null) {
			synchronized (accountNumber.toString().intern()) {
				double oldBalance = account.getBalance();
				account.setBalance(oldBalance + amount);
				double newBalance = account.getBalance();
				/*			Transaction transaction = new Transaction(generateTransactionId(), "Deposit", amount, LocalDateTime.now(),
									"Description", "Pending", account, account);
							transactionRepository.saveTransaction(null);*/
				return "Amount deposited " + amount + " total balance " + newBalance;
			}
		}
		return "Account Not Found";
	}

	@Override
	public String withdrawAmount(Long accountNumber, double amount) {
		BankAccount account = accountRepository.findById(accountNumber);
		if (account != null) {
			synchronized (accountNumber.toString().intern()) {
				double oldBalance = account.getBalance();
				if (oldBalance >= amount) {
					account.setBalance(oldBalance - amount);
					double newBalance = account.getBalance();
					return "Amount Deducted" + amount + " total balance " + newBalance;
				} else {
					return "Insufficient Funds";
				}
			}
		}
		return "Acoount Not Found";
	}

	@Override
	public double checkBalance(Long accountNumber) {
		BankAccount account = accountRepository.findById(accountNumber);
		if (account != null) {
			return account.getBalance();
		}
		throw new RuntimeException("Account Not Found");
	}

	@Override
	public String transferAmount(Long sourceAccount, Long destinationAccount, double amount) {
		BankAccount source = accountRepository.findById(sourceAccount);
		BankAccount destination = accountRepository.findById(destinationAccount);
		if (source != null && destination != null) {
			Object firstLock;
			Object secondLock;

			if (sourceAccount < destinationAccount) {
				firstLock = source;
				secondLock = destination;
			} else {
				firstLock = destination;
				secondLock = source;
			}
			if (sourceAccount.equals(destinationAccount)) {
				return "Source and destination accounts must not be same";
			}
			synchronized (firstLock) {
				synchronized (secondLock) {
					double sourceOldBalance = source.getBalance();
					double destOldBalance = destination.getBalance();
					try {
						if (sourceOldBalance >= amount) {
							source.setBalance(sourceOldBalance - amount);
							destination.setBalance(destOldBalance + amount);
							saveTransaction(sourceAccount, destinationAccount, amount);
							return "Amount " + amount + " transfered from " + sourceAccount + " to "
									+ destinationAccount;
						} else {
							return "Insufficient Funds from Source Account";
						}
					} catch (Exception e) {
						source.setBalance(sourceOldBalance);
						destination.setBalance(destOldBalance);
						e.printStackTrace();
					} // catch
				}
			}
		} // if
		return "One of the account or accounts not found";
	}

	private void saveTransaction(Long sourceAccount, Long destinationAccount, double amount) {
		Transaction transaction = new Transaction(generateTransactionId(), "Transfer Funds", amount,
				LocalDateTime.now(), "Description", "Success", sourceAccount, destinationAccount);
		transactionRepository.saveTransaction(transaction);
	}

	private Long generateTransactionId() {
		Random random = new Random();
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i <= 9; i++) {
			builder.append(random.nextInt(1234567890));
		}
		return Long.parseLong(builder.toString());
	}
}