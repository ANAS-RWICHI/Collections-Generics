package TP4;

import TP4.Product;

import java.util.ArrayList;
import java.util.Scanner;


public class ProductManagementApp {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product(1,"iPhone",100.00));
        products.add(new Product(2,"Ipad",200.00));
        products.add(new Product(3,"AirPods",300.00));

        System.out.println(products);

        products.remove(1);
        System.out.println("after removing product index 1 ");

        System.out.println(products);

        products.set(0, new Product(4, "Samsung", 500.0));

        System.out.println(products);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter product name: ");
        String SearchByUser = input.nextLine().toLowerCase();

        for (Product product : products) {
            if (SearchByUser.equals(product.getName().toLowerCase())){
                System.out.println(product);
            }
        }


    }
}
