package _03_array_and_function.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //khai báo mảng và độ dài mảng
        int size;
        int [] array ;
        //kiểm tra đầu vào, yêu cầu độ dài mảng phải <= 20
        do{
            System.out.println("Please enter the size:");
            size = input.nextInt();
            if (size>20){
                System.out.println("Size does not exceed 20");
            }
        }while(size>20);
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i+1) + ": ");
            array[i]= input.nextInt();
        }
        //in ra mảng đã duyệt
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
//        System.out.println(Arrays.toString(array)); cũng có tính năng tương tự
        for (int i = 0; i < array.length/2 ; i++) {
            int temp = array[array.length-1-i];
            array[array.length-1-i] = array[i];
            array[i] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
