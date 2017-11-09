package shapes;

public class Triangle implements Shape
{
	private int base;
	private int height;
	private int side2;
	private int side3;

	public Triangle(int base, int height) 
	{
		super(base, height);
		this.base = base;
		this.height = height;
	}

	public double calculateArea() 
	{
		return (1/2*this.base*this.height);
	}


	public double calculatePerimeter() {
		return (this.base+this.side2+this.side3);
	}
	
	@Override
	public String toString() 
	{ 
		return "Triangle base: " + base + "Triangle height: " + height + "Triangle side2" + side2 + "Triangle side3:" "Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter(); 
	}

}

}
