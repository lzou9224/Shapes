package shapes;

/**
 * Lingli Zou, Tabassum Bhuiyan
 *  Lab 2.1 shapes
 *
 */
public class Square extends Rectangle {

	int side;

	public Square(int side) {
		super(side, side);
		this.side = side;
	}

	@Override
	public String toString() 
	{ 
		return "Square Side: " + side + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}

}
