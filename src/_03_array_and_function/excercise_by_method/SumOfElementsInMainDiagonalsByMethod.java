package _03_array_and_function.excercise_by_method;
import java.util.Scanner;

public class SumOfElementsInMainDiagonalsByMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int [][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Enter the array[" + i + "][" + j + "]:");
                arr[i][j] = input.nextInt();
            }
        }
        sumOfElementsInMainDiagonals(arr);
    }

    public static void sumOfElementsInMainDiagonals(int [][] array) {
        int sum1 = 0;
        int sum2 = 0;
        int i, j;
        for (i = 0, j = array.length -1; i < array.length; i++, j--) {
            sum1 += array[i][i];
            sum2 += array[i][j];

        }
        System.out.println("The sum of the elements on the first diagonals is: " + sum1);
        System.out.println("The sum of the elements on the second diagonals is: " + sum2);
    }
}
