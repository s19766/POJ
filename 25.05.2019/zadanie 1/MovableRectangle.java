/**
 * @author Rafał Sochacki s20047
 * @author Damian Egert s19766
 */
public class MovableRectangle implements Movable {

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }


    public void moveUp() {
        topLeft.setY(topLeft.getY() - topLeft.getYSpeed());
        bottomRight.setY(bottomRight.getY() - bottomRight.getYSpeed());
    }

    public void moveDown() {
        topLeft.setY(topLeft.getY() + topLeft.getYSpeed());
        bottomRight.setY(topLeft.getY() + bottomRight.getYSpeed());
    }

    public void moveLeft() {
        topLeft.setX(topLeft.getX() - topLeft.getXSpeed());
        bottomRight.setX(bottomRight.getY() - bottomRight.getXSpeed());
    }

    public void moveRight() {
        topLeft.setX(topLeft.getX() + topLeft.getXSpeed());
        bottomRight.setX(bottomRight.getX() + bottomRight.getXSpeed());
    }
}
