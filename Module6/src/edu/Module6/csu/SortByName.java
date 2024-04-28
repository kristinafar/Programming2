package edu.Module6.csu;

import java.util.Comparator;

public class SortByName implements Comparator<Student> {
	
	@Override
	public int compare(Student N1, Student N2) {
		return N1.name.compareTo(N2.name);
	}

}
