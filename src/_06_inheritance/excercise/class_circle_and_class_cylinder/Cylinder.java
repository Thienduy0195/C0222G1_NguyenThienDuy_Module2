
package _06_inheritance.excercise.class_circle_and_class_cylinder;

public class Cylinder extends Circle {
    private double height = 1.0;
    public double getVolume(){
        return this.height * super.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                "} " + super.toString();
    }
}