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