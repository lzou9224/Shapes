package shapes;

/**
 * Lingli Zou, Tabassum Bhuiyan
 *  Lab 2.1 shapes
 *
 */
public class Trapezoid implements Shape 
{
	//Defines the dimensions to be used in calculations
	private int base1;
	private int base2;
	private int height;
	private int leg;

	public Trapezoid(int base1, int base2, int height, int leg)
	{
		this.base1 = base1;
		this.base2 = base2;
		this.height = height;
		this.leg = leg;
	}

	public double calculateArea() {
		//Formula for area of a trapezoid
		return (this.height*(this.base1+this.base2)/2);
	}

	public double calculatePerimeter() {
		//Formula for perimeter of a trapezoid
		return ((this.leg*2)+this.base1+this.base2);
	}

	public String toString() {
		//Builds the trapezoid using the dimensions and the calculated values
		return "Trapezoid base1: " + base1 + " Trapezoid base2: " + base2 + " Trapezoid Height: " + height + " Trapezoid Leg: " + leg+ " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}
