package _06_inheritance.excercise.class_point2d_and_point3d;

public class Point3D extends Point2D{
    private float z = 0.0f;
    private float a;
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {

    }
    public Point3D(float a) {
        this.a = a;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        this.z = z;
    }
    public float [] getXYZ() {
        float [] array = {getX(),getY(),getZ()};
        return array;
    }

    @Override
    public String toString() {
        return super.toString() + " z=" + z + " a=" + a;
    }
}
