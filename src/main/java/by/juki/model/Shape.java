package by.juki.model;

/**
 * @author angelinapavlovets
 * @version 1.0
 * @created 22-���-2021 16:09:08
 */
public abstract class Shape {

	private Point initialPoint;
	private Color lineColor;

	public Shape(){

	}

	public abstract void draw();

	public Color getLineColor(){
		return null;
	}

	public Point getTheCenter(){
		return null;
	}

	public Point location(){
		return null;
	}

	/**
	 * 
	 * @param point
	 */
	public abstract void move(Point point);

	/**
	 * 
	 * @param color
	 */
	public void setLineColor(Color color){

	}

	/**
	 * 
	 * @param point
	 */
	public void setTheCenter(Point point){

	}
}//end Shape