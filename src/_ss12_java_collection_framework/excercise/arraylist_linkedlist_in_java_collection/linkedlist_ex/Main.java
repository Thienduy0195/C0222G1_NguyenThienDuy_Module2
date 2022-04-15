package _ss12_java_collection_framework.excercise.arraylist_linkedlist_in_java_collection.linkedlist_ex;

import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        while (true){
            System.out.println();
            System.out.println("1. Displaying the list of products.");
            System.out.println("2. Adding a product in to list.");
            System.out.println("3. Editing product.");
            System.out.println("4. Removing product.");
            System.out.println("5. Searching product in list.");
            System.out.println("6. Sorting ascending");
            System.out.println("7. Sorting descending.");
            System.out.println("0. Exit.");
            System.out.println("Enter your choice: ");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    productManager.displayList();
                    break;
                case 2:
                    productManager.addProduct();
                    break;
                case 3:
                    productManager.editById();
                    break;
                case 4:
                    productManager.removeById();
                    break;
                case 5:
                    productManager.searchByName();
                    break;
                case 6:
                    productManager.sortUpAscending();
                    break;
                case 7:
                    productManager.sortDescending();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
