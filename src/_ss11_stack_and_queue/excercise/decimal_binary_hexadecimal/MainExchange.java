package _ss11_stack_and_queue.excercise.decimal_binary_hexadecimal;

import java.util.Scanner;

public class MainExchange {
    public static void main(String[] args) {
        Exchange exchange = new Exchange();
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("Enter the number to exchange:");
            int number = input.nextInt();
            exchange.decimalToBinary(number);
            System.out.println();
        }
    }
}
