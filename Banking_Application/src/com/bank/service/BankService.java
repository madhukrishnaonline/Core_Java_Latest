package com.bank.service;

import java.util.List;
import java.util.concurrent.ExecutionException;

import com.bank.model.BankAccount;

public interface BankService {
	boolean registerBankAccount();
	boolean registerMultipleAccounts();
	List<BankAccount> displayAllBankAccounts() throws InterruptedException, ExecutionException;
	BankAccount findById(Long accountNumber);
	void removeAccount(Long accountNumber);
	String depositAmount(Long accountNumber,double amount);
	String withdrawAmount(Long accountNumber,double amount);
	double checkBalance(Long accountNumber);
	String transferAmount(Long sourceAccount,Long destinationAccount,double amount);
}