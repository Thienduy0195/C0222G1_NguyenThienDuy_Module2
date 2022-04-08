package _07_abstract_class_and_interface.practice.comparator;
import java.util.Arrays;
import java.util.Comparator;
import _06_inheritance.excercise.class_circle_and_class_cylinder.Circle;
import _07_abstract_class_and_interface.practice.interface_comparable.ComparableCircle;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new ComparableCircle(6.6, "red");
        circles[1] = new ComparableCircle(2.2, "green");
        circles[2] = new ComparableCircle(3.5, "indigo");

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
