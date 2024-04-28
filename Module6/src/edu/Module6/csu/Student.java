package edu.Module6.csu;

public class Student {
	int rollno;
	String name;
	String address;
	
	Student () {}
	
	Student (int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	public int getRollno () {
		return rollno;
		
	}
	
	public String getName () {
		return name;
		
	}
	
	public String getAddress () {
		return address;
		
	}
	
	@Override
	public String toString() {
		return (getName() + 
				", " + getRollno() +
				", " + getAddress()
				);
	}

	
}
