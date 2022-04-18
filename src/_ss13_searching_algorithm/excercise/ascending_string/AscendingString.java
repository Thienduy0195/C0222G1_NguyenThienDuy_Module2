package _ss13_searching_algorithm.excercise.ascending_string;

import java.util.LinkedList;
import java.util.Scanner;

public class AscendingString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string = input.nextLine();

        LinkedList<Character> list = new LinkedList<>();
        list.add(string.charAt(0));

        for (int j = 1; j < string.length(); j++) {
            if (string.charAt(j) > list.getLast()) {
                list.add(string.charAt(j));
            }
        }
        for (Character ch : list) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
/*********************************************************************************
 * 	Tính toán độ phức tạp của bài toán:
 *  1 câu lệnh = 1
 * 	1 vòng lặp thêm ký tự vào list = n;
 * 	1 vòng lặp hiển thị phần tử trong list = n;
 *  T(n) = (1 + n + n);
 *  T(n) = O(n)
 * 	=> Độ phức tạp bài toán này là O(n)
 *********************************************************************************/