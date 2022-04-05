package _04_class_and_object.excercise.quadratic_equation;

import java.util.Scanner;

public class SolveMainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the parameters a: ");
        double a = input.nextDouble();
        System.out.println("Enter the parameters b: ");
        double b = input.nextDouble();
        System.out.println("Enter the parameters c: ");
        double c = input.nextDouble();
        SolveQuadraticEquation calculating = new SolveQuadraticEquation(a,b,c);
        calculating.resolve();
    }
}
