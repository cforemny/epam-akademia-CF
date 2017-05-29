package game;

import utils.Board;

/**
 * Created by Cyprian on 2017-05-29.
 */
public class WinConditiion {


    public boolean isTheGameEnd(Board board) {

        char tablica[][] = board.getTablicaView();

        //TODO: poprawic win condition
        //przekatne
        if (tablica[1][1] == tablica[2][2] && tablica[2][2] == tablica[3][3]) {
            return true;
        }
        if (tablica[1][3] == tablica[2][2] && tablica[2][2] == tablica[3][1]) {
            return true;
        }
        //poziome
        if (tablica[1][1] == tablica[1][2] && tablica[1][2] == tablica[1][3]) {
            return true;
        }
        if (tablica[1][2] == tablica[2][2] && tablica[2][2] == tablica[2][3]) {
            return true;
        }
        if (tablica[1][3] == tablica[2][3] && tablica[2][3] == tablica[3][3]) {
            return true;
        }
        //pionowe
        if (tablica[1][1] == tablica[2][1] && tablica[2][1] == tablica[3][1]) {
            return true;
        }
        if (tablica[2][1] == tablica[2][2] && tablica[2][2] == tablica[3][2]) {
            return true;
        }
        if (tablica[3][1] == tablica[3][2] && tablica[3][2] == tablica[3][3]) {
            return true;
        }

        return false;
    }
}
