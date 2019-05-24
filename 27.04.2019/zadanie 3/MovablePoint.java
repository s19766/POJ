// Praca: Damian Eggert

/*
4.4  Ex: Point and MovablePoint
Source: http://www.ntu.edu.sg/home/ehchua/programming/java/J3f_OOPExercises.html
*/
public class MovablePoint {

    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(){
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float newxSpeed) {
        xSpeed = newxSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float newySpeed) {
        ySpeed = newySpeed;
    }

    public void setSpeed(float newxSpeed, float newySpeed) {
        xSpeed = newxSpeed;
        ySpeed = newySpeed;
    }

    public float[] getSpeed() {
        float[] values = {xSpeed, ySpeed};
        return values;
    }

    @Override
    public String toString() {
        return super.toString() + ",speed=(" + getXSpeed() + "," + getYSpeed() + ")";
    }

    public MovablePoint move() {
        super.setX(getX() + getXSpeed());
        super.setY(getY() + getYSpeed());
        return this;
    }
}
