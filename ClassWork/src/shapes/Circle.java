package shapes;

/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
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
		return;
	}

	@Override
	public double calculateArea() {
		return(pi*(radius^2));
	}

	@Override
	public double calculatePerimeter() {
		return(pi*2*radius);
	}

	@Override
	public String toString() {
		// to be implemented by student
		return  "Circle Radius: " + radius + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}
