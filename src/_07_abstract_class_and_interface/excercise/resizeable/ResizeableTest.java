package _07_abstract_class_and_interface.excercise.resizeable;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[3];
        shapes[0]=new Circle(5.0);
        shapes[1]=new Rectangle(1.0,2.0);
        shapes[2]=new Square(5.0);
        System.out.println("Array of shapes before resizing: ");
        for (Shape item: shapes) {
            System.out.println(item);
        }
        System.out.println("Array of shapes after resizing: ");
        for (Shape item: shapes) {
            item.resize(50);
            System.out.println(item);
        }
    }
}
