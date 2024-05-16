package com.javahongkong.bootcamp.exercise;

import java.util.LinkedHashMap;

public class Bank implements BankInterface {
	private LinkedHashMap<Long, Account> accounts; // object reference

	public Bank() {
		this.accounts = new LinkedHashMap<>();
	}

	public Account getAccount(Long accountNumber) {
		return this.accounts.get(accountNumber);
	}

	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		Long accountNumber = (long) accounts.size();
		CommercialAccount c =new CommercialAccount(company, accountNumber, pin, startingDeposit);
		accounts.put(accountNumber, c);
		return accountNumber;
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		Long accountNumber = (long) accounts.size();
		ConsumerAccount c =new ConsumerAccount(person, accountNumber, pin, startingDeposit);
		accounts.put(accountNumber, c);
		return accountNumber;
	}

	public boolean authenticateUser(Long accountNumber, int pin) {
		return accounts.get(accountNumber).validatePin(pin);
	}

	public double getBalance(Long accountNumber) {
		return accounts.get(accountNumber).getBalance();
	}

	public void credit(Long accountNumber, double amount) {
		accounts.get(accountNumber).creditAccount(amount);
	}

	public boolean debit(Long accountNumber, double amount) {
		return accounts.get(accountNumber).debitAccount(amount);
	}
}
