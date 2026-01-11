package TP4;

import java.util.Scanner;

public class Product {
    private long id;
    private String name;
    private double price;
    public Product(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + '}';
    }
    public String getName(){
        return name;
    }
}
