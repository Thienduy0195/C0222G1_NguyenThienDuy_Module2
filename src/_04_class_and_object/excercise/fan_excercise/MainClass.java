package _04_class_and_object.excercise.fan_excercise;

public class MainClass {
    public static void main(String[] args) {
        FanClass fan1 = new FanClass(3,true, 10, "yellow");
        FanClass fan2 = new FanClass(2,false, 5, "blue");
        System.out.println(fan1);
        System.out.println(fan2);
        }
}
