package shapes;

/**
 * Lingli Zou, Tabassum Bhuiyan
 * Lab 2.1 shapes
 *
 */
public class Circle implements Shape {
//Defining values of a circle
	private int radius;
	private static double pi = 3.14;

	public Circle(int radius)
	{ 
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		//Formula for area of a circle
		return (pi*(this.radius*this.radius));
	}

	@Override
	public double calculatePerimeter() {
		//Formula for perimeter of a circle
		return(pi*2*this.radius);
	}

	@Override
	public String toString() {
		//Builds the circle using the dimensions of the shape and the calculated values of area and perimeter
		return  "Circle Radius: " + radius + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}
