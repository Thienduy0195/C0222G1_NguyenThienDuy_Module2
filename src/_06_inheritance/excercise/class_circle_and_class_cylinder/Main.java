package _06_inheritance.excercise.class_circle_and_class_cylinder;

public class Main {
    public static void main(String[] args) {
        //khởi tạo đối tượng circle1 mặc định
        Circle circle1 = new Circle();
        //in ra đối tượng mặc định có 2 thuộc tính được gắn cứng
        System.out.println(circle1);
        //in ra diện tích của đối tượng
        System.out.println(circle1.getArea());
        //thay đổi thuộc tính bán kính của đối tượng
        circle1.setRadius(3.3);
        //in ra diện tích với bán kính đã thay đổi
        System.out.println(circle1.getArea());
        //khởi tạo đối tượng cylinder1 kế thừa thuộc tính của lớp cha Circle và có thêm thuộc tính height
        Cylinder cylinder1 = new Cylinder();
        //in ra đối tượng cylinder1
        System.out.println(cylinder1);
        //in ra thể tích của đối tượng
        System.out.println(cylinder1.getVolume());
        //thay đổi thuộc tính bán kính của đối tượng
        cylinder1.setRadius(5.5);
        //in ra thể tích của đối tượng với bán kính đã thay đổi
        System.out.println(cylinder1.getVolume());
    }
}
