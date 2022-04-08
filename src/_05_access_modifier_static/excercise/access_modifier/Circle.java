package _05_access_modifier_static.excercise.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle(){

    }
    public Circle(double r){
        this.radius = r;
    }


    //    private double getRadius() {
//        return radius;
//    }
//    private double getArea() {
//        return radius * radius * Math.PI;
//    }
    protected double getRadius() {
        return radius;
    }
    protected double getArea() {
        return radius * radius * Math.PI;
    }
}
