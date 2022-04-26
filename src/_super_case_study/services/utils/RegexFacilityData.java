package _super_case_study.services.utils;

public interface RegexFacilityData {
    String REGEX_STR = "[A-Z][a-z]+";
    String REGEX_ID_VILLA = "(SVVL)[-][\\d]{4}";
    String REGEX_ID_HOUSE = "(SVHO)[-][\\d]{4}";
    String REGEX_ID_ROOM = "(SVRO)[-][\\d]{4}";
    String REGEX_AMOUNT = "^[1-9]|([1][0-9])|(20)$";
    String REGEX_INT = "^[1-9]|([1][0-9])$";
    String REGEX_AREA = "^([3-9]\\d|[1-9]\\d{2,})$";

    String inputID(String facilityName);

    String inputServiceName();

    String inputUsingArea();

    String inputRentCost();

    String inputMaximumMember();

    String inputTypeOfUsing();
}
