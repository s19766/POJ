/*
POJ, lab5, zadanie 3
Adrian Szostak, s19777
Damian Eggert, s19766
*/
import static java.lang.Math.pow;
import static java.lang.StrictMath.sqrt;

public class MyPoint {

    protected int x, y;

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
        MyCircle c1 = new MyCircle();
        System.out.println(c1);
        MyCircle c2 = new MyCircle(1, 2, 3);
        System.out.println(c2);
        MyCircle c3 = new MyCircle(new MyPoint(4, 5), 6);
        System.out.println(c3);


        c1.setCenter(new MyPoint(11, 12));
        c1.setRadius(13);
        System.out.println(c1);
        System.out.println("center is: " + c1.getCenter());
        System.out.println("radius is: " + c1.getRadius());

        c1.setCenterX(21);
        c1.setCenterY(22);
        System.out.println(c1);
        System.out.println("center's x is: " + c1.getCenterX());
        System.out.println("center's y is: " + c1.getCenterY());
        c1.setCenterXY(31, 32);
        System.out.println(c1);
        System.out.println("center's x is: " + c1.getCenterXY()[0]);
        System.out.println("center's y is: " + c1.getCenterXY()[1]);


        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());


        System.out.printf("distance is: %.2f%n", c1.distance(c2));
        System.out.printf("distance is: %.2f%n", c2.distance(c1));
    }
}
