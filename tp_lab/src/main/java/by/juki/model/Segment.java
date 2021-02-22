package by.juki.model;

/**
 * @author angelinapavlovets
 * @version 1.0
 * @created 22-���-2021 16:09:08
 */
public class Segment extends Shape1D {

	public Segment(Point firstPoint, Point secondPoint){
		super(2);
		points[0] = firstPoint;
		points[1] = secondPoint;
	}

}//end Segment