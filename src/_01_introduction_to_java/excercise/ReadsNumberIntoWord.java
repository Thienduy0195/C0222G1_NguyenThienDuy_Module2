package _01_introduction_to_java.excercise;

import java.util.Scanner;

public class ReadsNumberIntoWord {

    public static String read1To10(int n) {
        String str = "";
        switch (n) {
            case 0:
                str = "Zero";
                break;
            case 1:
                str = "One";
                break;
            case 2:
                str = "Two";
                break;
            case 3:
                str = "Three";
                break;
            case 4:
                str = "Four";
                break;
            case 5:
                str = "Five";
                break;
            case 6:
                str = "Six";
                break;
            case 7:
                str = "Seven";
                break;
            case 8:
                str = "Eight";
                break;
            case 9:
                str = "Nine";
                break;
            case 10:
                str = "Ten";
                break;
        }
        return str;
    }

    public static String read11To19(int n) {
        String str = "";
        switch (n) {
            case 1:
                str = "Eleven";
                break;
            case 2:
                str = "Twelve";
                break;
            case 3:
                str = "Thirteen";
                break;
            case 5:
                str = "Fifteen";
                break;
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
                str = read1To10(n) + "teen";
                break;
        }
        return str;
    }

    public static String read21To99(int n) {
        String str = "";
        switch (n) {
            case 2:
                str = "Twenty";
                break;
            case 3:
                str = "Thirty";
                break;
            case 5:
                str = "Fifty";
                break;
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
                str = read1To10(n) + "ty";
                break;
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        int num;
        num = sc.nextInt();
        if (num >= 0 && num <= 10) {
            System.out.println(read1To10(num));
        } else if (num > 10 && num <= 19) {
            System.out.println(read11To19(num % 10));
        } else if (num >= 20 && num <= 99) {
            System.out.println(read21To99((num - (num % 10)) / 10) + " " + read1To10(num % 10));
        } else if(num%100==0) {
            System.out.println(read1To10(num / 100) + " " + "hundred");
        }else {
            int hundred = (num - (num % 100));
            int tens = ((num % 100) - ((num % 100) % 10));
            int ones = (num % 100) - tens;
            System.out.println(read1To10(hundred / 100) + " hundred and " + read21To99(tens / 10) + " " + read1To10(ones));
        }
    }
}

