package shapes;

/**
 * Lingli Zou, Tabassum Bhuiyan
 * Lab 2.1 shapes
 *
 */
public class Square extends Rectangle {

	int side;
//Squares are extensions of rectangles
	//Uses the side values for the length and the width in the rectangle methods for area and perimeter
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
