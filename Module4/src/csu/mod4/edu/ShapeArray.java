package csu.mod4.edu;

public class ShapeArray {

	public static void main(String[] args) {
		Rectangle myRectagle = new Rectangle(10, 5);
		Circle myCircle = new Circle(50);
		Triangle myTriangle = new Triangle(40, 40, 20);
		
		Shape [] ShapeArray = { myRectagle, myCircle, myTriangle };
		for(int i = 0; i < ShapeArray.length; i++) {
			System.out.println(ShapeArray[i]);
		}

	}

}
