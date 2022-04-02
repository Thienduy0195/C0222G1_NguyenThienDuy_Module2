package _03_array_and_function.excercise;
import java.util.Scanner;
public class CountingTheCharacterInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "counting the character in string, if the string includes it, display the count variable";
        System.out.println("Please enter the character to find out: ");
        char character = input.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==character){
                count++;
            }
        }
        System.out.println("The number of occurrences of " + character + " in the string is: " + count);
    }
}
