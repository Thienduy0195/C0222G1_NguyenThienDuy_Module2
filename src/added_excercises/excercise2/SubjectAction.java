package added_excercises.excercise2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SubjectAction extends RegexSubject {
    static List<Subject> subjectList = new LinkedList<>();

    static Scanner input = new Scanner(System.in);

    public static void addNew() {
        subjectList = ReadAndWriteSubject.readSubject();
        System.out.println("Enter the code:");
        String code = checkCode();
        System.out.println("Enter the name:");
        String name = input.nextLine();
        System.out.println("Enter the version:");
        String version = RegexSubject.regex(input.nextLine(), REGEX_VERSION, "WRONG VERSION");
        System.out.println("Enter the level:");
        System.out.println("1. Easy ** 2. Normal ** 3. Hard");
        String level = inputSubjectLevel();
        System.out.println("Enter the study time:");
        int hour = Integer.parseInt(RegexSubject.regex(input.nextLine(), REGEX_STUDY_TIME, "WRONG FORMAT"));
        Subject subject = new Subject(code, name, version, level, hour);
        subjectList.add(subject);
        Collections.sort(subjectList);
        ReadAndWriteSubject.writeSubject(subjectList);
        System.out.println("success adding!!");
    }

    public static void display() {
        subjectList = ReadAndWriteSubject.readSubject();
        Collections.sort(subjectList);
        for (Subject item : subjectList) {
            System.out.println(item.toString());
        }
    }

    public static void update() {
        display();
        subjectList = ReadAndWriteSubject.readSubject();
        System.out.println("Enter the subject code to edit:");
        String code = input.nextLine();
        boolean check = true;
        while (check) {
            check = false;
            for (Subject item : subjectList) {
                if (code.equals(item.getSubjectCode())) {
                    System.out.println("Enter the new name:");
                    item.setSubjectName(RegexSubject.regex(input.nextLine(), REGEX_SUBJECT_CODE, "WRONG CODE"));
                    System.out.println("Enter the new version:");
                    item.setVersion(RegexSubject.regex(input.nextLine(), REGEX_VERSION, "WRONG VERSION"));
                    System.out.println("Enter the new level:");
                    System.out.println("1. Easy ** 2. Normal ** 3. Hard");
                    item.setLevel(inputSubjectLevel());
                    System.out.println("Enter the new study hour:");
                    item.setStudyHour(Integer.parseInt(RegexSubject.regex(input.nextLine(), REGEX_STUDY_TIME, "WRONG FORMAT")));
                } else {
                    check = true;
                    System.out.println("not found the id, please try again:");
                    code = input.nextLine();
                }
            }
        }
        ReadAndWriteSubject.writeSubject(subjectList);
    }

    public static void delete() {
        display();
        subjectList = ReadAndWriteSubject.readSubject();
        System.out.println("Enter the subject code to delete:");
        String code = RegexSubject.regex(input.nextLine(), REGEX_SUBJECT_CODE, "WRONG CODE");
        boolean check = true;
        while (check) {
            for (int i = 0; i <subjectList.size() ; i++) {
                if (subjectList.get(i).getSubjectCode().equals(code)) {
                    subjectList.remove(subjectList.get(i));
                    System.out.println("Removing completed!!");
                    check = false;
                    break;
                }
                    System.out.println("not found the id, please try again:");
                    code = RegexSubject.regex(input.nextLine(), REGEX_SUBJECT_CODE, "WRONG CODE");
            }
        }
        ReadAndWriteSubject.writeSubject(subjectList);
    }

    public static String checkCode() {
        String id = RegexSubject.regex(input.nextLine(), REGEX_SUBJECT_CODE, "WRONG CODE");
        subjectList = ReadAndWriteSubject.readSubject();
        boolean check = true;
        while (check) {
            check = false;
            for (Subject item : subjectList) {
                if (id.equals(item.getSubjectCode())) {
                    check = true;
                    System.out.println("This id is exits!!, Please re-enter");
                    id =RegexSubject.regex(input.nextLine(), REGEX_SUBJECT_CODE, "WRONG CODE");
                }
            }
        }
        return id;
    }

    public static String inputSubjectLevel() {
        String level = "";
        boolean check = true;
        while (check) {
            switch (input.nextLine()) {
                case "1":
                    level = "Easy";
                    check = false;
                    break;
                case "2":
                    level = "Normal";
                    check = false;
                    break;
                case "3":
                    level = "Hard";
                    check = false;
                    break;
                default:
                    System.err.println("Wrong choice, please enter again!!");
                    level=input.nextLine();
            }
        }
        return level;
    }
}
