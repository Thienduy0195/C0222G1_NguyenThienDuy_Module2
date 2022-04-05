package _05_access_modifier_static.practice.static_method;

public class Student {
    //khai báo các biến thuộc tính
    private final int rollno;
    private final String name;
    private static String college= "BBDIT";
    // hàm tạo để khởi tạo biến
    Student (int r, String n){
        rollno = r;
        name = n;
    }
    // phương thức static để thay đổi giá trị của biến static
    static void change(){
        college = "CODEGYM";
    }
    // phương thức hiển thị giá trị
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}
