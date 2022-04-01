package _03_array_and_function.practice;

import java.util.Scanner;

public class TheRichestMan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int [] money ;
        do {
            System.out.println("Please enter the size of array:");
            size = input.nextInt();
            if (size>20){
                System.out.println("Size does not exceed 20");
            }
        }while (size>20);
        money = new int[size];
        for (int i = 0; i < size ; i++) {
            System.out.println("Please enter the values " + (i+1) + " into array");
            money[i]= input.nextInt();
        }
        System.out.print("Property list: ");
        for (int j = 0; j < money.length; j++) {
            System.out.print(money[j] + "\t");
        }
        System.out.println();
        int max = money[0];
        int index = 1;
        for (int i = 1; i < money.length ; i++) {
            if (money[i]>max){
                max = money[i];
                index = i+1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position "  + index);
    }
}
