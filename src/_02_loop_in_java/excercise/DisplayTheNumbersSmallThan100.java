package _02_loop_in_java.excercise;

import java.util.Scanner;

public class DisplayTheNumbersSmallThan100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        while(number<100){
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
                System.out.println(number + " is the prime number which smaller than 100");
            }
            number++;
        }
    }
}
