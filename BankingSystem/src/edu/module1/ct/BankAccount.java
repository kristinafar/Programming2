package edu.module1.ct;

import java.util.Scanner;

public class BankAccount {
 String firstName;
 String lastName;
 int accountID; 
 double balance;
 
 
 public BankAccount() {
	balance = 0;	 
 }
 
 public void deposit() {
	 System.out.println("Please enter deposit amount:");
	 Scanner scnr = new Scanner(System.in);
	 double depAmt = scnr.nextDouble();
	 balance = depAmt + balance; 
	 System.out.println(depAmt + " has been deposisted. The balance is now: " + balance);
	 }
 
 public void withdrawal() {
	 System.out.print("Please enter withdrawl amount:");
	 Scanner scnr = new Scanner(System.in);
	 double withAmt = scnr.nextDouble();
	 balance = balance - withAmt;
	 System.out.println(withAmt + " has been withdrawn. The balance is now: " + balance);
 }
 
 public Double getBalance() {
		return balance;
	}
 
 public String getFirstName() {
		return firstName;
	}
 
 public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
 
 public String getLastName() {
		return lastName;
	}
 
 public void setLastName(String lastName) {
	 this.lastName = lastName;
 }

 public int getAccountID() {
	 return accountID; 
 }
 
 public void setAccountID(int accountID) {
	 this.accountID = accountID;
 }
 
 public void accountSummary() {
	 System.out.println("Account ID: " + getAccountID() + 
			 			"\nBalance: " + getBalance() +
			 			"\nFirst Name: " + getFirstName() +
			 			"\nLast Name: " + getLastName());
	 
 }
 
}
