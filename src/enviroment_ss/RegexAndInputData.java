package enviroment_ss;

import _super_case_study.utils.regex.AgeException;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexAndInputData {
    static Scanner scanner = new Scanner(System.in);
    public static final String REGEX_STR = "[A-Z][a-z1-9]+"; //check service name,
    public static final String REGEX_NAME = "^([A-Za-z]+)((\\s{1}[A-Za-z]+){1,})$"; // regex person name
    public static final String REGEX_FREE_STR = "[A-Z a-z]+"; // check free service of facility room
    public static final String REGEX_ID_PERSON = "[0-9]+"; // check id of customer and employee
    public static final String REGEX_ID_CARD = "^[0-9]{5,20}$"; // check identity card of person
    public static final String REGEX_PHONE_NUMBER = "^(84|0[3|5|7|8|9])+([0-9]{8})$"; // check phone number of person
    public static final String REGEX_ID_VILLA = "^(SVVL)[-][\\d]{4}$"; //check id of facility villa
    public static final String REGEX_ID_HOUSE = "^(SVHO)[-][\\d]{4}$";//check id of facility house
    public static final String REGEX_ID_ROOM = "^(SVRO)[-][\\d]{4}$";//check id of facility room
    public static final String REGEX_AMOUNT = "^[1-9]|([1][0-9])|(20)$"; //check the max number of person can be in a facility
    //    public static final String REGEX_INT = "^[1-9]|([1][0-9])$";
    public static final String REGEX_AREA = "^([3-9]\\d|[1-9]\\d{2,})$"; //check the usable area of object (double)

    public static final String REGEX_EMAIL = "^[A-Za-z0-9+_.-]+@(.+)$"; // check email of person

    public static final String REGEX_CODE = "^(SVVL)[-][\\d]{4}$"; //check id of facility villa

    public static final String REGEX_POSITIVE_NUMBER = "^\\d+$";

    public static final String REGEX_PERSON_NAME = "^[A-Z][a-z]*(\\ [A-Z][a-z]*)*$";

    public static final String REGEX_SUBJECT_CODE = "^[B][C][-][A-Z]{4}$";
    public static final String REGEX_VERSION = "^[0-9][.][0-9]$";
    public static final String REGEX_STUDY_TIME = "^\\d+$";
    public static final String REGEX_DATE = "(([0-2][0-9])|([3][0-1]))[\\/](([0][1-9])|([1][0,2]))[\\/]\\d{4}";


    public static final String REGEX_DAY = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|" +
            "(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\" +
            "3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|" +
            "^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

    public static String regexInput(String input, String regex, String error) {
        do {
            if (input.matches(regex)) {
                return input;
            } else {
                System.err.println(error);
                input = scanner.nextLine();
            }
        } while (true);
    }

    public static String inputObjectName(String objectName){
        return regexInput(objectName, REGEX_STR, "It must be an upper case with the first character in word. Example: Villa1, House1...");
    }

    public static String inputPersonName(String personName){
        return regexInput(personName, REGEX_PERSON_NAME, "It must be an upper case with the first character in each word. Example: Will Smith, Jame Bond...");
    }


    public static double inputDoubleNumber(){
        double num;
        while (true){
            try {
                num = Double.parseDouble(scanner.nextLine());
                if (num>0){
                    return num;
                }else {
                    throw new NumberFormatException("It must be a positive number. Please try again!!");
                }
            }catch (NumberFormatException e){
                System.err.println(e.getMessage());
                num = Double.parseDouble(scanner.nextLine());
            }
        }
    }

    public static int inputIntegerNumber(){
        int num;
        while (true){
            try {
                num = Integer.parseInt(scanner.nextLine());
                if (num>0){
                    return num;
                }else {
                    throw new NumberFormatException("It must be a positive number. Please try again!!");
                }
            }catch (NumberFormatException e){
                System.err.println(e.getMessage());
            }
        }
    }

    //CHECK THE DATE
    public static String regexAge(String temp) {
        boolean check = true;
        while (check) {
            try {
                if (Pattern.matches(REGEX_DAY, temp)) {
                    check = false;
                    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate age = LocalDate.parse(temp, dateTimeFormatter);
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

    //CHECK THE CHECK IN DAY
    public static String checkStartDate(String temp) {
        boolean check = true;
        while (check) {
            try {
                temp = regexInput(scanner.nextLine(), REGEX_DAY,
                        "Wrong format for the date. Example: 02/02/2022, 05/07/2022...");
                    check = false;
                    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate tempDate = LocalDate.parse(temp, dateTimeFormatter);
                    LocalDate now = LocalDate.now();
                    int current = Period.between(now, tempDate).getDays();
                    if (current>=0) {
                        return temp;
                    } else {
                        throw new DateTimeException("The entered day must be equals to or after today!!");
                    }
            } catch (DateTimeException e) {
                System.err.println(e.getMessage());
                temp = scanner.nextLine();
            }
        }
        return temp;
    }

//CHECK THE CHECK OUT DAY
    public String checkEndDate(String startDay) {
        String endDay;
        while (true) {
            try{
                endDay= regexInput(scanner.nextLine(), REGEX_DAY,
                        "Wrong format. Example: 05/05/2022, 08/12/2022....Please try again:");
                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate start = LocalDate.parse(startDay, dateTimeFormatter);
                LocalDate end = LocalDate.parse(endDay, dateTimeFormatter);
                int current = Period.between(start,end ).getDays();
                if (current>=0){
                    return endDay;
                } else {
                    System.out.println("The date entered must be equals to or after the day to check in, please try again:");
                }
            }catch (DateTimeException e){
                System.err.println("Error at date time formatter when format end date!!");
            }
        }
    }
}
