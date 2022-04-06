package _05_access_modifier_static.excercise.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle newCircle1 = new Circle();
        Circle newCircle2 = new Circle(5);
        System.out.println(newCircle2.getRadius());
        System.out.println(newCircle1.getArea());
        System.out.println(newCircle1.getRadius());
    }
}
