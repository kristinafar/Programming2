package csu.module2.edu;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Moon {
	

	public static void main(String[] args) {
		
		

		JTextField testMessage = new JTextField();
		testMessage.setText("Gerty, am I a clone?");
		testMessage.setEditable(false);
		
		JButton mesButton = new JButton("Are you hungry Sam?");
		mesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				testMessage.setText("Am I really a clone?");
			}
		});
	
		JPanel qPanel = new JPanel();
		qPanel.add(testMessage);
		Color background = new Color(38,34,51);
		qPanel.setBackground(background);
		qPanel.add(mesButton);
		
		JFrame mesFrame = new JFrame();
		mesFrame.setSize(500, 500);
		mesFrame.setTitle("Sarang Station");
		mesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mesFrame.setVisible(true);
		
		
		mesFrame.add(qPanel);
	
		
		
		
		
		
		

		
		
	}
	



}
