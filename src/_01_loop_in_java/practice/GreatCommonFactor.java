package _01_loop_in_java.practice;

import java.util.Scanner;

public class GreatCommonFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter the first number:");
        a = input.nextInt();
        System.out.println("Enter the second number:");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            if (a == b) {
                System.out.println("There is no great common factor");
            } else {
                System.out.println("The great common factor is : " + Math.max(a, b));
            }
        } else {
            boolean check = false;
            int n = 1;
            for (int i = 1; i < Math.min(a, b); i++) {
                if (a % i == 0 && b % i == 0) {
                    check = true;
                    n = i;
                }
            }
            if (check) {
                System.out.println(n + " is the great common factor of " + a + " and " + b);
            }
        }
    }
}
