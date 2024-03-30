package edu.mod2CT.edu;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;



public class AccountPage {

	public static void main(String[] args) {

		
	
		//make frame
		JFrame accountPage = new JFrame();
		accountPage.setTitle("Fells Wargo");
		accountPage.setSize(500, 500);
		accountPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		accountPage.setVisible(true);
		
		//make layout
		accountPage.setLayout(new GridBagLayout());
		GridBagConstraints layoutCon = new GridBagConstraints();
		layoutCon.gridx = 0;
		layoutCon.gridy = 0;
		layoutCon.insets = new Insets(10, 10, 10, 10);
		
		JLabel curBalance = new JLabel("Account Balance: ");
		
		JTextField balField = new JTextField(5);
		balField.setEditable(false);
		balField.setText("0");
		
		
		//make panels
		JPanel accountBalance = new JPanel();
		
		  layoutCon = new GridBagConstraints();
		  layoutCon.gridx = 1;
		  layoutCon.gridy = 0;
		  layoutCon.insets = new Insets(10, 10, 10, 10);
		  accountPage.add(curBalance, layoutCon);
		
		  layoutCon = new GridBagConstraints();
		  layoutCon.gridx = 0;
		  layoutCon.gridy = 1;
		  layoutCon.insets = new Insets(10, 10, 10, 10);
		  accountPage.add(balField, layoutCon);
		
		
		
		
		
		
		
		
		
		
		
	}

}
