package _super_case_study.services.impl;

import _super_case_study.controllers.FuramaController;
import _super_case_study.models.person.Employee;
import _super_case_study.services.EmployeeService;
import _super_case_study.utils.read_and_write.ReadAndWritePerson;
import _super_case_study.utils.regex.RegexPersonData;

import java.io.IOException;
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
        try {
            employeesList = (ArrayList<Employee>) ReadAndWritePerson.readEmployeeFromCsv();
            assert employeesList != null;
            if (employeesList.isEmpty()) {
                throw new IOException();
            }
        } catch (IOException e) {
            System.err.println("The data file is empty, please adding customer information to the file!!");
            FuramaController.employeeManagement();
        }
        System.out.println("*****THE LIST OF EMPLOYEE****");
        for (Employee item : employeesList)
            if (item != null) {
                System.out.println(item);
            }
    }


    @Override
    public void addNew() {
        employeesList = (ArrayList<Employee>) ReadAndWritePerson.readEmployeeFromCsv();
        System.out.println("Enter the ID of the employee: ");
        int id = checkId();
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
        System.out.println("1. Intermediate \n2. Colleges \n3. High Colleges \n4. Postgraduate");
        String level = regexPersonData.inputEmployeeLevel();
        System.out.println("Enter the position of the employee: ");
        System.out.println("1. Receptionist ** 2. Waitress ** 3. Hotel ** 4. specialist ** " +
                "5. Monitoring ** 6. Management ** 7. Director");
        String position = regexPersonData.inputEmployeePosition();
        System.out.println("Enter the salary of the employee: ");
        double salary = Double.parseDouble(regexPersonData.inputSalary());
        employeesList.add(new Employee(id, name, dateOfBirth, gender,
                                        identityCard, phoneNumber, email,
                                        level, position, salary));
        ReadAndWritePerson.writeEmployeeToCsv(employeesList);
        System.out.println("Success adding!!");
        System.out.println("------------********------------");
    }

    @Override
    public void edit() {
        employeesList = (ArrayList<Employee>) ReadAndWritePerson.readEmployeeFromCsv();
        System.out.println("Enter the name of the employee to edit:");
        String name = input.nextLine().toUpperCase();
        boolean check = true;
        for (Employee item : employeesList) {
            if (item.getName().toUpperCase().equals(name)) {
                System.out.println("Enter the ID of the employee: ");
                item.setId(checkId());
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
                System.out.println("1. Receptionist ** 2. Waitress ** 3. Hotel ** 4. specialist ** " +
                        "5. Monitoring ** 6. Management ** 7. Director");
                item.setLevel(input.nextLine());
                System.out.println("Enter the position of the employee: ");
                item.setPosition(input.nextLine());
                System.out.println("Enter the salary of the employee: ");
                item.setSalary(Double.parseDouble(regexPersonData.inputSalary()));
                System.out.println("EMPLOYEE AFTER EDITING:");
                System.out.println(item.toString());
                ReadAndWritePerson.writeEmployeeToCsv(employeesList);
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
        employeesList = (ArrayList<Employee>) ReadAndWritePerson.readEmployeeFromCsv();
        System.out.println("Enter the name of the employee to remove:");
        String name = input.nextLine().toUpperCase();
        boolean check = false;
        for (Employee item : employeesList) {
            if (item.getName().toUpperCase().equals(name)) {
                employeesList.remove(item);
                check = true;
                System.out.println("Success removing!!");
                System.out.println("------------********------------");
                ReadAndWritePerson.writeEmployeeToCsv(employeesList);
                break;
            }
        }
        if (!check) {
            System.out.println("Not found the entered ID in list!!");
        }
    }

    @Override
    public void search() {
        employeesList = (ArrayList<Employee>) ReadAndWritePerson.readEmployeeFromCsv();
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

    @Override
    public int checkId() {
        employeesList = (ArrayList<Employee>) ReadAndWritePerson.readEmployeeFromCsv();
        int id = Integer.parseInt(regexPersonData.inputPersonId());
        boolean check = true;
        while (check) {
            check = false;
            for (Employee item : employeesList) {
                if (id == item.getId()) {
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
