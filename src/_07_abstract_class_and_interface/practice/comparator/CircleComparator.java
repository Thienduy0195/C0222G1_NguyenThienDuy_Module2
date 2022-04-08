package _07_abstract_class_and_interface.practice.comparator;

import java.util.Arrays;
import java.util.Comparator;
import _06_inheritance.excercise.class_circle_and_class_cylinder.Circle;
public class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }

}