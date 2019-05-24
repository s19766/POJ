// Praca: Damian Eggert

/*
4.3  Ex: Point2D and Point3D
Source: http://www.ntu.edu.sg/home/ehchua/programming/java/J3f_OOPExercises.html
*/

public class Point2D {

    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public Point2D(){
    }

    public float getX(){
        return x;
    }

    public void setX(float newX){
        x = newX;
    }

    public float getY(){
        return y;
    }

    public void setY(float newY){
        y = newY;
    }

    public void setXY(float newX, float newY){
        x = newX;
        y = newY;
    }

    public float[] getXY(){
        float[] array = {getX(), getY()};
        return array;
    }

    public String toString(){
        return "(" + x + "," + y + ")";
    }
}
