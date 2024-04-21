package edu.mod5.csu;

import java.util.Scanner;

public class Recursion {
		

	public static void main(String[] args) {

		int[] myArray = new int[5];
		int sum = 0;
		
		
		try (Scanner scnr = new Scanner(System.in)) {
			for (int i = 0; i < myArray.length; i++) {
				System.out.print("Please enter a number: ");
				myArray[i] = scnr.nextInt();
			}
		}
		
		
		sum = totalSum(myArray, 5 - 1);
		System.out.print("The sum is: " + sum);
	
	}
	
	public static int totalSum (int myArray[], int arrLen) {
		if (arrLen == -1) {
			return 0;
		}
		else {
			return myArray[arrLen] + totalSum(myArray, arrLen - 1);
		}
	}

}


