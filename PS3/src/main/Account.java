package main;

import java.util.Date;

public class Account {

	private int id;

	private double balance;

	private double annualInterestRate;

	private Date dateCreated;

	Account() {
		id = 0;
		balance = 0.0;
		annualInterestRate = 0.0;
	}

	Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
	}
	
	Account(int newId, double newBalance, double newAnnualInterestRate) {
		id = newId;
		balance = newBalance;
		annualInterestRate = newAnnualInterestRate;
	}

	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;

	}

		double withdraw(double amount) throws InsufficientFundsException {
			if (amount <= balance) {
				balance -= amount;

				return balance;
			} else {
				double needs = amount - balance;
				throw new InsufficientFundsException(needs);
			}
	}

	double deposit(double amount) {
		return balance += amount;

	}

}
