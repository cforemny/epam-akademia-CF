import game.Game;
import game.Starter;
import utils.Board;

/**
 * Created by Cyprian on 2017-05-27.
 */
public class TicTacMain {
    public static void main(String[] args) {

        Board gameBoard = new Board();
        Starter starter = new Starter();
        Game game = new Game();
        starter.startTheGame();

        starter.tellInstruction();
        gameBoard.createBoardView();

        game.playTheGame();

    }
}
