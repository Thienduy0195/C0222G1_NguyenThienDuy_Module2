package _01_loop_in_java.excercise;

import java.util.Scanner;

public class DisplayDrawingImage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i <3 ; i++) {
                        for(int j=0; j<7; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Display the first square triangle ");
                    for (int i = 0; i < 5 ; i++) {
                        for (int j = 0; j < 5-i;j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println("Display the second square triangle ");
                    for (int i = 0; i <5 ; i++) {
                        for(int j =0; j<=i; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println("Display the third square triangle ");
                    for (int i = 1; i <=5 ; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if ((j < i)) {
                                System.out.print("  ");
                            } else {
                                System.out.print("* ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println("Display the fourth square triangle ");
                    for (int i = 1; i <= 5 ; i++) {
                        for (int j = 1; j <=5 ;j++){
                            if(j>5-i){
                                System.out.print("* ");
                            }else{
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    for (int i = 0; i < 5;i++ ) {
                        for(int j = 1; j<=9; j++){
                            if(j>=5-i && j<= 5+i){
                                System.out.print("* ");
                            } else{
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
