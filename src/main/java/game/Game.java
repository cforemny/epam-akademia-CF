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

    private Board board;
    private Mark mark;
    private Scanner scanner;
    private String columnPosition;
    private String recordPosition;

    public Board playTheGame(Mark mark){


        System.out.println("Choose the column");
        columnPosition = scanner.nextLine();
        System.out.println("Choose the column");
        recordPosition = scanner.nextLine();




        return board;
    }



}
