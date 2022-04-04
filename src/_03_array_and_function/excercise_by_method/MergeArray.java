package _03_array_and_function.excercise_by_method;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] firstArray= new int[6];
        int[] secondArray = new int[7];
        int [] mainArray;
        for (int i = 0; i < firstArray.length; i++) {
            System.out.println("Enter element " + (i + 1) + " of the first array: ");
            firstArray[i] = input.nextInt();
        }
        for (int i = 0; i < secondArray.length; i++) {
            System.out.println("Enter element " + (i + 1) + " of the second array: ");
            secondArray[i] = input.nextInt();
        }
        System.out.println("The first array is: " + Arrays.toString(firstArray));
        System.out.println("The second array is: " + Arrays.toString(secondArray));
        int length = firstArray.length + secondArray.length;
        mainArray = new int[length];
        int a, b, i;
        for (a = i = 0; i < firstArray.length; i++) {
            mainArray[a] = firstArray[i];
            a++;
        }
        for (b = firstArray.length, i = 0; b < length; b++) {
            mainArray[b] = secondArray[i];
            i++;
        }
        System.out.println("The new array is: " + Arrays.toString(mainArray));
    }
}
