package _03_array_and_function.excercise_by_method;
import java.util.Scanner;

public class CountingThePassedStudentByMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] arr;
        do {
            System.out.print("Please enter the size of array:");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Enter the mark of student " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
            i++;
        }
        System.out.print("\n The number of students passing the exam is " + countThePassStudents(arr));
    }

    public static int countThePassStudents(int [] array) {
        int count = 0;
        System.out.print("List of mark: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        return count;
    }
}
