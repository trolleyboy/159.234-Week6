package exercise6.task1;

import java.awt.Point;

public abstract class TwoDimensionalShape extends Shape {

    // attributes

    // constructors
    public TwoDimensionalShape(Point location, int height, int width) {
        super(location);
        int[] tempArray = {height, width};
        setDimensions(tempArray);
    }

    // methods
    public int getHeight() {
        return getDimensions()[0];
    }

    public int getWidth() {
        return getDimensions()[1];
    }

    @Override
    public void setDimensions(int[] dimensions) {
        if (dimensions.length == 2) {
            super.setDimensions(dimensions);
        }
        
    }

}
