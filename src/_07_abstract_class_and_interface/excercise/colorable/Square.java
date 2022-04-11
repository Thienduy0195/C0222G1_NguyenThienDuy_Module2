package _07_abstract_class_and_interface.excercise.colorable;

public class Square extends Shape implements Colorable {
    private double size;

    @Override
    public double getArea() {
        return size * size;
    }

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
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
