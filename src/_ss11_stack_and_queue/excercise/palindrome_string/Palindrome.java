package _ss11_stack_and_queue.excercise.palindrome_string;

import java.util.*;

public class Palindrome {
    public Palindrome() {
    }

    public void check(String string) {
        String newString = string.toLowerCase();

        String [] arr = newString.split("");

        Stack<String> stack = new Stack<>();

        for (int i = 0; i <arr.length ; i++) {
            stack.push(arr[i]);
        }
        int num = arr.length/2 + arr.length%2;
        String [] newArray = new String [num];
        boolean check = true;
        for (int i = 0; i < num; i++) {
            newArray[i] = stack.pop();
            if (!arr[i].equals(newArray[i])) {
                check = false;
                break;
            }
        }
        if (!check){
            System.out.println("String is not a Palindrome!");
        }else {
            System.out.println("String is a Palindrome!");
        }
    }
}
