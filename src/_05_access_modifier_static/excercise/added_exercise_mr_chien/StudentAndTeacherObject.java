package _05_access_modifier_static.excercise.added_exercise_mr_chien;

import java.util.Arrays;
import java.util.Scanner;

public class StudentAndTeacherObject extends Person {
    static Scanner input = new Scanner(System.in);
    static int size = 100;
    static Person [] people = new Person[size];
    static int count = 6;
    public static void main(String[] args) {
        people[0] = new Student( "Carrick", 27, true, "Quang Nam", 9);
        people[1] = new Student("Vidic", 26, true, "Da Nang", 9);
        people[2] = new Teacher("Cristiano", 26, true, 1000000);
        people[3] = new Student("Rooney", 27, true, "Da Nang", 8);
        people[4] = new Teacher("Ferguson", 27, true, 1500000);
        people[5] = new Student("Nani", 26, true,  "Da Nang", 9);

        while (true){
            System.out.println("Menu");
            System.out.println("1. Displaying the list of students.");
            System.out.println("2. Displaying the list of teachers.");
            System.out.println("3. Adding a student.");
            System.out.println("4. Removing a student.");
            System.out.println("5. Adding a teacher.");
            System.out.println("6. Removing a teacher.");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    displayingStudentList();
                    break;
                case 2:
                    displayingTeacherList();
                    break;
                case 3:
                    addingStudent();
                    break;
                case 4:
                    removingStudent();
                    break;
                case 5:
                    addingTeacher();
                    break;
                case 6:
                    removingTeacher();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice!");
            }
        }
    }
    public static void addingStudent(){
        System.out.println("Enter the student's name:");
        String name = input.nextLine();
        System.out.println("Enter the student's age:");
        int age =  Integer.parseInt(input.nextLine());
        System.out.println("Enter the student's gender: 1. Male, 0. Female");
        int enter = Integer.parseInt(input.nextLine());
        boolean gender;
        if (enter == 1){
            gender = true;
        } else{
            gender = false;
        }
        System.out.println("Enter the student's address:");
        String address = input.nextLine();
        System.out.println("Enter the student's point:");
        int point = Integer.parseInt(input.nextLine());
        people[count] = new Student(name, age, gender, address, point);
        System.out.println("Successfully adding student!!");
        count++;
        displayingStudentList();
    }
    public static void addingTeacher(){
        System.out.println("Enter the teacher's name:");
        String name = input.nextLine();
        System.out.println("Enter the teacher's age:");
        int age =  Integer.parseInt(input.nextLine());
        System.out.println("Enter the teacher's gender: 1. Male, 0. Female");
        int enter = Integer.parseInt(input.nextLine());
        boolean gender;
        if (enter == 1){
            gender = true;
        } else{
            gender = false;
        }
        System.out.println("Enter the teacher's salary:");
        double salary = Double.parseDouble(input.nextLine());
        people[count] = new Teacher(name, age, gender, salary);
        System.out.println("Successfully adding teacher!!");
        count++;
        displayingTeacherList();
    }
    public static void displayingStudentList(){
        for (int i = 0; i < count; i++) {
                if (people[i] instanceof Student){
                    System.out.println("The student at index " + i + " of list: " + people[i]);
                }
        }
    }
    public static void displayingTeacherList(){
        for (int i = 0; i < count; i++) {
            if (people[i] instanceof Teacher){
                System.out.println("The teacher at index " + i  + " of list: " + people[i]);
            }
        }
    }
    public static void removingStudent(){
        displayingStudentList();
        System.out.println("Enter the index of the student whom you want to remove:");
        int index =  Integer.parseInt(input.nextLine());
        for (; index <count ; index++) {
            people[index]=people[index+1];
        }
        count--;
        System.out.println("Successfully deleting!!");
        displayingStudentList();
    }
    public static void removingTeacher(){
        displayingTeacherList();
        System.out.println("Enter the index of the teacher whom you want to remove:");
        int index =  Integer.parseInt(input.nextLine());
        for (; index <count ; index++) {
            people[index]=people[index+1];
        }
        count--;
        System.out.println("Successfully deleting!!");
        displayingTeacherList();
    }
}
