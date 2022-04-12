package _08_clean_code_and_refactoring.practice.refactoring_variable;

public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = calculator.calculate(3, 5, '+');
        System.out.println(result);
    }
}
