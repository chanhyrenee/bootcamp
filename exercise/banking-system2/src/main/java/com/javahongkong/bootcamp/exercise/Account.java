package com.javahongkong.bootcamp.exercise;

import java.math.BigDecimal;

public abstract class Account implements AccountInterface {
	private AccountHolder accountHolder;
	private Long accountNumber;
	private int pin;
	private double balance;

	protected Account(AccountHolder accountHolder, Long accountNumber, int pin,
			double startingDeposit) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.pin = pin;
		this.balance = startingDeposit;
	}

	public AccountHolder getAccountHolder() {
		return this.accountHolder;
	}

	public boolean validatePin(int attemptedPin) {
		return this.pin == attemptedPin;
	}

	public double getBalance() {
		return this.balance;
	}

	public double getPin() {
		return this.pin;
	}

	public Long getAccountNumber() {
		return this.accountNumber;
	}

	public void creditAccount(double amount) {
		// BigDecimal bd1 = BigDecimal.valueOf(this.balance);
		// BigDecimal bd2 = BigDecimal.valueOf(amount);
		// this.balance = bd1.add(bd2).doubleValue();
		this.balance += amount;
	}

	public boolean debitAccount(double amount) {
		boolean result = this.balance >= amount;
		if (result)
			this.balance -= amount;
		return result;
	}
}
