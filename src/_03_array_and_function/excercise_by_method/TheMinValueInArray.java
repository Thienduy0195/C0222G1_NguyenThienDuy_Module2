package _03_array_and_function.excercise_by_method;

import java.util.Arrays;
import java.util.Scanner;

public class TheMinValueInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of array: ");
        int size = input.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element at index " + i);
            array[i]=input.nextInt();
        }
        System.out.println("The array is: " + Arrays.toString(array));
        int min = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("The min value in array is: " + min);
    }
}
