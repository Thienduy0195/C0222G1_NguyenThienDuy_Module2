package _super_case_study.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexBookingAndContract extends RegexData {

    Scanner input = new Scanner(System.in);

    public String regexStartEndDate(String temp) {
        boolean check = true;
        while (check) {
            try {
                if (Pattern.matches(REGEX_BIRTH_DAY, temp)) {
                    check = false;
                    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //day/month/year format
                    LocalDate day = LocalDate.parse(temp, dateTimeFormatter); // casting temp theo format day/month/year
                    LocalDate now = LocalDate.now();
                    int current = Period.between(day, now).getDays();
                    if (current>0) {
                        check = true;
                        throw new AgeException("The day to check out must be the same of after the day to check in!!");
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

    public String checkStartEndDate(String startDay) {
        String endDay = regexStartEndDate(input.nextLine());
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
                        endDay = regexStartEndDate(input.nextLine());
                }

        }
        return endDay;
    }
}
