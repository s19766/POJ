/**
 * @author Rafał Sochacki s20047
 * @author Damian Egert s19766
 */
public class MovablePoint extends Point implements Movable {

    private int xSpeed = 0;
    private int ySpeed = 0;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(int xSpeed, int ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {

    }

    public void moveUp() {
        setY(getY() - ySpeed);
    }

    public void moveDown() {
        setY(getY() + ySpeed);
    }

    public void moveLeft() {
        setX(getX() - xSpeed);
    }

    public void moveRight() {
        setX(getX() + xSpeed);
    }

    public int getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(int xSpeed, int ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int[] getSpeed() {
        return new int[]{xSpeed, ySpeed};
    }

    //TODO
    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
