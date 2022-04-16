package exercise6.task1;

import java.awt.Point;

public abstract class Shape {
    
    // attributes
    private int[] dimensions;
    private Point location;


    // constructors
    public Shape(Point location) {
        setLocation(location);
    }
    
    // methods
    // getters/setters
    public Point getLocation() {
        return location;
    }
    
    public void setLocation(Point location) {
        this.location  = location;
    }

    public int[] getDimensions() {
        return dimensions;
    }

    public void setDimensions(int[] dimensions) {
        this.dimensions = dimensions;
    }

    //functions
    public abstract double calculateArea();

    public abstract String getShapeName();

}
