package tutorial6.task1;

public class Ladder extends Mover {
    //attributes
    //private BoardSquare top;

    //constructors
    public Ladder(BoardSquare bottom, BoardSquare top) {
        super(bottom, top);
    }

    //methods
    public String getMessage() {
        return "Up the ladder to ";
    }
    // public BoardSquare getTop() {
    //     return top;
    // }
    // public void setTop(BoardSquare top) {
    //     this.top = top;
    // }


    // public void movePlayerPiece(PlayerPiece counter) {
    //     System.out.println("Up the ladder to " + getTop().getPosition());
    //     counter.setCurrentPosition(getTop());
    // }
}
