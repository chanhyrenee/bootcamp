package com.javahongkong.bootcamp.exercise;

public class Transaction implements TransactionInterface{
	private Long accountNumber;
	private Bank bank;

	/**
	 *
	 * @param bank
	 *                      The bank where the account is housed.
	 * @param accountNumber
	 *                      The customer's account number.
	 * @param attemptedPin
	 *                      The PIN entered by the customer.
	 * @throws Exception
	 *                   Account validation failed.
	 */
	public Transaction(Bank bank, Long accountNumber, int attemptedPin) throws Exception {
		this.bank = bank;
		this.accountNumber = accountNumber;
		if (!(bank.authenticateUser(accountNumber, attemptedPin))){
			throw new Exception();
		}
	}

	public double getBalance() {
		return this.bank.getAccount(accountNumber).getBalance();
	}

	public void credit(double amount) {
		this.bank.credit(accountNumber, amount);
	}

	public boolean debit(double amount) {
		return this.bank.debit(accountNumber, amount);
	}
}
