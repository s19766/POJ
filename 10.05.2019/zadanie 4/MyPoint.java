// Praca w parach: Adrian Szostak, Damian Eggert

/*
2.6  Ex: The MyRectangle and MyPoint Classes
Source: http://www.ntu.edu.sg/home/ehchua/programming/java/J3f_OOPExercises.html#zz-2.6
*/
public class MyPoint {

    private int x = 0;
    private int y = 0;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

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

    public int[] getXY() {
        int[] array = {this.x, this.y};
        return array;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double distance(MyPoint another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double distance() {
        int xDiff = this.x;
        int yDiff = this.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
}

