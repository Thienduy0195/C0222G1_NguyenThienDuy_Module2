package _ss19_string_and_regex.excercise.validate_class_name;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateClassName {
    static Scanner input = new Scanner(System.in);


    public static void validateName() {
        Pattern pattern = Pattern.compile("^[CPA]\\d{4}[GHIKLM]$");
        while (true){
            System.out.println("Please enter the class name: ");
            String name = input.nextLine();
            if(pattern.matcher(name).find()){
                System.out.println("This class name is validate!");
                break;
            }else {
                System.out.println("The entered class name is invalidate, please enter the different one!");
            }
        }
    }

}
