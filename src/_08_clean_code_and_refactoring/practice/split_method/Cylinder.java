package _08_clean_code_and_refactoring.practice.split_method;

public class Cylinder {

    public Cylinder() {
    }

    public double getVolume(int radius, int height){
        return getPerimeter(radius) * height + 2 * getBaseArea(radius);
    }

    private static double getBaseArea(int radius){
        return Math.PI * radius * radius;
    }

    private static double getPerimeter(int radius){
        return 2 * Math.PI  * radius;
    }

    public void assertEquals(double expected, double volume){
        boolean check =  expected == volume;
        if (check){
            System.out.println("right!!!");
        } else {
            System.out.println("wrong!!");
        }
    }
}