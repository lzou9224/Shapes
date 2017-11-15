package shapes;

/**
 * Lingli Zou, Tabassum Bhuiyan
 *  Lab 2.1 shapes
 *
 */
public interface Shape {
	//Other classes call these methods to make calculations for their shapes

	public abstract double calculateArea();

	public abstract double calculatePerimeter();

	public abstract String toString();

}
