package edu.mod2CT.edu;

public class bankAccount {
	static double balance;
	
	public bankAccount() {
		balance = 0;
	}
	
	public bankAccount(double startBalance) {
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
