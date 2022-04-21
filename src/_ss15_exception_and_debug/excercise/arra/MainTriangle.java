package _ss15_exception_and_debug.excercise.arra;

import java.util.Scanner;

public class MainTriangle {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        double s1 = inputSide("first");
        double s2 = inputSide("second");
        double s3 = inputSide("third");

        checkTotal(s1, s2, s3);
    }

    private static double inputSide(String str) {
        double s = 0;
        boolean check = true;
        while (check) {
            try {
                check = false;
                System.out.println("Enter the " + str + " side of the triangle:");
                s = Double.parseDouble(input.nextLine());
                if (s <= 0) {
                    throw new IllegalTriangleException("Please enter the positive number");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number:");
                check = true;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
                check = true;
            }
        }
        return s;
    }

    public static void checkTotal(double x, double y, double z) {
        try {
            if (x + y < z || x + z < y || y + z < x) {
                throw new IllegalTriangleException("Invalid 3 edges");
            } else {
                System.out.println("The triangle with three side: Side1 = " + x + " - Side2 = " + y + " - Side3 = " + z);
            }
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}