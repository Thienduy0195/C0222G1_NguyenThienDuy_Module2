package _super_case_study.controllers;

import _super_case_study.services.impl.CustomerServiceImpl;
import _super_case_study.services.impl.EmployeeServiceImpl;
import _super_case_study.services.impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {

        while (true) {
            System.out.println("------FURAMA MANAGEMENT MENU------");
            System.out.println("1. Employee Management " +
                    "\n2. Customer Management " +
                    "\n3. Facility Management  " +
                    "\n4. Booking Management " +
                    "\n5. Promotion Management " +
                    "\n6. Exit " +
                    "\nEnter your choice!");
            switch (Integer.parseInt(input.nextLine())) {
                case 1:
                    employeeManagement();
                    break;
                case 2:
                    customerManagement();
                    break;
                case 3:
                    facilityManagement();
                    break;
                case 4:
                    bookingManagement();
                    break;
                case 5:
                    promotionManagement();
                    break;
                case 6:
                    System.exit(0);
            }
        }

    }

    public static void employeeManagement() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1. Display list employees " +
                    "\n2. Add new employee " +
                    "\n3. Edit employee  " +
                    "\n4. Return main menu ");
            switch (Integer.parseInt(input.nextLine())) {
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.addNew();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                case 4:
                    check = false;
                    break;
                default:
                    System.out.println("You have enter a wrong choice, please enter choice again!");
            }
        }
    }

    public static void customerManagement() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1. Display list customers " +
                    "\n2. Add new customer " +
                    "\n3. Edit customers  " +
                    "\n4. Return main menu ");
            switch (Integer.parseInt(input.nextLine())) {
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.addNew();
                    break;
                case 3:
                    customerService.edit();
                    break;
                case 4:
                    check = false;
                    break;
                default:
                    System.out.println("You have enter a wrong choice, please enter choice again!");
            }
        }
    }

    public static void facilityManagement() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1. Display list facility " +
                    "\n2. Add new facility " +
                    "\n3. Display list facility maintenance  " +
                    "\n4. Return main menu ");
            switch (Integer.parseInt(input.nextLine())) {
                case 1:
                    facilityService.display();
                    break;
                case 2:
                    addNewFacility();
                    break;
                case 3:
                case 4:
                    check= false;
                    break;
                default:
                    System.out.println("You have enter a wrong choice, please enter choice again!");
            }
        }
    }

    public static void addNewFacility() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1. Adding new villa " +
                    "\n2. Adding new house " +
                    "\n3. Adding new room");
            switch (Integer.parseInt(input.nextLine())) {
                case 1:
                    facilityService.addNewVilla();
                    facilityManagement();
                    break;
                case 2:
                    facilityService.addNewHouse();
                    facilityManagement();
                    break;
                case 3:
                    facilityService.addNewRoom();
                    facilityManagement();
                    break;
                default:
                    System.out.println("You have enter a wrong choice, please enter choice again!");
            }
        }
    }

    public static void bookingManagement() {
        boolean check = true;
        while (check) {
            System.out.println("1. Add new booking\n" +
                    "2. Display list booking\n" +
                    "3. Create new contracts\n" +
                    "4. Display list contracts\n" +
                    "5. Edit contracts\n" +
                    "6. Return main menu\n");
            switch (Integer.parseInt(input.nextLine())) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    check = false;
                    break;
                default:
                    System.out.println("You have enter a wrong choice, please enter choice again!");
            }
        }
    }

    public static void promotionManagement() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list customers use service\n" +
                    "2. Display list customers get voucher\n" +
                    "3. Return main menu\n");
            switch (Integer.parseInt(input.nextLine())) {
                case 1:
                case 2:
                case 3:
                    check = false;
                    break;
                default:
                    System.out.println("You have enter a wrong choice, please enter choice again!");
            }
        }
    }
}
