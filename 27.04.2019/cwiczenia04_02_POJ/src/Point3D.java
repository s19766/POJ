public class Point3D extends  Point2D {

    private float z = 0.0f;

    public Point3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    public Point3D(){
    }

    public float getZ(){
        return z;
    }

    public void setZ(float newZ){
        z = newZ;
    }

    public void setXYZ(float newX, float newY, float newZ){
        setX(newX);
        setY(newY);
        z = newZ;
    }

    public float[] getXYZ(){
        float[] values = {getX(), getY(), getZ()};
        return values;
    }

    @Override
    public String toString(){
        return "(" + getX() + "," + getY() + "," + z + ")";
    }
}
