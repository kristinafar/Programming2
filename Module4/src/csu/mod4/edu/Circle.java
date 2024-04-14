package csu.mod4.edu;

public class Circle extends Shape {
	double radius;
	
	Circle(double radius) {
		this.radius = radius;
	}
	
	@Override 
	public String toString() {
		return ("The area of the circle is: " + area() + 
				"\nThe perimeter of the circle is: " + perimeter() + "\n");
	}
	

	public double area() {
		return (Math.PI * Math.pow(radius, 2));
	}
	

	public double perimeter() {
		return (2 * Math.PI * radius);
	}
}
