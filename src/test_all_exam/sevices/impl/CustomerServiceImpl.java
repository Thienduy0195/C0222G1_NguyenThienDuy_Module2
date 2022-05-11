package test_all_exam.sevices.impl;

import test_all_exam.models.person.Customer;
import test_all_exam.sevices.IServices;
import test_all_exam.utils.NewReadAndWrite;
import test_all_exam.utils.NewRegex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl extends NewRegex implements IServices {
    List<Customer> customerList = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public CustomerServiceImpl() {
    }

    @Override
    public void addNewItem() {
        customerList = NewReadAndWrite.readCustomerFromCsv();
        Customer customer = new Customer();
        System.out.println("Enter the customer's ID: ");
        customer.setId(NewRegex.regexInput(input.nextLine(), REGEX_ID_CUSTOMER, "Wrong format. Example: CUS-0001, CUS-0234..."));
        System.out.println("Enter the customer's name: ");
        customer.setName(NewRegex.regexInput(input.nextLine(), REGEX_NAME, "Wrong format. Example: Nguyen thien duy, Nguyen tan a..."));
        System.out.println("Enter the customer's date of birth: ");
        customer.setDateOfBirth(NewRegex.regexAge(input.nextLine()));
        customer.setBookingStatus(false);
        customerList.add(customer);
        NewReadAndWrite.writeCustomerToCsv(customerList);
    }

    @Override
    public void displayItem() {
        customerList = NewReadAndWrite.readCustomerFromCsv();
        assert customerList != null;
        if (customerList.isEmpty()) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                System.err.println("The data in list is empty!!");
            }
        }
        for (Customer item : customerList) {
            System.out.println(item.toString());
        }
    }

    @Override
    public void editItem() {
        customerList = NewReadAndWrite.readCustomerFromCsv();
        boolean check = true;
        String id;
        while (check) {
            System.out.println("Enter the id of the customer to edit:");
            id = NewRegex.regexInput(input.nextLine(), REGEX_ID_CUSTOMER,
                    "Wrong format. Example: CUS-0001, CUS-0234...");
            for (Customer customer : customerList) {
                if (id.equals(customer.getId())) {
                    System.out.println("Enter the new customer's ID: ");
                    customer.setId(NewRegex.regexInput(input.nextLine(), REGEX_ID_CUSTOMER, "Wrong format. Example: CUS-0001, CUS-0234..."));
                    System.out.println("Enter the new customer's name: ");
                    customer.setName(NewRegex.regexInput(input.nextLine(), REGEX_NAME, "Wrong format. Example: Nguyen thien duy, Nguyen tan a..."));
                    System.out.println("Enter the customer's date of birth: ");
                    customer.setDateOfBirth(NewRegex.regexAge(input.nextLine()));
                    System.out.println("Enter the new booking status:");
                    customer.setBookingStatus(setBookingStatusMethod());
                    NewReadAndWrite.writeCustomerToCsv(customerList);
                    check = false;
                }
            }
            if (check){
                System.err.println("Not found the customer's id to edit!!");
            }
        }
    }

    public static Boolean setBookingStatusMethod() {
        boolean set = true;
        boolean check = true;
        while (check) {
            switch (input.nextLine()) {
                case "1":
                    check = false;
                    break;
                case "2":
                    check = false;
                    set = false;
                    break;
                default:
                    System.out.println("wrong choice, try again!!");
            }
        }
        return set;
    }
}

