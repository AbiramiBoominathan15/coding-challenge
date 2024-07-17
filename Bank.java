package com.skillmatrix;

public class Bank implements BankInterface {
	
	private double balance;

	public Bank(double balance) {
		this.balance = balance;
	}
	@Override
	public double getBalance() {
		
		return balance;

	}
}