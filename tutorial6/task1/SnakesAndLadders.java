package tutorial6.task1;

public class SnakesAndLadders {

    GameBoard board = new GameBoard();

    public void play() {

        PlayerPiece[] counter = new PlayerPiece[3];
        counter[0] = new PlayerPiece("Lily");
        counter[1] = new PlayerPiece("Dad");
        counter[2] = new PlayerPiece("Mum");
        PlayerPiece winner = null;

        for (int i = 0; i < counter.length; i++) {
            counter[i].setCurrentPosition(board.getStartSquare());
        }
        
        while (winner == null) {
            for (int i = 0; i < counter.length; i++) {
                board.movePlayerPiece(counter[i]);
                if (counter[i].getCurrentPosition().getPosition() == GameBoard.MAX_SQUARES ) {
                    winner = counter[i];
                    break;
                }
            }
        }

        for (int i = 0; i < counter.length; i++) {
            if (counter[i].getCurrentPosition().getPosition() == GameBoard.MAX_SQUARES ) {
                continue;
            }
            System.out.println(counter[i].getColour() + " finised on " + counter[i].getCurrentPosition().getPosition());    
        }
        
        System.out.println(winner.getColour() + " is the Winner!");
    }
    
    public static void main(String[] args) {
        
        SnakesAndLadders game = new SnakesAndLadders();
        game.play();
        
    }

    
}
