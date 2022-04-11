package _07_abstract_class_and_interface.excercise.colorable;

public class Rectangle extends Shape {
    private double width= 1.0;
    private double length= 1.0;

    @Override
    public double getArea() {
        return width * length;
    }

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "A Rectangle with width= " + width + " and length= " + length + ", which is a subclass of " + super.toString();
    }

}
