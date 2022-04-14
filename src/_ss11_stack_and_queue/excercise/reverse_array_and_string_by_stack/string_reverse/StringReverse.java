package _ss11_stack_and_queue.excercise.reverse_array_and_string_by_stack.string_reverse;

import java.util.Stack;

public class StringReverse {
    public StringReverse() {
    }

    public static Stack<String> stack = new Stack<>();

    public void reverseArr( String str ){
        String [] array = str.split(" ");
        for (String s : array) {
            stack.push(s);
        }
        String [] newArray = new String [array.length];
        for (int i = 0; i <array.length ; i++) {
            newArray[i] = stack.pop();
        }
        print(newArray);
    }

    public void print(String[] arr){
        for (String item: arr
        ) {
            if (item != null){
                System.out.println(item);
            }
        }
    }


}
