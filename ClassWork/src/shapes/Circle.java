package shapes;

/**
 * Lingli Zou, Tabassum Bhuiyan
 *  Lab 2.1 shapes
 *
 */
public class Circle implements Shape {

	private int radius;
	private static double pi = 3.14;

	public Circle(int radius)
	{ 
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return (pi*(this.radius*this.radius));
	}

	@Override
	public double calculatePerimeter() {
		return(pi*2*this.radius);
	}

	@Override
	public String toString() {
		return  "Circle Radius: " + radius + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}
