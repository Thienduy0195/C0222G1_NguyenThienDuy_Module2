package _08_clean_code_and_refactoring.practice.split_method;

public class CylinderTest {
    static Cylinder cylinder = new Cylinder();
    public static void main(String[] args) {
        int radius1 = 1;
        int height1 = 2;
        double expected1 = 18.84955592153876;
        double result1 = cylinder.getVolume(radius1, height1);
        cylinder.assertEquals(expected1, result1);

        int radius2 = 0;
        int height2 = 0;
        double expected2 = 10;
        double result2  = cylinder.getVolume(radius2,height2);
        cylinder.assertEquals(expected2, result2);
    }
}
