package com.bank.model;

import java.time.LocalDate;

public class BankAccount {
	private Long accountNo;
	private String holder;
	private double balance;
	private String accountType;
	private LocalDate openedDate;
	private String status = "ACTIVE";

	public BankAccount() {
	}

	public BankAccount(Long accountNo, String holder, double balance, String accountType, LocalDate openedDate) {
		this.accountNo = accountNo;
		this.holder = holder;
		this.balance = balance;
		this.accountType = accountType;
		this.openedDate = openedDate;
	}

	public Long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Long accountNo) {
		this.accountNo = accountNo;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public LocalDate getOpenedDate() {
		return openedDate;
	}

	public void setOpenedDate(LocalDate openedDate) {
		this.openedDate = openedDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", holder=" + holder + ", balance=" + balance + ", accountType="
				+ accountType + ", openedDate=" + openedDate + ", status=" + status + "]";
	}

}