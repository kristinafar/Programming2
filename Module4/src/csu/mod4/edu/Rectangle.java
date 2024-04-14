package csu.mod4.edu;

public class Rectangle extends Shape {
	int width;
	int length; 
	
	Rectangle (int width, int length) {
		this.width = width;
		this.length = length;
	}
	
	@Override
	   public String toString() {
	        return ("The area of the rectangle is: " + area() +
	        		"\nThe perimeter of the rectangle is: " + perimeter() + "\n");  
	   }
	

	public double area() {
		return (length * width);
	}
	

	public double perimeter() {
		return ((length * 2) + (width * 2));
	}
}
