/*
POJ, lab5, zadanie 1
Adrian Szostak, s19777
Damian Eggert, s19766
*/
public class MyPoint {

    private int x, y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }


    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String tooString() {
        return "(" + this.x + "," + this.y + ")";
    }

    public int[] getXY() {
        int[] results = new int[2];
        results[0] = this.x;
        results[1] = this.y;
        return results;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(int i1, int i, int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double distance(MyPoint another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public static void main(String[] args)
    {

        int[] tabOfX = new int[11];
        int[] tabOfY = new int[11];

        MyPoint p1 = new MyPoint();
        p1.tooString();

        for(int i=1;i<11;i++) {
            tabOfX[i]=i;
            tabOfY[i]=i;
            System.out.println("Odległość pomiedzy [x:0 , y:0] a "+"[x1:"+tabOfX[i]+" , y1:"+tabOfY[i]+"] wynosi: "
                    +p1.distance(0, 0, tabOfX[i], tabOfY[i]));

        }
    }
}

