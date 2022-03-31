package _01_introduction_to_java.practice;
import java.util.Scanner;
public class Operator {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        //phương thức trên dùng để khai báo đối tượng Scanner
        System.out.println("Enter width: ");
        width = scanner.nextFloat();
        //nhập chiều rộng
        System.out.println("Enter height: ");
        //nhập chiều dài
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("area is: " + area);
    }
}
