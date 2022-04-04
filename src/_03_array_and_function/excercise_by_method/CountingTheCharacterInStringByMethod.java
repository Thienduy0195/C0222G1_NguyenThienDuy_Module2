package _03_array_and_function.excercise_by_method;
import java.util.Scanner;

public class CountingTheCharacterInStringByMethod {
    public static void main(String[] args) {
        String str1 = "counting the character in string, if the string includes it, display the count variable";
        countTheCharacter(str1);
    }
    public static void countTheCharacter(String str) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the character to find out: ");
        char x = input.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==x){
                count++;
            }
        }
        System.out.println("The numbers of character " + x + " in the string is: " + count);
    }
}
