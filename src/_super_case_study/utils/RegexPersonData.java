package _super_case_study.utils;


public class RegexPersonData extends RegexData {

    public String inputDateOfBirth() {
        return regexAge(scanner.nextLine());
    }

    public String inputPersonId() {
        return regexData(scanner.nextLine(), REGEX_ID_PERSON, "The ID must be a number, please try again:");
    }

    public String inputPersonName() {
        return regexData(scanner.nextLine(), REGEX_NAME, "Wrong format of name. Example: Nguyen Thien Duy, Cristiano Smith... ");
    }


    public boolean inputGender(String temp) {
        boolean check = true;
        boolean gender = false;
        while (check) {
            switch (temp) {
                case "1":
                    gender = true;
                    check = false;
                    break;
                case "2":
                    gender = false;
                    check = false;
                    break;
                default:
                    System.err.println("Please enter the number [1] for male or [2] female !");
                    temp = scanner.nextLine();
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
        return regexData(scanner.nextLine(), REGEX_POSITIVE_NUMBER, "It must be positive number. Please try again!");
    }

    public String inputEmployeePosition() {
        String position = "";
        boolean check = true;
        while (check) {
            switch (scanner.nextLine()) {
                case "1":
                    position = "Receptionist";
                    check = false;
                    break;
                case "2":
                    position = "Waitress";
                    check = false;
                    break;
                case "3":
                    position = "Hotel specialist";
                    check = false;
                    break;
                case "4":
                    position = "Monitoring";
                    check = false;
                    break;
                case "5":
                    position = "Management";
                    check = false;
                    break;
                case "6":
                    position = "Director";
                    check = false;
                    break;
                default:
                    System.err.println("Wrong choice, please enter again!!");
                    inputEmployeePosition();
            }
        }
        return position;
    }

    public String inputEmployeeLevel() {
        String level = "";
        boolean check = true;
        while (check) {
            switch (scanner.nextLine()) {
                case "1":
                    level = "Intermediate";
                    check = false;
                    break;
                case "2":
                    level = "Colleges";
                    check = false;
                    break;
                case "3":
                    level = "High Colleges";
                    check = false;
                    break;
                case "4":
                    level = "Postgraduate";
                    check = false;
                    break;
                default:
                    System.err.println("Wrong choice, please enter again!!");
                    level=scanner.nextLine();
            }
        }
        return level;
    }

    public String inputCustomerType() {
        String type = "";
        boolean check = true;
        while (check) {
            switch (scanner.nextLine()) {
                case "1":
                    type = "Diamond";
                    check = false;
                    break;
                case "2":
                    type = "Platinum";
                    check = false;
                    break;
                case "3":
                    type = "Gold";
                    check = false;
                    break;
                case "4":
                    type = "Silver";
                    check = false;
                    break;
                case "5":
                    type = "Member";
                    check = false;
                    break;
                default:
                    System.err.println("Wrong choice, please enter again!!");
                    type=scanner.nextLine();
            }
        }
        return type;
    }
//    public String formatName(String name){
//
//    }
}
