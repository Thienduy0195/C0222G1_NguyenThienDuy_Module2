package exam_modules2.controller;

import exam_modules2.services.impl.AccountServiceImpl;

import java.util.Scanner;

public class AccountMain {

    static Scanner input = new Scanner(System.in);
    static AccountServiceImpl accountService = new AccountServiceImpl();

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {

        while (true) {
            System.out.println("\n1. Add new bank account");
            System.out.println("2. Delete a bank account");
            System.out.println("3. Display account list");
            System.out.println("4. Search bank account");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");
            String choice = input.nextLine();
            switch (choice) {
                case "1":
                    addNewBankAccount();
                    displayMainMenu();
                    break;
                case "2":
                    accountService.deleteAccount();
                    displayMainMenu();
                    break;
                case "3":
                    accountService.displayAccount();
                    displayMainMenu();
                    break;
                case "4":
                    accountService.searchAccount();
                    displayMainMenu();
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

    public static void addNewBankAccount() {
        boolean check = true;
        while (check) {
            System.out.println("\n1. Add new saving bank account");
            System.out.println("2. Add new payment bank account");
            System.out.println("3. Return to main menu");
            System.out.println("Enter your choice:");
            String choice = input.nextLine();
            switch (choice) {
                case "1":
                    accountService.addNewSaveAccount();
                    break;
                case "2":
                    accountService.addNewPayAccount();
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
