package edu.mod2CT.edu;

public class BankAccount {
	static double balance;
	
	public void bankAccount() {
		balance = 0;
	}
	
	public void bankAccount(double startBalance) {
		balance = startBalance;
	}
	
	public void  deposit(double amount) {
		double newAmt = balance + amount;
		balance = newAmt;
	}
	
	public void  withdrawl(double amount) {
		double newAmt = balance - amount;
		balance = newAmt;
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double amount) {
		balance = amount;
		
	}
	
}
