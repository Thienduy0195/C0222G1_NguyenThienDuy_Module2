package _super_case_study.utils;

import _super_case_study.models.person.Customer;
import _super_case_study.models.person.Employee;
import java.io.*;
import java.util.*;

public class ReadAndWritePerson {
    private static final String CHARACTER = ",";
    private static final String EMPLOYEE_FILE_HEADER = "ID,NAME,DATE OF BIRTH,GENDER,IDENTITY CARD,PHONE NUMBER,EMAIL,LEVEL,POSITION, SALARY";
    private static final String CUSTOMER_FILE_HEADER = "ID,NAME,DATE OF BIRTH,GENDER,IDENTITY CARD,PHONE NUMBER,EMAIL,TYPE OF CUSTOMER,ADDRESS";
    private static final String CUSTOMER_PATH = "src/_super_case_study/data/customer.csv";
    private static final String EMPLOYEE_PATH = "src/_super_case_study/data/employee.csv";

    public static void writeEmployeeToCsv(List<Employee> list) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(EMPLOYEE_PATH));
            bw.write(EMPLOYEE_FILE_HEADER);
            String line ="";
            for (Employee employee : list) {
                bw.newLine();
                line = employee.makeText();
                bw.write(line);
            }
        } catch (Exception e) {
            System.err.println("Error at writing employee information to file employee.csv");
        } finally {
            try {
                if (bw != null) {
                    bw.flush();
                    bw.close();
                }
            } catch (Exception e) {
                System.err.println("Error at flushing or closing BufferedWriter");
            }
        }
    }

    public static void writeCustomerToCsv(List<Customer> list) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(CUSTOMER_PATH));
            bw.write(CUSTOMER_FILE_HEADER);
            String line ="";
            for (Customer customer : list) {
                bw.newLine();
                line = customer.makeText();
                bw.write(line);
            }
        } catch (Exception e) {
            System.err.println("Error at writing customer information to file csv");
        } finally {
            try {
                if (bw != null) {
                    bw.flush();
                    bw.close();
                }
            } catch (Exception e) {
                System.err.println("Error at flushing or closing BufferedWriter");
            }
        }
    }

    public static List<Employee> readEmployeeFromCsv() {
        List<Employee> employeeList = new ArrayList<>();
        BufferedReader br = null;
        try {
            File file = new File(EMPLOYEE_PATH);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            br = new BufferedReader(new FileReader(file));
            String line = "";
            Employee employee;
            while ((line = br.readLine()) != null) {
                String[] array = line.split(CHARACTER);
                if (array[0].equals("ID")) {
                    continue;
                }
                employee = new Employee(Integer.parseInt(array[0]), array[1], array[2], Boolean.parseBoolean(array[3]), array[4], array[5], array[6], array[7], array[8], Double.parseDouble(array[9]));
                employeeList.add(employee);
            }
            return employeeList;
        } catch (IOException e) {
            System.out.println("File not found, please creating new file.");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("Error at closing BufferedReader in readCustomerFromCsv method");
                }
            }
        }
        return null;
    }

    public static List<Customer> readCustomerFromCsv() {
        List<Customer> customersList = new LinkedList<>();
        BufferedReader br = null;
        try {
            File file = new File(CUSTOMER_PATH);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            br = new BufferedReader(new FileReader(file));
            String line = "";
            Customer customer;
            while ((line = br.readLine()) != null) {
                String[] array = line.split(",");
                if (array[0].equals("ID")) {
                    continue;
                }
                customer = new Customer(Integer.parseInt(array[0]), array[1], array[2], Boolean.parseBoolean(array[3]), array[4], array[5], array[6], array[7], array[8]);
                customersList.add(customer);
            }
            return customersList;
        } catch (IOException e) {
            System.out.println("File not found, please creating new file.");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("Error at closing BufferedReader in readCustomerFromCsv method");
                }
            }
        }
        return null;
    }
}

