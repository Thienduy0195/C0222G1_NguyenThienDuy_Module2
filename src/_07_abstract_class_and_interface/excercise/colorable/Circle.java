package _07_abstract_class_and_interface.excercise.colorable;

public class Circle extends Shape {

    private double radius = 1.0;

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public Circle() {

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public String toString() {
        return "A Circle with radius= " + getRadius() + ", which is a subclass of " + super.toString();
    }

}
