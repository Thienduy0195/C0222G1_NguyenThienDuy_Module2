package _super_case_study.utils;

import java.util.Scanner;

public class RegexFacilityData extends RegexData {
    static Scanner input = new Scanner(System.in);

    public String inputFacilityID(String facilityName) {
        String regex = "";
        String error = "";
        switch (facilityName){
            case "villa":
                regex = REGEX_ID_VILLA;
                error = "The service ID must be in the format SVVL-YYYY, example: SVVL-0001 or SVVL-0405";
                break;
            case "house":
                regex = REGEX_ID_HOUSE;
                error = "The service ID must be in the format SVHO-YYYY, example: SVHO-0011 or SVHO-0056";
                break;
            case "room":
                regex = REGEX_ID_ROOM;
                error = "The service ID must be in the format SVRO-YYYY, example: SVRO-0012 or SVRO-0565";
        }
        return regexData(input.nextLine(), regex, error);
    }


    public String inputServiceName(String facilityName) {
        return regexData(input.nextLine(), REGEX_STR, "The " + facilityName + " name must be begin with uppercase character, example: Villa1, House1, Room1...");
    }

    public double inputUsingArea(String facilityName) {
        return Double.parseDouble(regexData(input.nextLine(), REGEX_AREA, "The usable area of the " + facilityName + " must be larger than 30 m2, example: 45 or 57..."));
    }

    public double inputRentCost(String facilityName) {
        return Double.parseDouble(regexData(input.nextLine(), REGEX_POSITIVE_NUMBER, "The rental costs of the " + facilityName + " must be a positive number, example: 7, 15, 39..."));
    }

    public int inputMaximumMember(String facilityName) {
        return Integer.parseInt(regexData(input.nextLine(), REGEX_AMOUNT, "The " + facilityName + " only accommodates 20 person at max!"));
    }

    public String inputTypeOfUsing(String facilityName) {
        return regexData(input.nextLine(), REGEX_STR, "The rental type of the " + facilityName + " must be begin with uppercase character, example: Day, Month, Year...");
    }

    public String inputStandardOfRoom(String facilityName) {
        return regexData(input.nextLine(), REGEX_STR, "The room-standard of the " + facilityName + " must be begin with uppercase character, example: Normal, Business, Vip, ...");
    }

    public int inputNumOfFloor(String facilityName) {
        return Integer.parseInt(regexData(input.nextLine(), REGEX_POSITIVE_NUMBER, "The number of floor of the " + facilityName + " must be a positive number, example: 7, 15, 39..."));
    }

    public String inputFreeService(String facilityName) {
        return regexData(input.nextLine(), REGEX_FREE_STR, "The free service of the " + facilityName + " must be a string, example: breakfast, sauna massage, ...");
    }

    public double inputPoolUsingArea(String facilityName) {
        return Double.parseDouble(regexData(input.nextLine(), REGEX_AREA, "The pool usable area of the " + facilityName + " must be larger than 30 m2, example: 45.6 or 57.2..."));
    }

}
