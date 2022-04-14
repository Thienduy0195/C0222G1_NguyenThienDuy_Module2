package _ss11_stack_and_queue.excercise.check_the_brackets_in_the_expression;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        CheckTheBracket checkTheBracket = new CheckTheBracket();
        while (true){
            System.out.println("Enter the string: ");
            String str = input.nextLine();
            checkTheBracket.resultOfCheck(str);
        }
    }
}
