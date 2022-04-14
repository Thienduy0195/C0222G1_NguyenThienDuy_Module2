package _ss11_stack_and_queue.excercise.demerging;

public class Employee implements Comparable<Employee>{
    private String name;
    private boolean gender = true;
    private int age;

    public Employee() {
    }

    public Employee(String name, boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return
                "Name: " + name + ", Gender=" + gender + ", Age=" + age;
    }

    @Override
    public int compareTo(Employee employee) {
        if (this.getAge() > employee.getAge()){
            return 1;
        } else if(this.getAge() < employee.getAge()){
            return -1;
        } else {
            return 0;
        }
    }
}