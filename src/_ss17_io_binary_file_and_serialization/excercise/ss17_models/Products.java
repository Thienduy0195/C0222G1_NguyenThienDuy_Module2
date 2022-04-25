package _ss17_io_binary_file_and_serialization.excercise.ss17_models;

import java.io.Serializable;

public class Products implements Serializable {
    private String id;
    private String name;
    private String firm;
    private double price;
    private String describe;

    public Products() {
    }

    public Products(String id, String name, String firm, double price, String describe) {
        this.id = id;
        this.name = name;
        this.firm = firm;
        this.price = price;
        this.describe = describe;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "PRODUCT INFORMATION: " +
                "ID=" + id +
                ", NAME='" + name + '\'' +
                ", FIRM='" + firm + '\'' +
                ", PRICE=" + price +
                ", DESCRIPTION='" + describe;
    }
}
