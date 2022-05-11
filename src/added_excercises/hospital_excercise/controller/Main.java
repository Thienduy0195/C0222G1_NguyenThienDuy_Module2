package added_excercises.hospital_excercise.controller;

import added_excercises.excercise2.SubjectAction;
import added_excercises.hospital_excercise.sevices.MedicalServiceImpl;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static MedicalServiceImpl medicalService = new MedicalServiceImpl();

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        while (true) {
            System.out.println("\n1. Add new medical record");
            System.out.println("2. Delete a medical record");
            System.out.println("3. Display medical record list");
            System.out.println("4. Finish");
            System.out.println("Enter your choice:");
            String choice = input.nextLine();
            switch (choice) {
                case "1":
                    addNewMedicalRecord();
                    displayMainMenu();
                    break;
                case "2":
                    medicalService.deleteMedicalRecord();
                    displayMainMenu();
                    break;
                case "3":
                    medicalService.displayMedicalRecord();
                    displayMainMenu();
                    break;
                case "4":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice, please enter again:");
            }
        }
    }

    public static void addNewMedicalRecord() {
        boolean check = true;
        while (check) {
            System.out.println("\n1. Add new normal medical record");
            System.out.println("2. Add new vip medical record");
            System.out.println("3. Return to main menu");
            System.out.println("Enter your choice:");
            String choice = input.nextLine();
            switch (choice) {
                case "1":
                    medicalService.addNewNormalMedicalRecord();
                    break;
                case "2":
                    medicalService.addNewVipMedicalRecord();
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

