package _04_class_and_object.practice;

import java.util.Scanner;

public class RectangleClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the width: ");
        double width = input.nextDouble();
        System.out.println("Please enter the height: ");
        double height = input.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Your rectangle \n" + rectangle.display());
        System.out.println("The area of rectangle: " + rectangle.getArea());
        System.out.println("The perimeter of rectangle: " + rectangle.getPerimeter());
    }
    public static class Rectangle {
        double width, height;
        public Rectangle(){

        }
        public Rectangle(double wight, double height){
            this.width = wight;
            this.height = height;
        }
        public double getArea(){
            return this.width * this.height;
        }
        public double getPerimeter(){
            return (this.width + this.height)*2;
        }
        public String display(){
            return "Rectangle(width=" + width + ", height="+height + ")";
        }
    }
}
