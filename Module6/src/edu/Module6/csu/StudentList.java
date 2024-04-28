package edu.Module6.csu;

import java.util.ArrayList;

public class StudentList {
	
	public static void SortByRoll(ArrayList<Student> StudentList) {
		int n = StudentList.size();
		
		SortByRollNo sortRoll = new SortByRollNo();
		
		for(int i = 0; i < n-1; i++) {
			int min_idx = i;
			for (int x = i+1; x < n; x++)
				if(sortRoll.compare(StudentList.get(x), StudentList.get(min_idx)) <0)
				min_idx = x;
			    Student temp = StudentList.get(min_idx);
			    StudentList.set(min_idx, StudentList.get(i));
			    StudentList.set(i, temp);
				}
		}
		
		public static void NameSort(ArrayList<Student> StudentList) {
			int n = StudentList.size();
			
			SortByName sortName = new SortByName();
			
			for(int i = 0; i < n-1; i++) {
				int min_idx = i;
				for (int x = i+1; x < n; x++)
					if(sortName.compare(StudentList.get(x), StudentList.get(min_idx)) <0)
					min_idx = x;
				    Student temp = StudentList.get(min_idx);
				    StudentList.set(min_idx, StudentList.get(i));
				    StudentList.set(i, temp);
					}
	}

	public static void main(String[] args) {

	ArrayList<Student> StudentList = new ArrayList<Student>();
		
	StudentList.add(new Student(12, "Klaire Jones", "1885 Pond St"));
	StudentList.add(new Student(46, "Solomon Grundy", "5869 Hudson Dr"));
	StudentList.add(new Student(3, "Nate Clark", "26 Ottomon Ln"));
	StudentList.add(new Student(17, "Steward Little", "125 Maple Ln"));
	StudentList.add(new Student(50, "Dylan Humble", "8565 Locust St"));
	StudentList.add(new Student(9, "Mark Roads", "8793 Clarkson St"));
	StudentList.add(new Student(13, "Emilia Clark", "6060 Amity Rd"));
	StudentList.add(new Student(101, "Jean Val Jean", "24601 Paris St"));
	StudentList.add(new Student(5, "Tabitha Callers", "4546 Junction Ln"));
	StudentList.add(new Student(1, "Zach Myers", "67 Indie St"));

	System.out.println("Orginal List: ");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
	for(int i = 0; i < StudentList.size(); i++) {
	System.out.println(StudentList.get(i));
	}
	System.out.println("\n" + "\n");

	SortByRoll(StudentList);
	System.out.println("Students by Roll Number: ");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
	for(int i = 0; i < StudentList.size(); i++) {
		System.out.println(StudentList.get(i));
		}
	System.out.println("\n" + "\n");
	
	NameSort(StudentList);
	System.out.println("Students by Name: ");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
	for(int i = 0; i < StudentList.size(); i++) { 
		System.out.println(StudentList.get(i));
		}

    
}
	
	


}
