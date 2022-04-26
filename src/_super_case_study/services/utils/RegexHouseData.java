package _super_case_study.services.utils;

public class RegexHouseData implements RegexFacilityData {

    public static final String REGEX_STR = "[A-Z][a-z]+";
    public static final String REGEX_ID_VILLA = "(SVVL)[-][\\d]{4}";
    public static final String REGEX_ID_HOUSE = "(SVHO)[-][\\d]{4}";
    public static final String REGEX_ID_ROOM = "(SVRO)[-][\\d]{4}";
    public static final String REGEX_AMOUNT = "^[1-9]|([1][0-9])|(20)$";
    public static final String REGEX_INT = "^[1-9]|([1][0-9])$";
    public static final String REGEX_AREA = "^([3-9]\\d|[1-9]\\d{2,})$";

    @Override
    public String inputID(String facilityName) {
        return null;
    }

    @Override
    public String inputServiceName() {
        return null;
    }

    @Override
    public String inputUsingArea() {
        return null;
    }

    @Override
    public String inputRentCost() {
        return null;
    }

    @Override
    public String inputMaximumMember() {
        return null;
    }

    @Override
    public String inputTypeOfUsing() {
        return null;
    }

}
