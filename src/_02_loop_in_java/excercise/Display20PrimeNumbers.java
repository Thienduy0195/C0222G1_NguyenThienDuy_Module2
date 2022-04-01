package _02_loop_in_java.excercise;

import java.util.Scanner;

public class Display20PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int count = 1;
        while(count<=20){
            boolean check = true;
            if(number<2){
                check = false;
            } else {
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        check = false;
                        break;
                    }
                }
            }
            if(check) {
                System.out.println(number + " is the prime number");
                count++;
            }
            number++;
        }
    }
}
