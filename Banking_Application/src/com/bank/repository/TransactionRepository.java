package com.bank.repository;

import java.util.List;

import com.bank.model.Transaction;

public interface TransactionRepository {
	Transaction saveTransaction(Transaction transaction);

	List<Transaction> findAll();

	Transaction findById(Long transactionId);
}