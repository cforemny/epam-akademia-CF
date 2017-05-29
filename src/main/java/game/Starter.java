package game;

import java.util.Scanner;

/**
 * Created by Cyprian on 2017-05-29.
 */
public class Starter {


    public void startTheGame() {

        Scanner scanner = new Scanner(System.in);
        String beginingMark;
        System.out.println("Lets start the game. Choose who stars X or O:");
        System.out.println();

        beginingMark = scanner.nextLine();

        if (beginingMark.equalsIgnoreCase("x")) {
            System.out.println("Okay, X starts");
            System.out.println();
        }
        if (beginingMark.equalsIgnoreCase("o")) {
            System.out.println("Okay, O starts");
            System.out.println();
        }
    }

    public void tellInstruction() {
        System.out.println("Put the X or O mark on the board by typing the coordinates. ");
        System.out.println("For example:");
        System.out.println("If you want to put your mark at first column on last position");
        System.out.println("Type: 1 -> enter -> 3");
    }

}
