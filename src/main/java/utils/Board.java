package utils;

/**
 * Created by Cyprian on 2017-05-29.
 */
public class Board {


    private char tablicaView[][] = new char[4][4];

    public char[][] getTablicaView() {
        return tablicaView;
    }

    public void setTablicaView(char[][] tablicaView) {
        this.tablicaView = tablicaView;
    }

    public void createBoardView() {
        tablicaView[0][0] = ' ';
        tablicaView[0][1] = '1';
        tablicaView[0][2] = '2';
        tablicaView[0][3] = '3';
        tablicaView[1][0] = '1';
        tablicaView[2][0] = '2';
        tablicaView[3][0] = '3';


        for (int i = 0; i < tablicaView.length; i++) {
            for (int j = 0; j < tablicaView[i].length; j++)
                System.out.print(tablicaView[i][j] + " ");
            System.out.println();
        }
        System.out.println();

    }

    public void fillTheBoardWithXmark(int x, int y) {
        this.tablicaView[x][y] = 'x';
    }

    public void fillTheBoardWithOMark(int x, int y) {
        this.tablicaView[x][y] = 'o';
    }


}

