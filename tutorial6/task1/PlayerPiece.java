package tutorial6.task1;

public class PlayerPiece {
    
    //attributes
    private String colour = null;
    private BoardSquare currentPosition;
    //constructors
    PlayerPiece(String colour) {
        this.colour = colour;
    }
    
    //methods

    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getColour() {
        return colour;
    }

    public void moveTo(BoardSquare nextPosition) {
        nextPosition.movePlayerPiece(this);
    }

    public BoardSquare getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(BoardSquare newPosition) {
        currentPosition = newPosition;
    }
}
