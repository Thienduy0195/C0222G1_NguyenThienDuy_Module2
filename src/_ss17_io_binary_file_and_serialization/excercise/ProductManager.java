package _ss17_io_binary_file_and_serialization.excercise;


import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProductManager implements Serializable {
    static Scanner input = new Scanner(System.in);

    static List<Products> productsList = new LinkedList<>();

    static {
        productsList.add(new Products("SSS3", "Galaxy S3", "Samsung", 5000, "A good product"));
        productsList.add(new Products("APIP", "13 Pro max", "Apple", 17000, "A excellent product"));
        productsList.add(new Products("RMN", "Red Mi note 6", "Oppo", 5000, "A good product"));
        productsList.add(new Products("SSGF", "Galaxy Fold 3", "Samsung", 15000, "A nice product"));
        productsList.add(new Products("APIPA", "Ipad Mini 3", "Apple", 15000, "A nice product"));
    }


    public static void display() {
        writeObj();
        readObject();
        for (Products item : productsList) {
            System.out.println(item);
        }
        writeObj();
        write();
    }

    public static void addNew() {
        System.out.println("Enter the ID of new product: ");
        String id = input.nextLine().toUpperCase();
        System.out.println("Enter the name of new product: ");
        String name = input.nextLine();
        System.out.println("Enter the firm of new product: ");
        String firm = input.nextLine();
        System.out.println("Enter the price of new product: ");
        double price = inputPrice();
        System.out.println("Enter the description of new product: ");
        String describe = input.nextLine();
        productsList.add(new Products(id, name, firm, price, describe));
        System.out.println("*******Succeed adding a new product!*******");
        writeObj();
        write();//viết sản phẩm mới vào file product dạng character để xem
    }

    public static void searchProduct() {
        System.out.println("Please enter the name of the product you're searching: ");
        String productName = input.nextLine();
        boolean check = false;
        for (Products item : productsList) {
            if (item.getName().toLowerCase().contains(productName.toLowerCase())) {
                check = true;
                System.out.println("The product which you're searching: ");
                System.out.println(item);
                break;
            }
        }
        if (!check) {
            System.out.println("Not found the product's entered name!");
        }
    }

    public static void readObject() {
        productsList = (List<Products>) ReadAndWriteProduct.readFileBinary("src/_ss17_io_binary_file_and_serialization/excercise/obj.csv");
    }

    public static void writeObj() {
        ReadAndWriteProduct.writeFileBinary("src/_ss17_io_binary_file_and_serialization/excercise/obj.csv", productsList);
    }


    //viết thông tin sản phẩm vào 1 file mà dev có thể đọc được
    public static void write() {
        ReadAndWriteProduct.writeFile("src/_ss17_io_binary_file_and_serialization/excercise/products.csv", productsList);
    }

    private static double inputPrice() {
        double price = 0;
        boolean check = true;
        while (check) {
            try {
                check = false;
                price = Double.parseDouble(input.nextLine());
                if (price < 0) {
                    throw new NumberInputException("Please enter the positive number or zero (with free product)");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number:");
                check = true;
            } catch (NumberInputException e) {
                System.out.println(e.getMessage());
                check = true;
            }
        }
        return price;
    }
}
