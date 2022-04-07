package _06_inheritance.excercise.class_point_and_sub;

public class Point {
    protected float x = 0.0f;
    protected float y = 0.0f;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setX(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float [] getXY() {
         float [] array ={getX(), getY()};
         return array;
    }

    @Override
    public String toString() {
        return "x=" + x +
                ", y=" + y;
    }
}
