package _ss11_stack_and_queue.excercise.reverse_array_and_string_by_stack.reverse_array;

import java.util.Arrays;

public class TestReverseArray {
    public static void main(String[] args) {
        ReverseArray reverseArray = new ReverseArray();
        System.out.println("Array before reversing: ");
        int[] array = {1, 2, 3, 4, 5, 7, 9, 15, 19, 2, 66};
        System.out.println(Arrays.toString(array));
        System.out.println("Array after reversing: ");
        reverseArray.reverseArr(array);
    }
}
