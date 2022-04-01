package _03_array_and_function.excercise;
import java.util.Scanner;
public class SumOfElementsInMainDiagonals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Enter the array[" + i + "][" + j + "]:");
                array[i][j] = input.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i][i];
        }
        System.out.println("The sum of the elements on diagonals is: " + sum);
    }
}
