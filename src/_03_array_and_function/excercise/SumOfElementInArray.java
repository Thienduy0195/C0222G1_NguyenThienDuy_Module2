package _03_array_and_function.excercise;

import java.util.Scanner;

public class SumOfElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, n;
        System.out.println("Enter the number of row in array: ");
        m = scanner.nextInt();
        System.out.println("Enter the number of columns in array: ");
        n = scanner.nextInt();

        int [][] array = new int[m][n];

        System.out.println("Enter the elements into array: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter the array[" + i + "][" + j + "]:");
                array[i][j] = scanner.nextInt();
            }
        }
        int index;
        do {
            System.out.println("Please enter the index of the column in the multi-dimensional array");
            index = scanner.nextInt();
            if (index >= n)
                System.out.println("the multi-dimensional array is not includes the column at index " + index);
        } while (index >= n);
        int sum = 0;
        for (int i = 0; i <array.length ; i++) {
            sum+=array[i][index];
        }
        System.out.println("total of the elements in columns " + index + " is: " + sum);
    }
}
