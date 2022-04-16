package exercise6.task1;

import java.awt.Graphics;
import java.awt.Point;

public class EquilateralTriangle extends TwoDimensionalShape {
    
    // attributes
    private static final String SHAPENAME = "Equilateral Triangle";

    // constructors
    public EquilateralTriangle(Point location, int height, int width) {
        super(location, height, width);
    }

    // methods
    // getters/setters
    @Override
    public String getShapeName() {
        return SHAPENAME;
    }

    // functions
    @Override
    public double calculateArea() {
        return (Math.sqrt(3) / 4) * (getHeight() * getWidth());
    }

    @Override
    public void draw(Graphics g) {
        int xLocation = getLocation().x;
        int yLocation = getLocation().y;
        int[] xValues = {xLocation, xLocation + getWidth(), xLocation + getWidth()/2};
        int[] yValues = {yLocation, yLocation, yLocation - (int)(Math.sqrt(3) * (getWidth()/2)) };
        g.fillPolygon(xValues, yValues, 3);
        
    }
    
}
