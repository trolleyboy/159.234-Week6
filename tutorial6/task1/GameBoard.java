package tutorial6.task1;

public class GameBoard {
    
    //attributes
    private BoardSquare[] squares;
    private Die die;
    static final int START_SQUARE = 1;
    static final int MAX_SQUARES = 100;

    //constructors
    GameBoard() {
        die = new Die();
        
        squares = new BoardSquare[START_SQUARE + MAX_SQUARES];
        for (int i = START_SQUARE; i <= MAX_SQUARES; i++) {
            squares[i] = new BoardSquare(i);
        }

        // add Ladders
        new Ladder(squares[1], squares[38]);
        new Ladder(squares[4], squares[14]);
        new Ladder(squares[9], squares[31]);
        new Ladder(squares[21], squares[42]);
        new Ladder(squares[28], squares[84]);
        new Ladder(squares[36], squares[44]);
        new Ladder(squares[51], squares[67]);
        new Ladder(squares[71], squares[91]);
        new Ladder(squares[80], squares[100]);
        
        new Snake(squares[16], squares[6]);
        new Snake(squares[47], squares[26]);
        new Snake(squares[49], squares[11]);
        new Snake(squares[56], squares[53]);
        new Snake(squares[62], squares[19]);
        new Snake(squares[64], squares[60]);
        new Snake(squares[87], squares[24]);
        new Snake(squares[93], squares[73]);
        new Snake(squares[95], squares[75]);
        new Snake(squares[98], squares[78]);
    }

    //methods
    public BoardSquare getStartSquare() {
        return squares[START_SQUARE];
    }

    public void movePlayerPiece(PlayerPiece counter) {
        BoardSquare current = counter.getCurrentPosition();
        int dieRoll = die.getRoll();
        System.out.println(counter.getColour() + " rolled a " + dieRoll);
        int nextPosition = current.getPosition() + dieRoll;
        if (nextPosition > MAX_SQUARES) {
            System.out.println("Sorry you need to land exactly on the last square to win!");
        } else {
            counter.moveTo(squares[nextPosition]);
        }
        System.out.println(counter.getColour() + " on " + counter.getCurrentPosition().getPosition());
    }

}
