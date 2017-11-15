package shapes;

/**
 * Lingli Zou, Tabassum Bhuiyan
 * Lab 2.1 shapes
 *
 */
public class Triangle implements Shape
//Defines the dimensions to be used in calculations
{
	private int base;
	private int height;
	private int side2;
	private int side3;
	
//Precondition is that this is a legal triangle
	//The sum of the lengths of any 2 sides of a triangle has to be greater than the length of the other side
	
	public Triangle(int base, int height, int side2, int side3) 
	{
		this.base = base;
		this.height = height;
		this.side2= side2;
		this.side3 = side3;
	}

	public double calculateArea() 
	{
		//Formula for area of a triangle
		return ((this.base*this.height)/2);
	}

	public double calculatePerimeter() {
		//Formula for perimeter of a triangle
		return (this.base+this.side2+this.side3);
	}
	
	public String toString() 
	{ 
		//Builds the triangle using the dimensions and the calculated values
		return "Triangle base: " + base + " Triangle height: " + height + " Triangle side2: " + side2 + " Triangle side3: " + side3 + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter(); 
	}

}

