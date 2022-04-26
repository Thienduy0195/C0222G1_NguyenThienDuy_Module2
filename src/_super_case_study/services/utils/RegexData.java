package _super_case_study.services.utils;

import java.util.Scanner;

public class RegexData {
    public static final String REGEX_STR = "[A-Z][a-z]+";
    public static final String REGEX_ID_VILLA = "(SVVL)[-][\\d]{4}";
    public static final String REGEX_ID_HOUSE = "(SVHO)[-][\\d]{4}";
    public static final String REGEX_ID_ROOM = "(SVRO)[-][\\d]{4}";
    public static final String REGEX_AMOUNT = "^[1-9]|([1][0-9])|(20)$";
    public static final String REGEX_INT = "^[1-9]|([1][0-9])$";
    public static final String REGEX_AREA = "^([3-9]\\d|[1-9]\\d{2,})$";

    static Scanner scanner = new Scanner(System.in);
    public static String regexData(String input, String regex, String error){
        boolean check = true;
        do {
            if (input.matches(regex)){
                check = false;
            }else{
                System.out.println(error);
                input = scanner.nextLine();
            }
        }while (check);
        return input;
    }
    private String inputID(){
        System.out.println("Please enter the ID of service:");
        return RegexData.regexData(scanner.nextLine(), REGEX_ID_VILLA, "You entered the wrong service ID format, the service ID must be in the format SVXX-YYYY ");
    }

}
