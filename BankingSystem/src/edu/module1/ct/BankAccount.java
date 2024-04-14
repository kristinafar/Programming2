package edu.module1.ct;

public class BankAccount {
 String firstName;
 String lastName;
 int accountID; 
 double balance;
 
 
 public BankAccount() {
	balance = 0;	 
 }
 
 public void deposit(double depAmt) {
	 balance = depAmt + balance; 
	 }
 
 public void withdrawal(double withAmt) {
	 balance = balance - withAmt;
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
