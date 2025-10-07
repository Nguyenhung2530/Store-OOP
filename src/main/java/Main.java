package main;

import product.*;
import order.*;
import payment.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        ProductManager productManager = new ProductManager();
        productManager.addProduct(new ElectronicProduct("E001", "Laptop Dell XPS 13", 15000000, 5, "Electronic", "Silver", 24));
        productManager.addProduct(new ElectronicProduct("E002", "iPhone 15", 25000000, 3, "Electronic", "Black", 12));
        productManager.addProduct(new FoodProduct("F001", "Bánh quy bơ", 50000, 20, "Food", new Date(), "Việt Nam", 0.5));
        productManager.addProduct(new FoodProduct("F002", "Sữa tươi Vinamilk", 32000, 50, "Food", new Date(), "Việt Nam", 1.0));

        System.out.println("===== DANH SÁCH SẢN PHẨM =====");
        productManager.listProducts();

        PaymentMethod momo = new MomoPayment("0909123456");
        Order order = new Order("Nguyễn Văn A", momo);
        order.addItem(productManager.findProductById("E001"), 1);
        order.addItem(productManager.findProductById("F001"), 2);

        order.checkout();
    }
}
