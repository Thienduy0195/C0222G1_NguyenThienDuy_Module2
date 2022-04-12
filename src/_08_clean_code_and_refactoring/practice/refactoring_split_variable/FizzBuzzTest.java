package _08_clean_code_and_refactoring.practice.refactoring_split_variable;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        //test with number 3
        String expected3 = "Fizz";
        String result3 = FizzBuzz.fizzBuzz(3);
        FizzBuzz.assertEquals(expected3, result3);
        //test with number 5
        String expected5 = "Buzz";
        String result5 = FizzBuzz.fizzBuzz(5);
        FizzBuzz.assertEquals(expected5, result5);
        //test with number 7
        String expected7 = "Buzz";
        String result7 = FizzBuzz.fizzBuzz(7);
        FizzBuzz.assertEquals(expected7, result7);
    }
}
