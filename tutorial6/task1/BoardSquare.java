package tutorial6.task1;

public class BoardSquare {
    
    //attributes
    private int position;
    private Mover aMover = null;

    //constructors
    BoardSquare(int position) {
        setPosition(position);
    }
    //methods
    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void movePlayerPiece(PlayerPiece counter) {
        counter.setCurrentPosition(this);
        if (hasMover()) {
            aMover.movePlayerPiece(counter);
        }
    }

    public void addMover(Mover mover) {
        aMover = mover;
    }
    
    private boolean hasMover() {
        if (aMover == null) {
            return false;
        } else {
            return true;
        }
    }

}
