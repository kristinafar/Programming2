package csu.Mod8.edu;

import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.LinkedList;

public class CarsList {

	public static void main(String[] args) {
		
		FileOutputStream fileOut = null;
	    PrintWriter outPut = null;

		Scanner scnr = new Scanner(System.in);
		LinkedList<Vehicle> userCars = new LinkedList<Vehicle>();
		
		Vehicle baseCar = new Vehicle("Porshe", "911", 20.0);
		userCars.add(baseCar);
				
		int menOpt;
		int m = 0;
		
		while (m < '5') {
			System.out.println("Please select an option by entering a number:");
			System.out.println("1: Add Car");
			System.out.println("2: Print Inventory");
			System.out.println("3: Quit Program");
			menOpt = scnr.nextInt();

					if (menOpt == 1) {
							addCar(userCars, scnr);
					}
					else if (menOpt == 2) {
						printList(userCars, fileOut, outPut, scnr);
					}
					else if (menOpt == 3) {
						System.out.println("Thank you for using this program. Now closing.");
						System.exit(0);
					}
					}
	
		
	}


	
	public static void addCar(LinkedList<Vehicle> userCars, Scanner scnr) {
		try {
			
		System.out.println("Please enter make, model and MPG as prompted:");
		scnr.nextLine();
		System.out.println("Make:");
		String make = scnr.nextLine();
		System.out.println("Model:");
		String model = scnr.nextLine();
		System.out.println("Miles per Gallon:");
		Double milesperGal = scnr.nextDouble(); 
		Vehicle newVehicle = new Vehicle(make, model, milesperGal);
		userCars.add(newVehicle);
		System.out.println("Success." + newVehicle + "added.");
		} 
		catch(InputMismatchException ex) {System.out.println("Please enter MPG as a number."); scnr.next();}
		}
	
	private static void printList(LinkedList<Vehicle> userCars, FileOutputStream fileOut, PrintWriter outPut, Scanner scnr) {
		try {
			
			fileOut = new FileOutputStream("/Users/krist/Documents/SortedList.txt");
			outPut = new PrintWriter(fileOut);
			SortByMPG(userCars);
			for(int i = 0; i < userCars.size(); i++) { 
				outPut.print(userCars.get(i));
				}
			System.out.println("Success!");
			outPut.close();
			} 
		catch (IOException ex) { System.out.println("Unable to save file");}
		}
	
	public static void SortByMPG(LinkedList<Vehicle> userCars) {
		int n = userCars.size();
		
		SortbyMPG mpgSort = new SortbyMPG();
		
		for(int i = 0; i < n-1; i++) {
			int min_idx = i;
			for (int x = i+1; x < n; x++)
				if(mpgSort.compare(userCars.get(x), userCars.get(min_idx)) <0)
				min_idx = x;
			    Vehicle temp = userCars.get(min_idx);
			    userCars.set(min_idx, userCars.get(i));
			    userCars.set(i, temp);
				}
		}
	


}


