package _ss11_stack_and_queue.excercise.decimal_binary_hexadecimal;


import java.util.Stack;

public class Exchange {

    public Exchange() {
    }

    public static Stack<Integer> stack = new Stack<>();

    public void decimalToBinary(int num) {
        int size = 0;
        while (num > 0) {
            stack.push(num % 2);
            num = num/2;
            size++;
        }
        for (int j = 0; j < size && !stack.isEmpty(); j++) {
            System.out.print(stack.pop());
        }
    }
}
