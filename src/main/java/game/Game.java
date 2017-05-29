package game;

import utils.Board;
import utils.Mark;
import utils.Omark;
import utils.Xmark;

import javax.swing.*;
import java.util.Scanner;

/**
 * Created by Cyprian on 2017-05-29.
 */
public class Game {

    private Board board;
    private WinConditiion winCondition;
    private Scanner scanner;
    private String columnPosition;
    private String recordPosition;




    public void playTheGame(Mark mark){

        WinConditiion winConditiion = new WinConditiion();
        do{
            System.out.println("Choose the column");
            columnPosition = scanner.nextLine();
            int columnPositionInt = Integer.parseInt(columnPosition);
            System.out.println("Choose the column");
            recordPosition = scanner.nextLine();
            int recordPositionInt = Integer.parseInt(recordPosition);
            if(mark.equals('x')){
                board.fillTheBoardWithXmark(columnPositionInt+1,recordPositionInt+1);
            }
            if(mark.equals('o')){
                board.fillTheBoardWithOMark(columnPositionInt+1,recordPositionInt+1);
            }
        }while(winConditiion.isTheGameEnd(board));


       board.createBoardView();
    }



}
