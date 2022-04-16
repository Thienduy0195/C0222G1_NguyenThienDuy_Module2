package _ss12_java_collection_framework.excercise.arraylist_linkedlist_in_java_collection.arraylist;


public class Product {
    private String name;
    private String id;
    private double price;

    public Product() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String name, String id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    @Override
    public String toString() {
        return "PRODUCT: " +
                "Name: " + name +
                ", ID: " + id + ", Price: " + price;
    }
}
