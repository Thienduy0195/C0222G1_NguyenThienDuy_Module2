package _08_clean_code_and_refactoring.excercise.tennis_game;

public class TennisTest {
    public static void main(String[] args) {
        System.out.println("The match of Jack and John:");
        TennisGame.getScore("Jack", "John", 2, 1);
        System.out.println("The match of Will and Owen:");
        TennisGame.getScore("Will", "Jordan", 2, 5);
        System.out.println("The match of Rudiger and Jordan:");
        TennisGame.getScore("Rudiger", "Owen", 4, 4);
    }
}
