package _super_case_study.services.impl;

import _super_case_study.models.person.Customer;
import _super_case_study.services.CustomerService;
import _super_case_study.services.utils.RegexData;
import _super_case_study.services.utils.RegexPersonData;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {

    private static final String REGEX_BIRTH_DAY = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

    public CustomerServiceImpl() {
    }

    public static Scanner input = new Scanner(System.in);
    public static LinkedList<Customer> customerList = new LinkedList<>();
    RegexPersonData regexPersonData = new RegexPersonData();
    @Override
    public void display() {
        System.out.println("*****THE LIST OF CUSTOMER****");
        for (Customer item : customerList)
            if (item != null) {
                System.out.println(item.toString());
            }
    }

    @Override
    public void addNew() {
        System.out.println("Enter the ID of the customer: ");
        String id = regexPersonData.inputPersonId();
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
        String typeOfCustomer = input.nextLine();
        System.out.println("Enter the address of the customer: ");
        String address = input.nextLine();
        customerList.add(new Customer(id, name, dateOfBirth, gender, identityCard, phoneNumber, email, typeOfCustomer, address));
        System.out.println("Success adding!!");
        System.out.println("*****LIST AFTER ADDING*****");
        display();
    }

    @Override
    public void edit() {
        System.out.println("Enter the name of the customer to edit:");
        String name = input.nextLine().toUpperCase();
        boolean check = true;
        for (Customer item : customerList) {
            if (item.getName().toUpperCase().equals(name)) {
                System.out.println("Enter the ID of the customer: ");
                item.setId(regexPersonData.inputPersonId());
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
                item.setTypeOfCustomer(input.nextLine());
                System.out.println("Enter the address of the customer: ");
                item.setAddress(input.nextLine());
                System.out.println("****LIST AFTER EDITING*****");
                display();
                break;
            } else {
                check = false;
            }
        }
        if (!check) {
            System.out.println("Not found the entered name");
        }
    }

    @Override
    public void delete() {
        System.out.println("Enter the name of the customer to remove:");
        String name = input.nextLine().toUpperCase();
        boolean check = false;
        for (Customer item : customerList) {
            if (item.getName().toUpperCase().equals(name)) {
                customerList.remove(item);
                check = true;
                System.out.println("SUCCESS REMOVING!!");
                System.out.println("*****LIST AFTER REMOVING*****");
                display();
                break;
            }
        }
        if (!check) {
            System.out.println("Not found the customer in list!!");
        }
    }

    @Override
    public void search() {
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
}
