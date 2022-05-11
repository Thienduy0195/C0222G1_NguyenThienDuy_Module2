package test_all_exam.controller;

import added_excercises.excercise2.SubjectAction;
import test_all_exam.sevices.impl.BookingServiceImpl;
import test_all_exam.sevices.impl.CustomerServiceImpl;
import test_all_exam.sevices.impl.FacilityServicesImpl;

import java.util.Scanner;

public class NewController {


    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        displayMainMenu();
    }

    public static void displayMainMenu() {

        while (true) {
            System.out.println("------FURAMA MANAGEMENT MENU------");
            System.out.println("\n1. Facility Management  " +
                    "\n2. Booking Management " +
                    "\n3. Customer Management " +
                    "\n4. Exit " +
                    "\nPlease enter your choice:");
            switch (input.nextLine()) {
                case "1":
                    facilityManagement();
                    break;
                case "2":
                   bookingManagement();
                    break;
                case "3":
                    customerManagement();
                    break;
                case "4":
                    System.out.println("-----FINISHED-----");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Wrong choice, please try again!!");
                    displayMainMenu();
            }
        }
    }

    public static void bookingManagement() {
        BookingServiceImpl bookingService = new BookingServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("\n1. Add new booking\n" +
                    "2. Display list booking\n" +
                    "3. Edit booking\n" +
                    "4. Return main menu\n");
            switch (input.nextLine()) {
                case "1":
                    bookingService.addNewItem();
                    break;
                case "2":
                    bookingService.displayItem();
                    break;
                case "3":
                    bookingService.editItem();
                    break;
                case "4":
                    check = false;
                    break;
                default:
                    System.err.println("You have enter a wrong choice, please try again!");
                    bookingManagement();
            }
        }
    }

    public static void customerManagement() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("\n1. Display list customers " +
                    "\n2. Add new customer " +
                    "\n3. Edit customers  " +
                    "\n4. Return main menu ");
            switch (input.nextLine()) {
                case "1":
                    customerService.displayItem();
                    break;
                case "2":
                    customerService.addNewItem();
                    break;
                case "3":
                    customerService.editItem();
                    break;
                case "4":
                    check = false;
                    break;
                default:
                    System.err.println("You have enter a wrong choice, please try again!");
                    customerManagement();
                    input.nextLine();
            }
        }
    }

    public static void facilityManagement() {
        FacilityServicesImpl facilityServices = new FacilityServicesImpl();
        while (true) {
            System.out.println("\n1. Display list facility " +
                    "\n2. Add new facility " +
                    "\n3. Edit Facility  " +
                    "\n4. Return main menu ");
            switch (input.nextLine()) {
                case "1":
                    facilityServices.displayFacility();
                    break;
                case "2":
                    addNewFacility();
                    break;
                case "3":
                    facilityServices.editFacility();
                    break;
                case "4":
                    displayMainMenu();
                    break;
                default:
                    System.err.println("You have enter a wrong choice, please try again!");
                    facilityManagement();
                    input.nextLine();
            }
        }
    }

    public static void addNewFacility() {
        FacilityServicesImpl facilityServices = new FacilityServicesImpl();
        boolean check = true;
        while (check) {
            System.out.println("\n1. Add new villa");
            System.out.println("2. Add new house");
            System.out.println("3. Add new room");
            System.out.println("4. Return to main menu");
            System.out.println("Enter your choice:");
            String choice = input.nextLine();
            switch (choice) {
                case "1":
                    facilityServices.addNewVilla();
                    break;
                case "2":
                    facilityServices.addNewHouse();
                    break;
                case "3":
                    facilityServices.addNewRoom();
                    break;
                case "4":
                    check = false;
                    break;
                default:
                    System.out.println("Wrong choice, please enter again:");
            }
        }
    }
}
