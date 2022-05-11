package added_excercises.hospital_excercise.utils;

import _super_case_study.utils.regex.AgeException;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexMedical {
    static Scanner scanner = new Scanner(System.in);

    public static final String REGEX_MEDICAL_CODE = "^(BA)[-][\\d]{3}$"; //check id of facility villa
    public static final String REGEX_PATIENT_NAME = "^(BN)[-][\\d]{3}$"; //check id of facility villa
    public static final String REGEX_DAY = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|" +
            "(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\" +
            "3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|" +
            "^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
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

    //CHECK THE CHECK OUT DAY
//    public String checkEndDate(String startDay) {
//        String endDay = regexInput(scanner.nextLine(), REGEX_DAY, "error at regex end day");
//        while (true) {
//            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");  //day/month/year format
//            LocalDate start = LocalDate.parse(startDay, dateTimeFormatter); // casting temp theo format day/month/year
//            LocalDate end = LocalDate.parse(endDay, dateTimeFormatter); // casting temp theo format day/month/year
//            if (start.isBefore(end)) {
//                return endDay;
//            } else {
//                System.out.println("The day to check out must be after the day to check in, please try again!!");
//                endDay = regexInput(scanner.nextLine(), REGEX_DAY, "error at regex end day");
//            }
//        }
//    }

    public static String regexDate(String temp) {
        while (true) {
            try {
                if (Pattern.matches(REGEX_DAY, temp)) {
                    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //chuyển về định dạng ngày/tháng năm
                    LocalDate age = LocalDate.parse(temp, dateTimeFormatter); // ép kiểu temp nhập vào theo format ngày/tháng/năm
                    LocalDate now = LocalDate.now();
                    if (age.isAfter(now)) {
                        return temp;
                    } else {
                        throw new AgeException("phải nhập ngày sau ngày hiện tại");
                    }
                } else {
                    throw new AgeException("You've entered the wrong format of date of birth information! Example: 02/02/2005, 11/09/1995...");
                }
            } catch (AgeException e) {
                System.err.println(e.getMessage());
                temp = scanner.nextLine();
            }
        }
    }

    public static String checkStartEndDate(String startDay) {
        String endDay = regexDate(scanner.nextLine());
        boolean check = true;
        while (check) {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");  //day/month/year format
            LocalDate start = LocalDate.parse(startDay, dateTimeFormatter); // casting temp theo format day/month/year
            LocalDate end = LocalDate.parse(endDay, dateTimeFormatter); // casting temp theo format day/month/year
            int current = Period.between(start, end).getDays();
            if (current>0) {
                check = false;
            } else {
                System.out.println("The day to check out must be after the day to check in, please try again!!");
                endDay = regexDate(scanner.nextLine());
            }

        }
        return endDay;
    }
}
