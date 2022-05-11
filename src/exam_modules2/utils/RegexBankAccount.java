package exam_modules2.utils;

import _super_case_study.utils.regex.AgeException;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexBankAccount {
    static Scanner scanner = new Scanner(System.in);

    public static final String REGEX_DATE = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|" +
            "(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\" +
            "3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|" +
            "^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
//    public static final String REGEX_DATE = "(([0-2][0-9])|([3][0-1]))[\\/](([0][1-9])|([1][0,2]))[\\/]\\d{4}";

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

    public static double inputDoubleNumber(){
        double num;
        while (true){
            try {
                num = Double.parseDouble(scanner.nextLine());
                if (num>0){
                    return num;
                }else {
                    throw new NumberFormatException("It must be a positive number. Please enter again:");
                }
            }catch (NumberFormatException e){
                System.err.println(e.getMessage());
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

    public static String checkCreateDate(String temp) {
        boolean check = true;
        while (check) {
            try {
                if (Pattern.matches(REGEX_DATE, temp)) {
                    check = false;
                    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //day/month/year format
                    LocalDate day = LocalDate.parse(temp, dateTimeFormatter); // casting temp theo format day/month/year
                    LocalDate now = LocalDate.now();
                    int current = Period.between(day, now).getDays();
                    if (current>0) {
                        check = true;
                        throw new AgeException("The entered day must be equals to or after today!!");
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


    public static String checkSaveDate(String startDay) {
        String endDay = regexInput(scanner.nextLine(), REGEX_DATE,
                "Wrong format. Example: 05/05/2022, 08/12/2022....Please try again:");
        boolean check = true;
        while (check) {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");  //day/month/year format
            LocalDate start = LocalDate.parse(startDay, dateTimeFormatter); // casting temp theo format day/month/year
            LocalDate end = LocalDate.parse(endDay, dateTimeFormatter); // casting temp theo format day/month/year
            int current = Period.between(start, end).getDays();
            if (current>=0) {
                check = false;
            } else {
                System.out.println("\"The date entered must be equals to or after the day to create in, please try again:\"");
                endDay = regexInput(scanner.nextLine(), REGEX_DATE,
                        "Wrong format. Example: 05/05/2022, 08/12/2022....Please try again:");
            }

        }
        return endDay;
    }

}
