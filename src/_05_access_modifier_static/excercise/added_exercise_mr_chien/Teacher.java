package _05_access_modifier_static.excercise.added_exercise_mr_chien;

public class Teacher extends Person {

    private double salary;
    public Teacher() {
    }

    public Teacher(String name, int age, boolean gender, double salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "[" + super.toString() + ", Salary=" + salary + "]";
    }
}
