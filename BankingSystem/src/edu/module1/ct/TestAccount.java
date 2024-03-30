package edu.module1.ct;


public class TestAccount {
	
	
	
	public static void main(String[] args) {
	
		CheckingAccount newAcct = new CheckingAccount();
		
		newAcct.setAccountID(24601);
		newAcct.setFirstName("Sterling");
		newAcct.setLastName("Archer");
		newAcct.deposit();
		newAcct.withdrawal();
		newAcct.processWithdrawal();
		newAcct.displayAccount();
		
	}
}
