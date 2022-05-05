package _super_case_study.controllers;

import _super_case_study.services.impl.*;

import java.util.Scanner;

public class FuramaController {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {

        while (true) {
            System.out.println("------FURAMA MANAGEMENT MENU------");
            System.out.println("\n1. Employee Management " +
                    "\n2. Customer Management " +
                    "\n3. Facility Management  " +
                    "\n4. Booking Management " +
                    "\n5. Promotion Management " +
                    "\n6. Exit " +
                    "\nPlease enter your choice:");
            switch (input.nextLine()) {
                case "1":
                    employeeManagement();
                    break;
                case "2":
                    customerManagement();
                    break;
                case "3":
                    facilityManagement();
                    break;
                case "4":
                    bookingManagement();
                    break;
                case "5":
                    promotionManagement();
                    break;
                case "6":
                    System.out.println("-----FINISHED-----");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Wrong choice, please try again!!");
                    displayMainMenu();
            }
        }
    }

    public static void employeeManagement() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("\n1. Display list employees " +
                    "\n2. Add new employee " +
                    "\n3. Edit employee " +
                    "\n4. Return main menu ");
            switch (input.nextLine()) {
                case "1":
                    employeeService.display();
                    break;
                case "2":
                    employeeService.addNew();
                    break;
                case "3":
                    employeeService.edit();
                    break;
                case "4":
                    check = false;
                    break;
                default:
                    System.err.println("You have enter a wrong choice, please try again!");
                    employeeManagement();
                    input.nextLine();
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
                    customerService.display();
                    break;
                case "2":
                    customerService.addNew();
                    break;
                case "3":
                    customerService.edit();
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
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("\n1. Display list facility " +
                    "\n2. Add new facility " +
                    "\n3. Display list facility maintenance  " +
                    "\n4. Return main menu ");
            switch (input.nextLine()) {
                case "1":
                    facilityService.display();
                    break;
                case "2":
                    addNewFacility();
                    break;
                case "3":
                    facilityService.displayMaintain();
                    break;
                case "4":
                    check = false;
                    break;
                default:
                    System.err.println("You have enter a wrong choice, please try again!");
                    facilityManagement();
                    input.nextLine();
            }
        }
    }

    public static void addNewFacility() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("\n1. Adding new villa " +
                    "\n2. Adding new house " +
                    "\n3. Adding new room" +
                    "\n4. Return to facility menu");
            switch (input.nextLine()) {
                case "1":
                    facilityService.addNewVilla();
                    facilityManagement();
                    break;
                case "2":
                    facilityService.addNewHouse();
                    facilityManagement();
                    break;
                case "3":
                    facilityService.addNewRoom();
                    facilityManagement();
                    break;
                case "4":
                    check =false;
                    break;
                default:
                    System.err.println("You have enter a wrong choice, please try again!");
                    addNewFacility();
            }
        }
    }

    public static void bookingManagement() {
        BookingServiceImpl bookingService = new BookingServiceImpl();
        ContractServiceImpl contactService = new ContractServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("\n1. Add new booking\n" +
                    "2. Display list booking\n" +
                    "3. Create new contracts\n" +
                    "4. Display list contracts\n" +
                    "5. Edit contracts\n" +
                    "6. Return main menu\n");
            switch (input.nextLine()) {
                case "1":
                    bookingService.addNew();
                    break;
                case "2":
                    bookingService.display();
                    break;
                case "3":
                    contactService.addNew();
                    break;
                case "4":
                    contactService.display();
                    break;
                case "5":
                    contactService.edit();
                    break;
                case "6":
                    check = false;
                    break;
                default:
                    System.err.println("You have enter a wrong choice, please try again!");
                    bookingManagement();
            }
        }
    }

    public static void promotionManagement() {
        boolean check = true;
        while (check) {
            System.out.println("\n1. Display list customers use service" +
                    "\n2. Display list customers get voucher" +
                    "\n3. Return main menu\n");
            switch (input.nextLine()) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    check = false;
                    break;
                default:
                    System.err.println("You have enter a wrong choice, please try again!");
                    promotionManagement();
            }
        }
    }
}
