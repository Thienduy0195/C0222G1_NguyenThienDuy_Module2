package _ss11_stack_and_queue.excercise.check_the_brackets_in_the_expression;

import java.util.Stack;

public class CheckTheBracket {

    public CheckTheBracket() {
    }
    public static Stack<String> stackSym = new Stack<>();

    public void resultOfCheck(String string){
        String[] arr = string.split("");
        boolean check = true;
        for (int i = 0; i < arr.length; i++) {
            if (!checkSym(arr[i])) {
                check = false;
                break;
            }
        }
        if (stackSym.isEmpty() && check) {
            System.out.println("WELL");
        } else {
            System.out.println("NOT WELL");
        }
    }

    public static boolean checkSym(String element) {
        if (element.equals("(")) {
            stackSym.push(element);
            return true;
        } else if (element.equals(")")) {
            if (stackSym.isEmpty()) {
                return false;
            } else {
                stackSym.pop();
                return true;
            }
        }else{
            return true;
        }
    }
}
