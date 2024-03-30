package edu.mod2CT.edu;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class AccountPage {
	
	public static void main(String[] args) {

		int balance = 0;
		int userBal;
		//make frame
		JFrame accountPage = new JFrame();
		accountPage.setTitle("Fells Wargo");
		accountPage.setSize(500, 500);
		accountPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		accountPage.setVisible(true);
		accountPage.setLayout(new FlowLayout());
		
		
		//make input and buttons
		JLabel curBalance = new JLabel("Enter Account Balance: ");
		JTextField balField = new JTextField(8);
		balField.setEditable(true);
		balField.setText("Enter amount");
		JButton depButton = new JButton("Deposit");
		JButton withButton = new JButton("Withdraw");
		JButton balButton = new JButton("Current Balance");
		
		
		depButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
			curBalance.setText("Enter Deposit Amount: ");
			
		}
	});
		
	
		
		
		//make panels
		JPanel accountBalance = new JPanel();
		
		 accountPage.add(curBalance);
		 accountPage.add(balField);
		 accountPage.add(depButton);
		 accountPage.add(withButton);
		 accountPage.add(balButton);
		 
		
		
		
		
		
		
		
		
		
		
		
	}

}
