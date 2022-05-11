package added_excercises.excercise2;

import java.util.Scanner;

public class ControllerSubject {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        while (true){
            System.out.println("\n1. Display subject list");
            System.out.println("2. Adding new subject");
            System.out.println("3. Update subject list");
            System.out.println("4. Delete subject in list");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");
            String choice = input.nextLine();
            switch (choice){
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
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice, please enter again:");
            }
        }
    }
}
