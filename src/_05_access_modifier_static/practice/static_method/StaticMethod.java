package _05_access_modifier_static.practice.static_method;

public class StaticMethod {
    public static void main(String[] args) {
        Student.change(); //gọi phương thức change
        //khởi tạo 3 đối tượng học sinh và truyền tham số
        Student s1 = new Student (111, "John");
        Student s2 = new Student (112, "Susan");
        Student s3 = new Student (117, "Jack");
        //hiển thị 3 đối tượng học sinh
        s1.display();
        s2.display();
        s3.display();
        //kết quả sẽ cho ra
        //111 John CODEGYM
        //112 Susan CODEGYM
        //117 Jack CODEGYM
    }
}
