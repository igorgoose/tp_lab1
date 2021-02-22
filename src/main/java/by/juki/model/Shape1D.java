package by.juki.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author angelinapavlovets
 * @version 1.0
 * @created 22-���-2021 16:09:08
 */
@EqualsAndHashCode(callSuper = true)
@Data
public abstract class Shape1D extends Shape {

    private Point secondPoint;
    protected Point[] points;

    public Shape1D(int numberOfPoints) {
        points = new Point[numberOfPoints];
    }

    public Shape1D(Point[] points) {
        this.points = points;
    }

    public Point getSecondPoint() {
        return null;
    }

    /**
     * @param point
     */
    public void move(Point point) {

    }

    /**
     * @param point
     */
    public void setSecondPoint(Point point) {

    }

    @Override
    public void draw() {
        for (Point point : points) {
            //draw each point and connect them
        }
    }
}//end Shape1D