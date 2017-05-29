package utils;

/**
 * Created by Cyprian on 2017-05-29.
 */
public class Xmark implements Mark {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Xmark(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Mark putMark(int x, int y) {

        return new Xmark(x,y);
    }
}
