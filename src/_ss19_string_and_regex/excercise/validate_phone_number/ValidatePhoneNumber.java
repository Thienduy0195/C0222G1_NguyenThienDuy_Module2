package _ss19_string_and_regex.excercise.validate_phone_number;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    static Scanner input = new Scanner(System.in);

    public static void validateNumber() {
        Pattern pattern = Pattern.compile("^[(]\\d{2}[)]-[(]0\\d{9}[)]$");
        while (true) {
            System.out.println("Please enter the phone number: ");
            String number = input.nextLine();
            if (pattern.matcher(number).find()) {
                System.out.println("This phone number is validate!");
                break;
            } else {
                System.out.println("The entered phone number is invalidate, please enter the different one!");
            }
        }
    }
}
