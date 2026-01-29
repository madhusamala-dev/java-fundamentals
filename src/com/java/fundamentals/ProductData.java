package com.java.fundamentals;

import java.util.Scanner;

public class ProductData {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Product ID: ");
        int productId = sc.nextInt();

        System.out.print("Enter Product Code (single character): ");
        char productCode = sc.next().charAt(0);

        System.out.print("Enter Category Code: ");
        char categoryCode = sc.next().charAt(0);

        System.out.print("Enter Quantity Available: ");
        short quantity = sc.nextShort();

        System.out.print("Enter Unit Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Discount Percentage: ");
        float discount = sc.nextFloat();

        System.out.print("Enter Supplier Contact Number: ");
        long supplierContact = sc.nextLong();

        System.out.print("Is Product Available (true/false): ");
        boolean isAvailable = sc.nextBoolean();

        System.out.print("Enter Product Rating (1–5): ");
        byte rating = sc.nextByte();

        System.out.println("\n--- Product Details ---");
        System.out.println("Product ID: " + productId);
        System.out.println("Product Code: " + productCode);
        System.out.println("Category Code: " + categoryCode);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Supplier Contact: " + supplierContact);
        System.out.println("Available: " + isAvailable);
        System.out.println("Rating: " + rating);

        sc.close();
    }
}
