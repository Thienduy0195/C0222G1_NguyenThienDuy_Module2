package _ss15_exception_and_debug.practice.array_index_out_of_founds_exception;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.createRandom();

        Scanner input = new Scanner(System.in);
        System.out.println("\nPlease enter the index of a random element: ");
        int x = input.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
    public Integer [] createRandom(){
        Random random = new Random();
        Integer [] array = new Integer[100];
        System.out.println("List of elements in array:");
        for (int i = 0; i <array.length ; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        return array;
    }
}
