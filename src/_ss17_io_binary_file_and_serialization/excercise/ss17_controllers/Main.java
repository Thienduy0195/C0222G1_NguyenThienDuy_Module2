package _ss17_io_binary_file_and_serialization.excercise.ss17_controllers;

import _ss17_io_binary_file_and_serialization.excercise.ss17_models.ProductManager;

import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println(" 1. Displaying the list of products \n 2. Adding a new product \n 3. Searching a product \n 0. Exit \n Please enter your choice!");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    ProductManager.display();
                    break;
                case 2:
                    ProductManager.addNew();
                    break;
                case 3:
                    ProductManager.searchProduct();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
