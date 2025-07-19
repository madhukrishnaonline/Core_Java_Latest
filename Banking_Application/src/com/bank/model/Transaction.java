package com.bank.model;

import java.time.LocalDateTime;

public class Transaction {
	private Long transactionId;
	private String transactionType; // e.g., Deposit, Withdraw, Transfer
	private double amount;
	private LocalDateTime timestamp;
	private String description;
	private String status; // Success, Failed, Pending
	private Long sourceAccountNumber; // For transfers
	private Long destinationAccountNumber; // For transfers

	public Transaction() {
	}

	public Transaction(Long transactionId, String transactionType, double amount, LocalDateTime timestamp,
			String description, String status, Long sourceAccountNumber, Long destinationAccountNumber) {
		super();
		this.transactionId = transactionId;
		this.transactionType = transactionType;
		this.amount = amount;
		this.timestamp = timestamp;
		this.description = description;
		this.status = status;
		this.sourceAccountNumber = sourceAccountNumber;
		this.destinationAccountNumber = destinationAccountNumber;
	}

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getSourceAccountNumber() {
		return sourceAccountNumber;
	}

	public void setSourceAccountNumber(Long sourceAccountNumber) {
		this.sourceAccountNumber = sourceAccountNumber;
	}

	public Long getDestinationAccountNumber() {
		return destinationAccountNumber;
	}

	public void setDestinationAccountNumber(Long destinationAccountNumber) {
		this.destinationAccountNumber = destinationAccountNumber;
	}
}