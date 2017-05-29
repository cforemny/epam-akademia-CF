package game;

import utils.Board;
import utils.Mark;
import utils.Omark;
import utils.Xmark;

import java.util.Scanner;

/**
 * Created by Cyprian on 2017-05-29.
 */
public class Game {

    private Board board = new Board();
    private WinConditiion winCondition;
    private Scanner scanner = new Scanner(System.in);;
    private String columnPosition;
    private String recordPosition;



    public void playTheGame() {

        WinConditiion winConditiion = new WinConditiion();

        Mark mark = new Xmark();
        do {
            System.out.println("Choose the column");
            columnPosition = scanner.nextLine();
            int columnPositionInt = Integer.parseInt(columnPosition);
            System.out.println("Choose the record");
            recordPosition = scanner.nextLine();
            int recordPositionInt = Integer.parseInt(recordPosition);
            if (mark instanceof Xmark) {
                board.fillTheBoardWithXmark(columnPositionInt , recordPositionInt );
                mark = new Omark();
            }
            if (mark instanceof Omark) {
                board.fillTheBoardWithOMark(columnPositionInt , recordPositionInt );
                mark = new Xmark();
            }

            board.getTablicaView()[0][0] = ' ';
            board.getTablicaView()[0][1] = '1';
            board.getTablicaView()[0][2] = '2';
            board.getTablicaView()[0][3] = '3';
            board.getTablicaView()[1][0] = '1';
            board.getTablicaView()[2][0] = '2';
            board.getTablicaView()[3][0] = '3';
            for (int i = 0; i < board.getTablicaView().length; i++) {
                for (int j = 0; j < board.getTablicaView()[i].length; j++)
                    System.out.print(board.getTablicaView()[i][j] + " ");
                System.out.println();
            }
            System.out.println();

        } while (true);


    }


}
