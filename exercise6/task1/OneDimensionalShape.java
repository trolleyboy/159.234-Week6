package exercise6.task1;

import java.awt.Point;

public abstract class OneDimensionalShape extends Shape {

    // attributes

    // constructors
    public OneDimensionalShape(Point location, int dimension) {
        super(location);
        int[] tempArray = {dimension};
        setDimensions(tempArray);
    }

    // methods
    @Override
    public int[] getDimensions() {
        return super.getDimensions();
    }

    @Override
    public void setDimensions(int[] dimensions) {
        if (dimensions.length == 1) {
            super.setDimensions(dimensions);
        }
        
    }
    
}
