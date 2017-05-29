import game.Starter;
import utils.Board;

/**
 * Created by Cyprian on 2017-05-27.
 */
public class TicTacMain {
    public static void main(String[] args) {

        Starter starter = new Starter();
        starter.startTheGame();


        Board gameBoard = new Board();
        gameBoard.createBoardView();
        starter.tellInstruction();


    }
}
