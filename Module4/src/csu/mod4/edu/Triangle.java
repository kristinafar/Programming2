package csu.mod4.edu;

public class Triangle extends Shape {
	double side1;
	double side2;
	double side3;
	
	Triangle (double side1, double side2, double side3) {
		this.side1 = side1; //
		this.side2 = side2;
		this.side3 = side3;	
	}
	
	@Override 
	public String toString() {
		return ("The area of the triangle is: " + area() +
				"\nThe perimeter of the triangle is: " + perimeter() + "\n");			
	}
	
	public double area() {
		double calArea;
		double newArea;
		
		calArea = ((side1+side2+side3)/2.0);
		newArea = Math.sqrt(calArea * (calArea-side1) * (calArea-side2) * (calArea-side3));
		return (newArea);
	}
	 

	public double perimeter() { 
		return (side1 + side2 + side3);
	}
	
	
}


