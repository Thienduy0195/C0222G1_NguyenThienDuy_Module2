package _03_array_and_function.excercise;
import java.util.Scanner;
public class TheLargestElementInArray {
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
                System.out.print("Enter the array[" + i + "]["+ j + "]:");
                array[i][j] = scanner.nextInt();
            }
        }
        int max = array[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("The largest element in array is: " + max);
    }
}
