package csu.Mod8.edu;

import java.util.Comparator;

public class SortbyMPG implements Comparator<Vehicle> {

		@Override
		public int compare(Vehicle N1, Vehicle N2) {
			return Double.compare(N1.getMpg(), N2.getMpg());
		}
		
	}
	
 