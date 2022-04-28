package _super_case_study.services.utils;


import java.util.regex.Pattern;

public class RegexPersonData extends RegexData {

    public String inputDateOfBirth() {
        return regexAge(scanner.nextLine());
    }

    public String inputPersonId() {
        return regexData(scanner.nextLine(), REGEX_ID_PERSON, "The ID must be a contiguous string of characters. Example: Cs002, ep056... ");
    }

    public String inputPersonName() {
        return regexData(scanner.nextLine(), REGEX_NAME, "The ID must be a contiguous string of characters. Example: Cs002, ep056... ");
    }


    public boolean inputGender(String temp) {
        boolean check = true;
        boolean gender = false;
        while (check) {
            if (Pattern.matches(REGEX_GENDER, temp)) {
                if (temp.equals("1")) {
                    gender = true;
                }
                check = false;
            }else {
                System.err.println("Please enter the number [1] or [2] !");
            }
        }
        return gender;
    }

    public String inputPersonIdCard() {
        return regexData(scanner.nextLine(), REGEX_ID_CARD, "The identity card must be a number with min at 5 character and max at 20 character ");
    }

    public String inputPhoneNumber() {
        return regexData(scanner.nextLine(), REGEX_PHONE_NUMBER, "The phone number must be a number, min at 10 character and max at 11 character. Example: 0917579123, 0905568258, ... ");
    }

    public String inputEmail() {
        return regexData(scanner.nextLine(), REGEX_EMAIL, "You've entered the wrong format of email. Example: nguyenthienduy@thaco.com.vn, thienduy0195@gmail.com ... ");
    }

    public String inputSalary() {
        return regexData(scanner.nextLine(), REGEX_POSITIVE_NUMBER, "The salary must be positive number. Please try again!");
    }

//    public String formatName(String name){
//
//    }
}
