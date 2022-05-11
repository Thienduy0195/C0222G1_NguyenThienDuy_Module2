package enviroment_ss;

import added_excercises.excercise2.RegexSubject;

import java.util.List;
import java.util.Scanner;

public class Method extends RegexSubject {
    static Scanner input = new Scanner(System.in);


public static void addNew(){
    System.out.println("Please enter the ABC id");
    System.out.println("Please enter the ABC code");
    System.out.println("Please enter the ABC name");
    System.out.println("Please enter the ABC cost");
    System.out.println("Please enter the ABC id");
}

//CHECK STRING CODE
//    public static String checkCode() {
//        String id = RegexSubject.regex(input.nextLine(), REGEX_SUBJECT_CODE, "WRONG CODE");
//        subjectList = ReadAndWriteSubject.readSubject();
//        boolean check = true;
//        while (check) {
//            check = false;
//            for (Subject item : subjectList) {
//                if (id.equals(item.getSubjectCode())) {
//                    check = true;
//                    System.out.println("This id is exits!!, Please re-enter");
//                    id =RegexSubject.regex(input.nextLine(), REGEX_SUBJECT_CODE, "WRONG CODE");
//                }
//            }
//        }
//        return id;
//    }


//    CHECK INT CODE
//    public int inputIntId() {
//        int id;
//        boolean check = true;
//        while (check){
//            id = Integer.parseInt(regexPersonData.inputPersonId());
//            check =false;
//            for (Customer item: customerList) {
//                if(id == item.getId()){
//                    System.err.println("The Id is exist, please try again!");
//                    System.out.println("Re-enter the Id:");
//                    check = true;
//                    break;
//                }
//            }
//        }
//        return id;
//    }


    public String inputEmployeeLevel() {
        String level = "";
        boolean check = true;
        while (check) {
            switch (input.nextLine()) {
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
                    level=input.nextLine();
            }
        }
        return level;
    }


}
