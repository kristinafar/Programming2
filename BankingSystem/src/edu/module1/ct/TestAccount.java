package edu.module1.ct;

import java.util.Scanner;

public class TestAccount {
	
	
	
	public static void main(String[] args) {
	
		CheckingAccount newAcct = new CheckingAccount();
		
		newAcct.setAccountID(24601);
		newAcct.setFirstName("Sterling");
		newAcct.setLastName("Archer");
		
		 newAcct.displayAccount();
		 System.out.println("Please enter deposit amount:");
		 try (Scanner scnr = new Scanner(System.in)) {
			double curAmt = scnr.nextDouble();
			 newAcct.deposit(curAmt);
			 System.out.println(curAmt + " has been deposisted. The balance is now: " + newAcct.getBalance());
			 
			 System.out.println("Please enter withdrawl amount:");
			 curAmt = scnr.nextDouble();
			 newAcct.withdrawal(curAmt);
			 System.out.println(curAmt + " has been withdrawn. The balance is now: " + newAcct.getBalance());
		}
		 newAcct.processWithdrawal();
		 newAcct.displayAccount();
		 
		
	}
}
