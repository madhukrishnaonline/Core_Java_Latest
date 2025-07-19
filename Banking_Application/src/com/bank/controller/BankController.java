package com.bank.controller;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.bank.model.BankAccount;
import com.bank.repository.AccountRepositoryImpl;
import com.bank.repository.TransactionRepositoryImpl;
import com.bank.service.BankService;
import com.bank.service.BankServiceImpl;

public class BankController {

	private BankService service;

	public BankController(BankService service) {
		this.service = service;
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			BankController controller = new BankController(new BankServiceImpl(
					new AccountRepositoryImpl<>(BankAccount::getAccountNo), new TransactionRepositoryImpl(), scanner));
			while (true) {
				try {
					System.out.println("================Banking Application================");
					System.out.println(
							"1.Register Bank Account\n2.Display All Bank Accounts\n3.Remove BankAccount\n4.Deposit Amount\n5.Withdraw Amount\n6.Check Balance\n7.Transfer Amount\n8.Register Multi Data\n9.Find By Id\n10.Exit");
					System.out.println("Select the operation to perform");
					int operation = scanner.nextInt();
					switch (operation) {
					case 1:
						boolean isAdded = controller.service.registerBankAccount();
						if (isAdded) {
							System.out.println("Account Registered");
						} else {
							System.out.println("Not Registered");
						}
						break;
					case 2:
						Collection<BankAccount> accounts = controller.service.displayAllBankAccounts();
						List<BankAccount> filteredAccounts = accounts.stream()
								.filter(account -> account.getStatus().equalsIgnoreCase("ACTIVE")).toList();
						ExecutorService threadPool = Executors.newFixedThreadPool(10);
						threadPool.submit(() -> {
							for (BankAccount account : filteredAccounts) {
								System.out.println(account);
							}
						});
						threadPool.shutdown();
						try {
							if (!threadPool.awaitTermination(5, TimeUnit.SECONDS)) {
								threadPool.shutdownNow();
							}
						} catch (InterruptedException e) {
							threadPool.shutdownNow();
							Thread.currentThread().interrupt();
						}
						System.out.println("Records found :: " + filteredAccounts.size());
						break;
					case 3:
						System.out.println("Enter the Account Number to remove");
						Long accountNumber = scanner.nextLong();
						controller.service.removeAccount(accountNumber);
						break;
					case 4:
						System.out.println("Enter the Account Number");
						Long accntNumber = scanner.nextLong();
						System.out.println("Enter the Amount to deposit");
						double amount = scanner.nextDouble();
						ExecutorService threadPool2 = Executors.newFixedThreadPool(10);

						controller.service.depositAmount(accntNumber, amount);
						break;
					case 5:
						System.out.println("Enter the Account Number");
						Long accntNum = scanner.nextLong();
						System.out.println("Enter the Amount to Withdraw");
						double amt = scanner.nextDouble();
						controller.service.withdrawAmount(accntNum, amt);
						break;
					case 6:
						System.out.println("Enter the Account Number to check Balance");
						Long accNumber = scanner.nextLong();
						double balance = controller.service.checkBalance(accNumber);
						System.out.println("Your Balance :: " + balance);
						break;
					case 7:
						System.out.println("Enter the Source Account Number");
						long sourceAccount = scanner.nextLong();
						System.out.println("Enter the Destination Account Number");
						long destAccount = scanner.nextLong();
						System.out.println("Enter the Amount to transfer");
						double transferAmount = scanner.nextDouble();
						String response = controller.service.transferAmount(sourceAccount, destAccount, transferAmount);
						System.out.println(response);
						break;
					case 8:
						controller.service.registerMultipleAccounts();
						System.out.println("Accounts Inserted");
						break;
					case 9:
						System.out.println("Enter the Bank Account Number");
						long acntNumber = scanner.nextLong();
						BankAccount account = controller.service.findById(acntNumber);
						System.out.println(account);
						break;
					case 10:
						System.exit(0);
						break;
					default:
						System.err.println("Invalid Operation");
					}// outer switch
				} // try
				catch (Exception e) {
					System.out.println(e.getMessage());
				} // catch
			} // outerLoop
		} // try-with-resource
	}
}