package test_all_exam.utils;

import _super_case_study.utils.regex.AgeException;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class NewRegex {
    static Scanner scanner = new Scanner(System.in);
    public static final String REGEX_ID_VILLA = "^(SVVL)[-][\\d]{4}$"; //check id of facility villa
    public static final String REGEX_ID_HOUSE = "^(SVHO)[-][\\d]{4}$";//check id of facility house
    public static final String REGEX_ID_ROOM = "^(SVRO)[-][\\d]{4}$";//check id of facility room
    public static final String REGEX_ID_CUSTOMER = "^(CUS)[-][\\d]{4}$";//check id of facility room
    public static final String REGEX_DAY = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|" +
            "(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\" +
            "3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|" +
            "^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    public static final String REGEX_NAME = "^([A-Z][a-z]+)((\\s{1}[A-Za-z]+){1,})$"; // regex person name
    public static final String REGEX_FACILITY_NAME = "^[A-Z][a-z0-9]+$";

    public static final String REGEX_POSITIVE_NUMBER = "^\\d+$";

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

    public static String checkStartDate(String temp) {
        temp = regexInput(scanner.nextLine(), REGEX_DAY, "Wrong format for the date. Example: 02/02/2022, 05/07/2022...");
        boolean check = true;
        while (check) {
            try {
                check = false;
                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //chuyển về định dạng ngày/tháng năm
                LocalDate tempDate = LocalDate.parse(temp, dateTimeFormatter); // ép kiểu temp nhập vào theo format ngày/tháng/năm
                LocalDate now = LocalDate.now();
                int current = Period.between(now, tempDate).getYears();
                if (current>0) {
                    return temp;
                } else {
                    throw new DateTimeException("The entered day must be the same or after today!!");
                }
            } catch (DateTimeException e) {
                System.err.println(e.getMessage());
                temp = scanner.nextLine();
            }
        }
        return temp;
    }

    public String checkEndDate(String startDay) {
        String endDay = regexInput(scanner.nextLine(), REGEX_DAY, "error at regex end day");
        while (true) {
            try{
                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");  //day/month/year format
                LocalDate start = LocalDate.parse(startDay, dateTimeFormatter); // casting temp theo format day/month/year
                LocalDate end = LocalDate.parse(endDay, dateTimeFormatter); // casting temp theo format day/month/year
                if (start.isBefore(end)) {
                    return endDay;
                } else {
                    System.out.println("The day to check out must be after the day to check in, please try again!!");
                    endDay = regexInput(scanner.nextLine(), REGEX_DAY, "error at regex end day");
                }
            }catch (DateTimeException e){
                System.err.println("Error at date time formatter when format end date!!");
            }
        }
    }

    public static String regexAge(String temp) {
        boolean check = true;
        while (check) {
            try {
                if (Pattern.matches(REGEX_DAY, temp)) {
                    check = false;
                    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //chuyển về định dạng ngày/tháng năm
                    LocalDate age = LocalDate.parse(temp, dateTimeFormatter); // ép kiểu temp nhập vào theo format ngày/tháng/năm
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
