package _07_abstract_class_and_interface.excercise.resizeable;

public class CircleRectangleSquareTest {
    public static void main(String[] args) {
        //thử resize một đối tượng circle được khai báo
        System.out.println("CIRCLE");
        Circle circle = new Circle(1.0);
        System.out.println("Circle before resizing: " + circle);
        circle.resize(70);
        System.out.println("Circle after resizing: " + circle);
        //thử resize một đối tượng rectangle được khai báo
        System.out.println("RECTANGLE");
        Rectangle rectangle = new Rectangle(1.0,2.0);
        System.out.println("Rectangle before resizing: " + rectangle);
        rectangle.resize(70);
        System.out.println("Rectangle after resizing: " + rectangle);
//        thử resize một đối tượng Square được khai báo
        System.out.println("SQUARE");
        Square square = new Square(1.0);
        System.out.println("Square before resizing: " + square);
        square.resize(70);
        System.out.println("Square after resizing: " + square);
    }
}
