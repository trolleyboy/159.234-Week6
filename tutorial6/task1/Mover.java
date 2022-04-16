package tutorial6.task1;

public abstract class Mover {
    
    // attributes
    private BoardSquare end;

    // constructors
    public Mover(BoardSquare start, BoardSquare end) {
        setEnd(end);
        start.addMover(this);
    }
    // methods
    // getters/setters
    public BoardSquare getEnd() {
        return end;
    }

    public void setEnd(BoardSquare end) {
        this.end = end;
    }
    public void movePlayerPiece(PlayerPiece counter) {
        System.out.println(getMessage() + getEnd().getPosition());
        counter.setCurrentPosition(getEnd());
    }

    public abstract String getMessage();

}
