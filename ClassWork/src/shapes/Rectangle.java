package shapes;

/**
 * Lingli Zou, Tabassum Bhuiyan
 *  Lab 2.1 shapes
 *
 */
public class Rectangle implements Shape {
//Defining values of a rectangle
	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}


	public double calculateArea() {
		//Formula for area of a rectangle
		return this.width*this.length;
	}


	public double calculatePerimeter() {
		//Formula for perimeter of a rectangle
		return ((2*this.width)+(2*this.length));
	}


	public String toString() {
		//Builds the shape using the dimensions of the shape and the calculated values of area and perimeter
		return "Rectangle Width: " + width + " Length: " + length + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}
