package edu.mod2CT.edu;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AccountPage extends JFrame {

	public static void main(String[] args) {
		
		final BankAccount account = new BankAccount();
		
		
		//make frame
		JFrame accountPage = new JFrame();
		accountPage.setTitle("Fells Wargo");
		accountPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		accountPage.setVisible(true);
		accountPage.setLayout(new FlowLayout());
		
		//make panel
		JPanel accountBalance = new JPanel();
		
		//make input and buttons
		final JLabel curBalance = new JLabel("Enter Account Balance: ");
		final JLabel finBalance = new JLabel("Current Balance: " + account.getBalance());
		final JTextField balField = new JTextField();
		balField.setEditable(true);
		balField.setColumns(7);
		JButton depButton = new JButton("Deposit");
		JButton withButton = new JButton("Withdraw");
		
		
		 
		depButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			String userInput;
			double depAmt;
			
			userInput = balField.getText();
			depAmt = Double.parseDouble(userInput);
			account.deposit(depAmt);
			finBalance.setText("Current Balance: " + account.getBalance());
			
		}
	});
		
		withButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			String userInput;
			double wAmt;
			
			userInput = balField.getText();
			wAmt = Double.parseDouble(userInput);
			account.withdrawl(wAmt);
			finBalance.setText("Current Balance: " + account.getBalance());
			
		}
	});
		
		balField.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			String userInput;
			double startAmt;
			
			userInput = balField.getText();
			startAmt = Double.parseDouble(userInput);
			account.setBalance(startAmt);
			finBalance.setText("Current Balance: " + account.getBalance());
			curBalance.setText("Enter Withdrawl/Deposit Amount");
				
			
		}
	});
	
		
		
		
		//make panels
		
		 accountPage.add(accountBalance);	
		 accountBalance.add(curBalance);
		 accountBalance.add(balField);
		 accountBalance.add(depButton);
		 accountBalance.add(withButton);
		 accountBalance.add(finBalance);
		 accountPage.setSize(700, 200);
		 
		 
		
		
	}
	
	
		

}
