package _ss11_stack_and_queue.excercise.demerging;


import java.util.*;

public class DemergingTest {
    public static void main(String[] args) {
        Queue<Employee> male = new LinkedList<>();
        Queue<Employee> female = new LinkedList<>();

        Employee[] employeeArr = new Employee[8];
        employeeArr[0] = new Employee("Jack", true, 18);
        employeeArr[1] = new Employee("John", true,25);
        employeeArr[2] = new Employee("Susan", false, 35);
        employeeArr[3] = new Employee("Will", true, 18);
        employeeArr[4] = new Employee("Chris", true, 26);
        employeeArr[5] = new Employee("Helena", false, 45);
        employeeArr[6] = new Employee("Bob", true, 28);
        employeeArr[7] = new Employee("Smith", false, 28);

        System.out.println("List of employee before sorting: ");
        for (Employee item: employeeArr) {
            System.out.println(item.toString());
        }

        Arrays.sort(employeeArr);

        for (Employee item : employeeArr) {
            if (item.isGender()){
                male.add(item);
            } else {
                female.add(item);
            }
        }

        List<Employee> newList = new ArrayList<>();
        while (female.size() > 0){
            newList.add(female.remove());
        }
        while (male.size() > 0){
            newList.add(male.remove());
        }
        System.out.println();
        System.out.println("List of employee after sorting: ");
        for (Employee item: newList) {
            System.out.println(item.toString());
        }
    }
}
