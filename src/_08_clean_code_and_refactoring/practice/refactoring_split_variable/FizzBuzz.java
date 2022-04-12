package _08_clean_code_and_refactoring.practice.refactoring_split_variable;

public class FizzBuzz {
    public static String fizzBuzz(int number){
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;

        if(isFizz && isBuzz)
            return "FizzBuzz";

        if(isFizz)
            return "Fizz";

        if(isBuzz)
            return "Buzz";

        return number + "";
    }
    public static void assertEquals(String expected, String result){
        boolean check =  expected.equals(result);
        if (check){
            System.out.println("Right!!!");
        } else {
            System.out.println("Wrong!!");
        }
    }
}