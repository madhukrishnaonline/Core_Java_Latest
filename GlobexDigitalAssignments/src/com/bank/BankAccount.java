package com.bank;

public class BankAccount {
	private static String bankName = "SBI";
	private Long accountNumber;
	private Double balance;
	private static float interestRate = 2.5f;

	public BankAccount() {
	}

	public BankAccount(Long accountNumber, Double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public static String getBankName() {
		return bankName;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public static float getInterestRate() {
		return interestRate;
	}

	@Override
	public String toString() {
		return "BankAccount [bankName=" + bankName + ", accountNumber=" + accountNumber + ", balance=" + balance
				+ ", interestRate=" + interestRate + "]";
	}

}