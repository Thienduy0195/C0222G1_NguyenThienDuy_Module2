package enviroment_ss;

import added_excercises.excercise2.SubjectAction;

import java.util.Scanner;

public class MainMenu {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Display subject list");
            System.out.println("2. Adding new subject");
            System.out.println("3. Update subject list");
            System.out.println("4. Delete subject in list");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");
            String choice = input.nextLine();
            switch (choice) {
                case "1":
                    SubjectAction.display();
                    break;
                case "2":
                    SubjectAction.addNew();
                    break;
                case "3":
                    SubjectAction.update();
                    break;
                case "4":
                    SubjectAction.delete();
                    break;
                case "5":
                    System.out.println("********FINISH********");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice, please enter again:");
            }
        }
    }

    public static void addNewOBJECT() {
        boolean check = true;
        while (check) {
            System.out.println("\n1. Add new normal medical record");
            System.out.println("2. Add new vip medical record");
            System.out.println("3. Return to main menu");
            System.out.println("Enter your choice:");
            String choice = input.nextLine();
            switch (choice) {
                case "1":

                    break;
                case "2":

                    break;
                case "3":
                    check = false;
                    break;
                default:
                    System.out.println("Wrong choice, please enter again:");
            }
        }
    }
}
