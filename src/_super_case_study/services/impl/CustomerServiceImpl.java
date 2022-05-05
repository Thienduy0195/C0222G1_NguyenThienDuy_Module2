package _super_case_study.services.impl;

import _super_case_study.models.person.Customer;
import _super_case_study.services.CustomerService;
import _super_case_study.utils.ReadAndWritePerson;
import _super_case_study.utils.RegexPersonData;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {

    public CustomerServiceImpl() {
    }

    public static Scanner input = new Scanner(System.in);
    public static LinkedList<Customer> customerList = new LinkedList<>();
    RegexPersonData regexPersonData = new RegexPersonData();

    @Override
    public void display() {
        try {
            customerList = (LinkedList<Customer>) ReadAndWritePerson.readCustomerFromCsv();
            assert customerList != null;
            if (customerList.isEmpty()) {
                throw new IOException();
            }
        } catch (IOException e) {
            System.err.println("The data file is empty, please adding customer information to the file!!");
        }

        System.out.println("*****THE LIST OF CUSTOMER****");
        for (Customer item : customerList)
            if (item != null) {
                System.out.println(item.toString());
            }
    }

    @Override
    public void addNew() {
        customerList = (LinkedList<Customer>) ReadAndWritePerson.readCustomerFromCsv();
        System.out.println("Enter the ID of the customer: ");
        int id = checkId();
        System.out.println("Enter the name of the customer: ");
        String name = regexPersonData.inputPersonName();
        System.out.println("Enter the date of birth of the customer: ");
        String dateOfBirth = regexPersonData.inputDateOfBirth();
        System.out.println("Enter the gender of the customer: 1: Male , 2 : Female ");
        boolean gender = regexPersonData.inputGender(input.nextLine());
        System.out.println("Enter the identity card of the customer: ");
        String identityCard = regexPersonData.inputPersonIdCard();
        System.out.println("Enter the phone number of the customer: ");
        String phoneNumber = regexPersonData.inputPhoneNumber();
        System.out.println("Enter the email of the customer: ");
        String email = regexPersonData.inputEmail();
        System.out.println("Enter the type of the customer: ");
        System.out.println("1. Diamond * 2. Platinum * 3. Gold * 4. Silver * 5. Member");
        String typeOfCustomer = regexPersonData.inputCustomerType();
        System.out.println("Enter the address of the customer: ");
        String address = input.nextLine();
        customerList.add(new Customer(id, name, dateOfBirth, gender, identityCard, phoneNumber, email, typeOfCustomer, address));
        ReadAndWritePerson.writeCustomerToCsv(customerList);
        System.out.println("Success adding!!");
    }

    @Override
    public void edit() {
        customerList = (LinkedList<Customer>) ReadAndWritePerson.readCustomerFromCsv();
        System.out.println("Enter the name of the customer to edit:");
        String name = input.nextLine().toUpperCase();
        boolean check = true;
        for (Customer item : customerList) {
            if (item.getName().toUpperCase().equals(name)) {
                System.out.println("Enter the ID of the customer: ");
                item.setId(checkId());
                System.out.println("Enter the name of the customer: ");
                item.setName(regexPersonData.inputPersonName());
                System.out.println("Enter the date of birth of the customer: ");
                item.setDateOfBirth(regexPersonData.inputDateOfBirth());
                System.out.println("Enter the gender of the customer: 1: Male , 2 : Female ");
                item.setGender(regexPersonData.inputGender(input.nextLine()));
                System.out.println("Enter the identity card of the customer: ");
                item.setIdentityCard(regexPersonData.inputPersonIdCard());
                System.out.println("Enter the phone number of the customer: ");
                item.setPhoneNumber(regexPersonData.inputPhoneNumber());
                System.out.println("Enter the email of the customer: ");
                item.setEmail(regexPersonData.inputEmail());
                System.out.println("Enter the type of the customer: ");
                System.out.println("1. Diamond * 2. Platinum * 3. Gold * 4. Silver * 5. Member");
                item.setTypeOfCustomer(regexPersonData.inputCustomerType());
                System.out.println("Enter the address of the customer: ");
                item.setAddress(input.nextLine());
                ReadAndWritePerson.writeCustomerToCsv(customerList);
                System.out.println("****SUCCESS EDITING!*****");
                break;
            } else {
                check = false;
            }
        }
        if (!check) {
            System.out.println("Not found the entered name, please try again...");
        }
    }

    @Override
    public void delete() {
        customerList = (LinkedList<Customer>) ReadAndWritePerson.readCustomerFromCsv();
        System.out.println("Enter the name of the customer to remove:");
        String name = input.nextLine().toUpperCase();
        boolean check = false;
        for (Customer item : customerList) {
            if (item.getName().toUpperCase().equals(name)) {
                customerList.remove(item);
                check = true;
                System.out.println("-----SUCCESS REMOVING-----!!");
                ReadAndWritePerson.writeCustomerToCsv(customerList);
                break;
            }
        }
        if (!check) {
            System.out.println("Not found the customer in list!!");
        }
    }

    @Override
    public void search() {
        customerList = (LinkedList<Customer>) ReadAndWritePerson.readCustomerFromCsv();
        System.out.println("Enter the name of the customer you need to search:");
        String name = input.nextLine().toUpperCase();
        boolean check = false;
        for (Customer item : customerList) {
            if (item.getName().toUpperCase().contains(name)) {
                System.out.println("THE CUSTOMER WHO WAS SEARCHED:");
                System.out.println(item.toString());
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Not found the entered name of the customer in list!!");
        }
    }

    @Override
    public int checkId() {
        customerList = (LinkedList<Customer>) ReadAndWritePerson.readCustomerFromCsv();
        int id = Integer.parseInt(regexPersonData.inputPersonId());
        boolean check = true;
        while (check){
            check =false;
            for (Customer item: customerList) {
                if(id == item.getId()){
                    System.err.println("The Id is exist, please try again!");
                    System.out.println("Re-enter the Id:");
                    id = Integer.parseInt(regexPersonData.inputPersonId());
                    check = true;
                    break;
                }
            }
        }
        return id;
    }
}
