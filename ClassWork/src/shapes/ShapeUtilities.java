package shapes;

import java.util.Random;

/**
 * Lingli Zou, Tabassum Bhuiyan
 *  Lab 2.1 shapes
 *
 */
public class ShapeUtilities {

	
	public static Shape randomShape() {
		//Builds a random shape using the number of side lengths/ dimensions specified to be substituted into the code for each shape
		Random rand = new Random();
		int x = rand.nextInt(5);

		switch (x) {
		case 0:
			return new Circle(rand.nextInt(100));
		case 1:
			return new Rectangle(rand.nextInt(50), rand.nextInt(50));
		case 2:
			return new Square(rand.nextInt(50));
		case 3:
			return new Trapezoid(rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100));
		case 4:
			return new Triangle(rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100));
		default:
			return new Circle(rand.nextInt(100));
		}

	}
//This takes an array of shapes and adds up the areas
	public static double sumArea(Shape[] shapes) 
	{
		double x = 0;
		for(int i=0; i< shapes.length; i++)
		{
			x = x + shapes[i].calculateArea();
		}
		return x;
	}
//This takes an array of shapes and adds up the perimeters
	public static double sumPerimeter(Shape[] shapes)
	{
		double y = 0;
		for (int i=0; i< shapes.length; i++)
		{
			y = y + shapes[i].calculatePerimeter();
		}
		return y;
	}

}
