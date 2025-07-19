package com.bank.model;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class BankAccountDump {
	private BankAccountDump() {
	}

	public static List<BankAccount> addAccountData() {
		BankAccount account1 = new BankAccount(1001001001L, "Alice", 5000.0, "Savings", LocalDate.of(2022, 1, 10));
		BankAccount account2 = new BankAccount(1001001002L, "Bob", 12000.0, "Checking", LocalDate.of(2021, 6, 15));
		BankAccount account3 = new BankAccount(1001001003L, "Charlie", 7500.0, "Savings", LocalDate.of(2023, 3, 5));
		BankAccount account4 = new BankAccount(1001001004L, "Diana", 1000.0, "Current", LocalDate.of(2020, 12, 1));
		BankAccount account5 = new BankAccount(1001001005L, "Ethan", 30000.0, "Fixed Deposit",
				LocalDate.of(2019, 7, 20));
		BankAccount account6 = new BankAccount(1001001006L, "Fiona", 8600.0, "Savings", LocalDate.of(2022, 9, 14));
		BankAccount account7 = new BankAccount(1001001007L, "George", 2200.0, "Checking", LocalDate.of(2023, 1, 8));
		BankAccount account8 = new BankAccount(1001001008L, "Hannah", 15400.0, "Fixed Deposit",
				LocalDate.of(2021, 11, 30));
		BankAccount account9 = new BankAccount(1001001009L, "Ian", 4900.0, "Current", LocalDate.of(2020, 8, 23));
		BankAccount account10 = new BankAccount(1001001010L, "Jasmine", 13500.0, "Savings", LocalDate.of(2022, 5, 3));
		BankAccount account11 = new BankAccount(1001001011L, "Kevin", 2000.0, "Checking", LocalDate.of(2023, 4, 12));
		BankAccount account12 = new BankAccount(1001001012L, "Laura", 17600.0, "Fixed Deposit",
				LocalDate.of(2021, 2, 28));
		BankAccount account13 = new BankAccount(1001001013L, "Michael", 6700.0, "Savings", LocalDate.of(2019, 10, 17));
		BankAccount account14 = new BankAccount(1001001014L, "Nina", 3400.0, "Current", LocalDate.of(2020, 3, 9));
		BankAccount account15 = new BankAccount(1001001015L, "Oscar", 9500.0, "Savings", LocalDate.of(2022, 7, 25));

		List<BankAccount> list = new LinkedList<>();
		list.add(account1);
		list.add(account2);
		list.add(account3);
		list.add(account4);
		list.add(account5);
		list.add(account6);
		list.add(account7);
		list.add(account8);
		list.add(account9);
		list.add(account10);
		list.add(account11);
		list.add(account12);
		list.add(account13);
		list.add(account14);
		list.add(account15);
		return list;
	}
}