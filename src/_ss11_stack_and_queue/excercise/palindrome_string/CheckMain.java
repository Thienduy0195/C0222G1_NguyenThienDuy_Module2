package _ss11_stack_and_queue.excercise.palindrome_string;


public class CheckMain {
    public static void main(String[] args) {
     Palindrome palindrome = new Palindrome();
     String  str = "Able was I ere I saw Elba";
     String newString = "Nguyen Thien Duy";
     palindrome.check(str);
     palindrome.check(newString);
    }
}

