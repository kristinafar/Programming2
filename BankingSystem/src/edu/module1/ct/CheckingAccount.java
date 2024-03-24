 package edu.module1.ct;

public class CheckingAccount extends BankAccount {
	double intRate = 0.05;
	
	public void processWithdrawal() {
		if (balance < 0) {
			System.out.println("This account has overdrafted. A $30 fee has been appllied. Current balance is now "
		 + (balance - 30));
		}
	}
	
	public void displayAccount() {
		System.out.println("Account ID: " + getAccountID() + 
	 			"\nBalance: " + getBalance() +
	 			"\nFirst Name: " + getFirstName() +
	 			"\nLast Name: " + getLastName());
		System.out.println("Itnerest Rate: " + intRate +"%");
	}
}
