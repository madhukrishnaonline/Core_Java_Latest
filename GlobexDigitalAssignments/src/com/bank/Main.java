package com.bank;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		BankAccount krishna = new BankAccount(123456789l, 2500.00);
		BankAccount madhu = new BankAccount(123456788l, 2000.00);
		BankAccount bunny = new BankAccount(123456787l, 25000.00);
		BankAccount prasanna = new BankAccount(123456780l, 5500.00);
		BankAccount priya = new BankAccount(123456786l, 15000.00);
		List<BankAccount> list = List.of(krishna, madhu, bunny, prasanna, priya);
		list.forEach(System.out::println);
	}
}