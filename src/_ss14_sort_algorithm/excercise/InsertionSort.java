package _ss14_sort_algorithm.excercise;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of value in array:");
        int size = Integer.parseInt(input.nextLine());
        int[] arr = new int[size];
        System.out.println("Enter " + size + " values of array:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("***ARRAY BEFORE SORTING : ");
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
        insertionSort(arr);
        System.out.println("ARRAY AFTER SORTING: ");
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    public static void insertionSort(int[] array) {
        int x, pos;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
    }
}
