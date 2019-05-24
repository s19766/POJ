public class Point {

    private float x = 0.0f;
    private float y = 0.0f;

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public Point(){
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
        float[] values = {x, y};
        return values;
    }

    @Override
    public String toString(){
        return "(" + getX() + "," + getY() + ")";
    }
}
