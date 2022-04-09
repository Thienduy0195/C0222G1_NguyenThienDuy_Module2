package _05_access_modifier_static.excercise.added_exercise_mr_chien;


public class Student extends Person {
    private String address;
    private int point = 0;

    public Student() {
    }

    public Student(String name, int age, boolean gender, String address, int point) {
        super(name, age, gender);
        this.address = address;
        this.point = point;
    }

    @Override
    public String toString() {
        String str = "";
        return "[" + super.toString() + ", " + address + ", Point: " + point +  "]";
    }

}