package _01_introduction_to_java.practice;

import java.util.Scanner;

public class IbmCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float bmi, height, weight;
        System.out.print("Enter your height (in meter):");
        height = scanner.nextFloat();
        System.out.print("Enter weight (in kilogram):");
        weight = scanner.nextFloat();
        bmi = weight / height / height;
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");;
        if (bmi<18) {
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        } else if (bmi < 25.0)
                System.out.printf("%-20.2f%s", bmi, "Normal");
            else if (bmi < 30.0)
                System.out.printf("%-20.2f%s", bmi, "Overweight");
            else
                System.out.printf("%-20.2f%s", bmi, "Obese");
        }
    }
