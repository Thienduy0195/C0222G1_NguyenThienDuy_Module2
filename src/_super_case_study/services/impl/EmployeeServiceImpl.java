package _super_case_study.services.impl;

import _super_case_study.models.person.Employee;
import _super_case_study.services.EmployeeService;
import _super_case_study.services.utils.RegexPersonData;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

    public EmployeeServiceImpl() {
    }

    public static Scanner input = new Scanner(System.in);
    public static ArrayList<Employee> employeesList = new ArrayList<>();
    RegexPersonData regexPersonData = new RegexPersonData();

    @Override
    public void display() {
        System.out.println("*****THE LIST OF EMPLOYEE****");
        for (Employee item : employeesList)
            if (item != null) {
                System.out.println(item.toString());
            }
    }

    @Override
    public void addNew() {
        System.out.println("Enter the ID of the employee: ");
        String id = regexPersonData.inputPersonId();
        System.out.println("Enter the name of the employee: ");
        String name = regexPersonData.inputPersonName();
        System.out.println("Enter the date of birth of the employee: ");
        String dateOfBirth = regexPersonData.inputDateOfBirth();
        System.out.println("Enter the gender of the employee: 1: Male , 2 : Female ");
        boolean gender = regexPersonData.inputGender(input.nextLine());
        System.out.println("Enter the identity card of the employee: ");
        String identityCard = regexPersonData.inputPersonIdCard();
        System.out.println("Enter the phone number of the employee: ");
        String phoneNumber = regexPersonData.inputPhoneNumber();
        System.out.println("Enter the email of the employee: ");
        String email = regexPersonData.inputEmail();
        System.out.println("Enter the level of the employee: ");
        String level = input.nextLine();
        System.out.println("Enter the position of the employee: ");
        String position = input.nextLine();
        System.out.println("Enter the salary of the employee: ");
        double salary = Double.parseDouble(input.nextLine());
        employeesList.add(new Employee(id, name, dateOfBirth, gender, identityCard, phoneNumber, email, level, position, salary));
        System.out.println("Success adding!!");
        System.out.println("------------********------------");
    }

    @Override
    public void edit() {
        System.out.println("Enter the name of the employee to edit:");
        String name = input.nextLine().toUpperCase();
        boolean check = true;
        for (Employee item : employeesList) {
            if (item.getName().toUpperCase().equals(name)) {
                System.out.println("Enter the ID of the employee: ");
                item.setId(regexPersonData.inputPersonId());
                System.out.println("Enter the name of the employee: ");
                item.setName(regexPersonData.inputPersonName());
                System.out.println("Enter the date of birth of the employee: ");
                item.setDateOfBirth(regexPersonData.inputDateOfBirth());
                System.out.println("Enter the gender of the employee: 1: Male , 2 : Female ");
                item.setGender(regexPersonData.inputGender(input.nextLine()));
                System.out.println("Enter the identity card of the employee: ");
                item.setIdentityCard(regexPersonData.inputPersonIdCard());
                System.out.println("Enter the phone number of the employee: ");
                item.setPhoneNumber(regexPersonData.inputPhoneNumber());
                System.out.println("Enter the email of the employee: ");
                item.setEmail(regexPersonData.inputEmail());
                System.out.println("Enter the level of the employee: ");
                item.setLevel(input.nextLine());
                System.out.println("Enter the position of the employee: ");
                item.setPosition(input.nextLine());
                System.out.println("Enter the salary of the employee: ");
                item.setSalary(Double.parseDouble(regexPersonData.inputSalary()));
                System.out.println("EMPLOYEE AFTER EDITING:");
                System.out.println(item.toString());
                System.out.println("------------********------------");
                break;
            } else {
                check = false;
            }
        }
        if (!check) {
            System.out.println("Not found the entered name!");
        }
    }

    @Override
    public void delete() {
        System.out.println("Enter the name of the employee to remove:");
        String name = input.nextLine().toUpperCase();
        boolean check = false;
        for (Employee item : employeesList) {
            if (item.getName().toUpperCase().equals(name)) {
                employeesList.remove(item);
                check = true;
                System.out.println("Success removing!!");
                System.out.println("------------********------------");
                break;
            }
        }
        if (!check) {
            System.out.println("Not found the entered ID in list!!");
        }
    }

    @Override
    public void search() {
        System.out.println("Enter the name of the employee you need to search:");
        String name = input.nextLine().toUpperCase();
        boolean check = false;
        for (Employee item : employeesList) {
            if (item.getName().toUpperCase().contains(name)) {
                System.out.println("THE EMPLOYEE WHO WAS SEARCHED:");
                System.out.println(item.toString());
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Not found the entered name of the employee in list!!");
        }
    }
}