package _07_abstract_class_and_interface.excercise.resizeable;

public class Square extends Shape {
    private double size;
    public Square() {
    }

    public Square(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "A Square with side=" + size + ", which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        setSize(getSize()*percent/100);
    }
}
