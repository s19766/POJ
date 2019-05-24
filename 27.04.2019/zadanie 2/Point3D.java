// Praca: Damian Eggert

/*
4.3  Ex: Point2D and Point3D
Source: http://www.ntu.edu.sg/home/ehchua/programming/java/J3f_OOPExercises.html
*/

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
        float[] array = {getX(), getY(), getZ()};
        return array;
    }

    @Override
    public String toString(){
        return "(" + getX() + "," + getY() + "," + z + ")";
    }
}
