package _01_introduction_to_java.excercise;

import java.util.Scanner;

public class DisplayHelloName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
