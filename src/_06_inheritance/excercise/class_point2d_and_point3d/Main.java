package _06_inheritance.excercise.class_point2d_and_point3d;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        //hiển thị đối tượng không tham số
        System.out.println(point2D);
        //set thuộc tính X cho đối tượng
        point2D.setX(3.8f);
        //hiển thị đối tượng vừa set X
        System.out.println(point2D.getX());
        //tương tự set thuộc tính X, Y
        point2D.setXY(8.8f, 9.9f);
        // hiển thị
        System.out.println(point2D);
        //hiển thị phương thức getXY (trả về mảng thuộc tính X,Y)
        System.out.println(Arrays.toString(point2D.getXY()));
        //set lại giá trị cho thuộc tính X
        point2D.setX(1.1f);
        //hiển thị ra
        System.out.println(point2D);
        //tương tự như thao tác với point3D được khởi tạo từ lớp Point3D kế thừa Point2D
        Point3D point3D = new Point3D();
        point3D.setXYZ(1.1f,2.2f,3.3f);
        System.out.println(point3D);
        Point3D newPoint3D = new Point3D();
        Point3D newPoint3D1 = new Point3D(1.111f);
        System.out.println(newPoint3D);
        System.out.println(newPoint3D1);
        newPoint3D1.setXYZ(2.222f, 3.333f, 4.444f);
        System.out.println(newPoint3D1);
        newPoint3D1.setX(5.6789f);
        System.out.println(newPoint3D1);
    }
}
