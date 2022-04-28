package _super_ss_testall.test_regex;

import java.util.Scanner;

public class RegexTest {
    static Scanner scanner = new Scanner(System.in);
    public static final String REGEX_STR = "[A-Z][a-z1-9]+"; //check service name,
    public static final String REGEX_FREE_STR = "[A-Z a-z]+"; // check free service of facility room
    public static final String REGEX_ID_PERSON = "[A-Za-z0-9]+"; // check id of customer and employee
    public static final String REGEX_GENDER = "[1]|[2]"; // check boolean for gender of person
    public static final String REGEX_ID_CARD = "^[0-9]{5,20}$"; // check identity card of person
    public static final String REGEX_PHONE_NUMBER= "^[(]\\d{2}[)]-[(]0\\d{9}[)]$"; // check phone number of person
    public static final String REGEX_EMAIL= "^[A-Za-z0-9+_.-]+@(.+)$"; // check email of person
    public static final String REGEX_ID_VILLA = "^(SVVL)[-][\\d]{4}$"; //check id of facility villa
    public static final String REGEX_ID_HOUSE = "^(SVHO)[-][\\d]{4}$";//check id of facility house
    public static final String REGEX_ID_ROOM = "^(SVRO)[-][\\d]{4}$";//check id of facility room
    public static final String REGEX_AMOUNT = "^[1-9]|([1][0-9])|(20)$"; //check the max number of person can be in a facility
    public static final String REGEX_INT = "^[1-9]|([1][0-9])$";
    public static final String REGEX_AREA = "^([3-9]\\d|[1-9]\\d{2,})$"; //check the usable area of object (double)
    public static final String REGEX_POSITIVE_NUMBER = "^\\d+$";
    public static final String REGEX_NAME = "^([A-Za-z]+)((\\s{1}[A-Za-z]+){1,})$";


    public static void main(String[] args) {
        System.out.println("enter test:");
        regexData(scanner.nextLine(), REGEX_EMAIL, "abc");
    }
    public static String regexData(String input, String regex, String error){
        boolean check = true;
        do {
            if (input.matches(regex)){
                System.out.println("true");
                check = false;
            }else{
                System.out.println(error);
                input = scanner.nextLine();
            }
        }while (check);

        return input;
    }
}

