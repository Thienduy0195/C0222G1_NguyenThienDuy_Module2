package _ss11_stack_and_queue.excercise.reverse_array_and_string_by_stack.reverse_array;

import java.util.Stack;

public class ReverseArray<I extends Number> {

    public ReverseArray() {
    }

    public static Stack<Number> stack = new Stack<>();

    public void reverseArr( int [] array ){
        for (int i = 0; i < array.length ; i++) {
            stack.push(array[i]);
        }
        Number [] newArray = new Number [array.length];
        for (int i = 0; i <array.length ; i++) {
            newArray[i] = stack.pop();
        }
        print(newArray);
    }

    public void print(Number[] arr){
        for (Number item: arr
             ) {
            if (item != null){
                System.out.print(item + " ");
            }
        }
    }
}
