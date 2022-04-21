package _super_ss_testall.test_this;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class UsingThisExample {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String arg1 = "CodeGym";
        solution(arg1);
    }
    public static void solution(String arg1) {
        String [] arr = arg1.split("");
        Stack<String> strings = new Stack<>();
        for(int i = arr.length -1 ; i >= 0; i--){
            strings.add(arr[i]);
            if(arr[i].equals(arr[i].toUpperCase())){
                strings.add(" ");
            }
        }
        String newStr = "";
        System.out.println(strings);
        strings.pop();
        for (int i = strings.size(); i >0 ; i--) {
            newStr += strings.pop().toLowerCase();
        }
        System.out.println(newStr);
    }


//    private int id;
//
//    private String website;
//
//    private String subject;
//
//    public UsingThisExample() {
//        this.id = 1;
//    }
//
//    public UsingThisExample setWebsite(String website) {
//        this.website = website;
//        return this;
//    }
//
//    public UsingThisExample setSubject(String subject) {
//        this.subject = subject;
//        return this;
//    }
//
//    public void print() {
//        System.out.println("Id = " + id);
//        this.printWebsite();
//        this.printSubject();
//    }
//
//    private void printWebsite() {
//        System.out.println("Subject = " + subject);
//    }
//
//    private void printSubject() {
//        System.out.println("Website = " + website);
//    }
//
//    public static void main(String[] args) {
//        UsingThisExample ex1 = new UsingThisExample()
//                .setSubject("OOP")
//                .setWebsite("gpcoder.com");
//        ex1.print();
//    }

}