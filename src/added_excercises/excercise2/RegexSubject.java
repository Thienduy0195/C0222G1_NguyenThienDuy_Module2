package added_excercises.excercise2;

import java.util.Scanner;

public class RegexSubject {

    static Scanner sc = new Scanner(System.in);

    public static final String REGEX_SUBJECT_CODE = "^[B][C][-][A-Z]{4}$";
    public static final String REGEX_VERSION = "^[0-9][.][0-9]$";
    public static final String REGEX_STUDY_TIME = "^\\d+$";

public static String regex(String input, String regex, String error){
    do {
        if (input.matches(regex)) {
            return input;
        } else {
            System.err.println(error);
            input = sc.nextLine();
        }
    } while (true);
}

}
