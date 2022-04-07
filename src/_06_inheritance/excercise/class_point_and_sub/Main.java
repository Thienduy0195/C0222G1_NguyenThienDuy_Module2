package _06_inheritance.excercise.class_point_and_sub;

public class Main {
    public static void main(String[] args) {
        //khởi tạo đổi tượng point từ lớp cha Point và truyền vào tham số
        Point point = new Point(10, 20);
        //in ra đối tượng được khởi tạo
        System.out.println("Point: " + "\n" + point + "\n");
        //khởi tạo đối tượng moveablePoint từ lớp MoveablePoint kế thừa lớp Point, truyền vào 4 tham số
        MoveablePoint moveablePoint = new MoveablePoint(10, 20, 30, 40);
        //in ra đối tượng được khởi tạo
        System.out.println("Point before moving: " + "\n" + moveablePoint + "\n");
        //gọi phương thức di chuyển của đối tượng
        moveablePoint.move();
        //in ra đối tượng sau khi di chuyển
        System.out.println("Point after moving: " + "\n" + moveablePoint + "\n");
    }
}
