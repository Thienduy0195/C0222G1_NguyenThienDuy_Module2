package _07_abstract_class_and_interface.excercise.colorable;

public class ColorableTest {
    public static void main(String[] args) {
        int size =8;
        Shape[] shapes = new Shape[size];
        shapes[0]=new Circle(5.0);
        shapes[1]=new Rectangle(1.0,2.0);
        shapes[2]=new Square(5.0);
        shapes[3]=new Circle(5.0);
        shapes[4]=new Rectangle(1.0,2.0);
        shapes[7]=new Square(10.0);
        shapes[5]=new Circle(5.0);
        shapes[6]=new Rectangle(1.0,2.0);

        for (int i = 0; i < size ; i++) {
            if(shapes[i] instanceof Square){
                System.out.println("Shape at index " + i + " is a Colorable:");
                ((Square) shapes[i]).howToColor();
            }
        }
    }
}
