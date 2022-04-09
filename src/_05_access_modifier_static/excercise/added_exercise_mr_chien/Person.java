package _05_access_modifier_static.excercise.added_exercise_mr_chien;

public abstract class Person {
    private String name;
    private int age;
    private boolean gender;

    public Person() {
    }

    public Person(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Gender: " + gender;
    }
}
