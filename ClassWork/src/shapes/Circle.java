package shapes;

/**
 * Lingli Zou, Tabassum Bhuiyan
 *  Lab 2.1 shapes
 *
 */
public class Circle implements Shape {

	// fields
	private int radius;
	private static double pi = 3.14;

	/**
	 * Constructor method
	 * 
	 * @param radius
	 * @return 
	 * @return 
	 */
	public Circle(int radius)
	{ 
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return (pi*(this.radius^2));
	}

	@Override
	public double calculatePerimeter() {
		return(pi*2*this.radius);
	}

	@Override
	public String toString() {
		// to be implemented by student
		return  "Circle Radius: " + radius + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}
