package _05_access_modifier_static.excercise.added_exercise_mr_chien;

import java.util.Scanner;

public class Student {
    Scanner input = new Scanner(System.in);
    static int size = 10;
    private String name;
    private int age;
    private String address;
    private int point;
    public Student(){

    }
    public Student(String name, int age, String address, int point){
        this.name = name;
        this.age = age;
        this.address = address;
        this.point = point;
    }

    @Override
    public String toString() {
        String str = "";
        return "Name: " + name + ", Age: " + age + ", Address: " + address + ", Point: " + point;
    }

}
