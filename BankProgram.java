package com.skillmatrix;

public class BankProgram {
	
	public static void main(String[] args) {
		
		Bank bankA = new Bank(1000);
		Bank bankB = new Bank(1500);
		Bank bankC = new Bank(2000);

		System.out.println("Balance in Bank A: $" + bankA.getBalance());
		System.out.println("Balance in Bank B: $" + bankB.getBalance());
		System.out.println("Balance in Bank C: $" + bankC.getBalance());
	}
	
}
