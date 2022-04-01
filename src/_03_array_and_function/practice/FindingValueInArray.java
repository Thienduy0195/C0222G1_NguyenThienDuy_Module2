package _03_array_and_function.practice;

import java.util.Scanner;

public class FindingValueInArray {
    public static void main(String[] args) {
        String [] students = {"toan", "khanh", "hoang", "luan", "hieu", "duy", "phuc", "long", "trung", "hoa"};
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name of stundent: ");
        String name = input.nextLine();
        boolean check = false;
        for (int i = 0; i < students.length; i++)
            if(students[i].equals(name)){
                System.out.println("The position of " + name + " in array is: " + (i+1));
                check = true;
                break;
        }
        if(!check){
            System.out.println("not found " + name + " in array");
        }
    }
}
