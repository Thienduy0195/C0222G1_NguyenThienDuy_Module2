package _super_case_study.utils.regex;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexData {
    static Scanner scanner = new Scanner(System.in);
    public static final String REGEX_STR = "[A-Z][a-z1-9]+"; //check service name,
    public static final String REGEX_NAME = "^([A-Za-z]+)((\\s{1}[A-Za-z]+){1,})$"; // regex person name
    public static final String REGEX_FREE_STR = "[A-Z a-z]+"; // check free service of facility room
    public static final String REGEX_ID_PERSON = "[0-9]+"; // check id of customer and employee
    public static final String REGEX_ID_CARD = "^[0-9]{5,20}$"; // check identity card of person
    public static final String REGEX_PHONE_NUMBER = "^(84|0[3|5|7|8|9])+([0-9]{8})$"; // check phone number of person
    public static final String REGEX_EMAIL = "^[A-Za-z0-9+_.-]+@(.+)$"; // check email of person
    public static final String REGEX_ID_VILLA = "^(SVVL)[-][\\d]{4}$"; //check id of facility villa
    public static final String REGEX_ID_HOUSE = "^(SVHO)[-][\\d]{4}$";//check id of facility house
    public static final String REGEX_ID_ROOM = "^(SVRO)[-][\\d]{4}$";//check id of facility room
    public static final String REGEX_AMOUNT = "^[1-9]|([1][0-9])|(20)$"; //check the max number of person can be in a facility
    //    public static final String REGEX_INT = "^[1-9]|([1][0-9])$";
    public static final String REGEX_AREA = "^([3-9]\\d|[1-9]\\d{2,})$"; //check the usable area of object (double)
    public static final String REGEX_POSITIVE_NUMBER = "^\\d+$";
    public static final String REGEX_BIRTH_DAY = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|" +
            "(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\" +
            "3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|" +
            "^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

    public static String regexData(String input, String regex, String error) {
        boolean check = true;
        do {
            if (input.matches(regex)) {
                check = false;
            } else {
                System.err.println(error);
                input = scanner.nextLine();
            }
        } while (check);
        return input;
    }

    public static String regexAge(String temp) {
        boolean check = true;
        while (check) {
            try {
                if (Pattern.matches(REGEX_BIRTH_DAY, temp)) {
                    check = false;
                    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //chuy???n v??? ?????nh d???ng ng??y/th??ng n??m
                    LocalDate age = LocalDate.parse(temp, dateTimeFormatter); // ??p ki???u temp nh???p v??o theo format ng??y/th??ng/n??m
                    LocalDate now = LocalDate.now();
                    int currentAge = Period.between(age, now).getYears();
                    if (currentAge < 100 && currentAge > 18) {
                        return temp;
                    } else {
                        throw new AgeException("The age must be less than 100 and more than 18!!");
                    }
                } else {
                    throw new AgeException("You've entered the wrong format of date of birth information! Example: 02/02/2005, 11/09/1995...");
                }
            } catch (AgeException e) {
                System.err.println(e.getMessage());
                temp = scanner.nextLine();
            }
        }
        return temp;
    }
}

