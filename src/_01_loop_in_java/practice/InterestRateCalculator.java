package _01_loop_in_java.practice;

import java.util.Scanner;

public class InterestRateCalculator {
    public static void main(String[] args) {
        double money;
        int month;
        double interestRate;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the money");
        money = input.nextDouble();
        System.out.println("Please enter the month");
        month = input.nextInt();
        System.out.println("Please enter the interestRate");
        interestRate = input.nextDouble();
        double totalRate = 0;
        for (int i = 1; i <= month; i++) {
            totalRate += money*(interestRate/100/12);
        }
        System.out.println("Total of interest rate is: " + totalRate);
    }
}
