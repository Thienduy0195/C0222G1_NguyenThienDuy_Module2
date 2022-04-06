package _05_access_modifier_static.excercise.write_only_classes;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setClasses("C08");
        student1.setName("Duy");
        System.out.println(student1.getName());
        System.out.println(student1.getClasses());
    }
}
