package _ss12_java_collection_framework.excercise.arraylist_linkedlist_in_java_collection.linkedlist_ex;

import java.util.*;

public class ProductManager {
    public static Scanner input = new Scanner(System.in);
    public static List <Product> linkedList = new LinkedList<>();

    static {
        linkedList.add(new Product("SamSung", "SS", 5000)) ;
        linkedList.add(new Product("LG", "LG", 4000)) ;
        linkedList.add(new Product("Panasonic", "PN", 6000)) ;
        linkedList.add(new Product("Iphone", "IP", 8000)) ;
        linkedList.add(new Product("Blackberry", "BL", 6000)) ;
        linkedList.add(new Product("HTC", "HTC", 4500)) ;
    }

    public ProductManager() {
    }

    public void displayList() {
        System.out.println("*****THE LIST OF PRODUCTS****");
        for (Product item : linkedList)
            if (item != null) {
                System.out.println(item.toString());
            }
    }

    public void addProduct() {
        System.out.println("Enter the product's name: ");
        String name = input.nextLine();
        System.out.println("Enter the product's ID: ");
        String id = input.nextLine();
        System.out.println("Enter the product's price: ");
        double price = Double.parseDouble(input.nextLine());
        linkedList.add( new Product(name, id, price));
        System.out.println("Success adding!!");
        System.out.println("*****LIST AFTER ADDING*****");
        displayList();
    }

    public void editById() {
        System.out.println("Enter the ID of the product to edit:");
        String id = input.nextLine().toUpperCase();
        boolean check = true;
        for (Product item : linkedList) {
            if (item.getId().equals(id)) {
                System.out.println("Enter the new product's new name:");
                item.setName(input.nextLine());
                System.out.println("Enter the new product's new ID:");
                item.setId(input.nextLine());
                System.out.println("Enter the new product's new price:");
                item.setPrice(Double.parseDouble(input.nextLine()));
                System.out.println("Success editing!!");
                System.out.println("*****LIST AFTER EDITING*****");
                displayList();
                break;
            } else {
                check =false;
            }
        }
        if(!check){
            System.out.println("Not found the entered ID");
        }
    }

    public void removeById(){
        System.out.println("Enter the ID of the product to remove:");
        String id = input.nextLine().toUpperCase();
        boolean check = false;
        for (Product item : linkedList) {
            if (item.getId().equals(id)) {
                linkedList.remove(item);
                check = true;
                System.out.println("SUCCESS REMOVING!!");
                System.out.println("*****LIST AFTER REMOVING*****");
                displayList();
                break;
            }
        }
       if(!check){
           System.out.println( "Not found the entered ID in list!!");
       }
    }

    public void searchByName(){
        System.out.println("Enter the name of the product you need to search:");
        String name = input.nextLine().toUpperCase();
        boolean check = false;
        for (Product item : linkedList) {
            if (item.getName().toUpperCase().contains(name)) {
                System.out.println("THE PRODUCT WHICH WAS SEARCHED:");
                System.out.println(item.toString());
                check = true;
                break;
            }
        }
        if(!check){
            System.out.println( "Not found the entered product's name in list!!");
        }
    }

    public void sortUpAscending(){
        SortUpAscending sortUpAscending = new SortUpAscending();
        linkedList.sort(sortUpAscending);
        System.out.println("LIST AFTER SORTING UP ASCENDING");
        displayList();
    }

    public void sortDescending(){
        SortDescending sortDescending = new SortDescending();
        linkedList.sort(sortDescending);
        System.out.println("LIST AFTER SORTING DESCENDING");
        displayList();
    }
}

