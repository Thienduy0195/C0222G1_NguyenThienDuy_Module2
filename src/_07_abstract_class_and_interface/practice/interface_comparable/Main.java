package _07_abstract_class_and_interface.practice.interface_comparable;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(6.6, "red");
        circles[1] = new ComparableCircle(2.2, "green");
        circles[2] = new ComparableCircle(3.5, "indigo");

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
