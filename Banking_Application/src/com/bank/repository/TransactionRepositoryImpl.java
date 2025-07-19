package com.bank.repository;

import java.util.LinkedList;
import java.util.List;

import com.bank.model.Transaction;

public class TransactionRepositoryImpl implements TransactionRepository {

	private static final List<Transaction> list;

	static {
		list = new LinkedList<>();
	}

	@Override
	public Transaction saveTransaction(Transaction transaction) {
		if (list.add(transaction)) {
			return transaction;
		}
		return null;
	}

	@Override
	public List<Transaction> findAll() {
		return list;
	}

	@Override
	public Transaction findById(Long transactionId) {
		for(int i=0;i<list.size();i++) {
			Transaction transaction = list.get(i);
			if(transaction.getTransactionId().equals(transactionId)) {
				return transaction;
			}
		}
		throw new RuntimeException("Transaction Not Found");
	}
}