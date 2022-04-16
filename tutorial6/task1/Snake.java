package tutorial6.task1;

public class Snake extends Mover {

    
    //attributes
    //private BoardSquare tail;

    //constructors
    public Snake(BoardSquare head, BoardSquare tail) {
        super(head, tail);
    }

    //methods
    public String getMessage() {
        return "Down the snake to ";
    }
    // public void setTail(BoardSquare tail) {
    //     this.tail = tail;
    // }
    // public BoardSquare getTail() {
    //     return tail;
    // }

    // public void movePlayerPiece(PlayerPiece counter) {
    //     System.out.println("Down the snake to " + getTail().getPosition());
    //     counter.setCurrentPosition(getTail());
    // }
}
