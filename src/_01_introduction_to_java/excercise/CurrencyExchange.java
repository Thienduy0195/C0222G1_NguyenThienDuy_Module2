package _01_introduction_to_java.excercise;

import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vnd = 23000;
        double usd;
        System.out.print("Please enter the USD amount:");
        usd = sc.nextDouble();
        double exchange = usd * vnd;
        System.out.println("Giá trị Việt Nam đồng bằng: " + exchange);
    }
}
