package exercise6.task1;

import java.awt.Point;

public abstract class TwoDimensionalShape extends Shape implements IRotate {

    // attributes
    public static final int ZERO_DEGREES = 0;
	public static final int NINETY_DEGREES = 1;
	public static final int ONE_EIGHTY_DEGREES = 2;
	public static final int TWO_FORTY_DEGREES = 3;
	
	private int rotation = ZERO_DEGREES;

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

    public int getRotation()
	{
		return rotation;
	}

	public void setRotation(int rotation)
	{
		this.rotation = rotation;
	}

    @Override
    public void setDimensions(int[] dimensions) {
        if (dimensions.length == 2) {
            super.setDimensions(dimensions);
        }
        
    }

    public void switchDimensions()
	{
		int[] temp = {getWidth(), getHeight()};
        setDimensions(temp);
	}

    @Override
	public void rotateShape()
	{
		if(getRotation() == TWO_FORTY_DEGREES)
		{
			rotation = ZERO_DEGREES;
		}		
		else
		{
			rotation++;
		}
		this.switchDimensions();
		switch(getRotation())
		{
			case ZERO_DEGREES :
                Point l0 = new Point();
				l0.y = getLocation().y + getHeight()/2;
                l0.x = getLocation().x;
                setLocation(l0);
				break;
			case NINETY_DEGREES : 
                Point l90 = new Point();
				l90.y = getLocation().y;
                l90.x = getLocation().x - getHeight();
                setLocation(l90);
				break;
			case ONE_EIGHTY_DEGREES :
                Point l180 = new Point();
                l180.x = getLocation().x + getWidth() - getHeight();
				l180.y = getLocation().y - getWidth();
				setLocation(l180);
				break;
			case TWO_FORTY_DEGREES :
                Point l240 = new Point();
                l240.x = getLocation().x + getWidth();
				l240.y = getLocation().y + getHeight() - getWidth();
		}
	}

}
