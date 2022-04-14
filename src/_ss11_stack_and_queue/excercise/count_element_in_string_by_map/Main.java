package _ss11_stack_and_queue.excercise.count_element_in_string_by_map;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        TreeMapCount treeMapCount = new TreeMapCount();
        System.out.println("Please enter the String: ");
        String string = sc.nextLine().toLowerCase();
        treeMapCount.countString(string);
    }
}