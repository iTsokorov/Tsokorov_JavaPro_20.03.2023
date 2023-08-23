package com.hillel.homework15;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Product> products1 = new ArrayList<>();
        products1.add(new Product("Apple", 50.0));
        products1.add(new Product("Book", 300.0));
        products1.add(new Product("Book", 200.0));
        products1.add(new Product("Magazine", 150.0));
        products1.add(new Product("Disk", 400.0));


        List<Product> productBook = Product.getBooks(products1);

        System.out.println("Result of getBook method:");
        System.out.println(productBook);

        List<Product> products2 = new ArrayList<>();
        products2.add(new Product("Apple", 50.0, true));
        products2.add(new Product("Book", 300.0, true));
        products2.add(new Product("Book", 200.0,true));
        products2.add(new Product("Magazine", 150.0, false));
        products2.add(new Product("Disk", 400.0, false));

        List<Product> productsBookWithDiscount = Product.getBooksWithDiscount(products2);

        System.out.println("Result of getBookWithDiscount method:");
        System.out.println(productsBookWithDiscount);

        List<Product> products3 = new ArrayList<>();
        products3.add(new Product("Apple", 50.0, true));
        products3.add(new Product("Book", 300.0, true));
        products3.add(new Product("Book", 200.0,true));
        products3.add(new Product("Book", 150.0, false));
        products3.add(new Product("Disk", 400.0, false));


        System.out.println("Result of getCheapestProduct method:");
        try {
            Product cheapestBook = Product.getCheapestProduct(products3);
            System.out.println(cheapestBook);
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
        }

        List<Product> products4 = new ArrayList<>();
        products4.add(new Product("Apple", 50.0, true, LocalDateTime.of(2023, 8, 23, 21, 4)));
        products4.add(new Product("Book", 150.0, true, LocalDateTime.of(2023, 8, 23, 21, 3)));
        products4.add(new Product("Magazine", 400.0, true, LocalDateTime.of(2023, 8, 23, 21, 2)));
        products4.add(new Product("Disc", 300.0, true, LocalDateTime.of(2023, 8, 23, 21, 1)));
        products4.add(new Product("Disc", 333.0, true, LocalDateTime.now()));

        List<Product> lastThreeProducts = Product.getLastThreeProducts(products4);

        System.out.println("Result of getLastThreeProducts method:");
        System.out.println(lastThreeProducts);

        List<Product> products5 = new ArrayList<>();
        products5.add(new Product("Apple", 50.0, true, LocalDateTime.of(2023, 8, 23, 21, 4)));
        products5.add(new Product("Book", 10.0, true, LocalDateTime.of(2022, 8, 23, 21, 3)));
        products5.add(new Product("Book", 22.0, true, LocalDateTime.of(2023, 8, 23, 21, 2)));
        products5.add(new Product("Book", 40.0, true, LocalDateTime.of(2023, 8, 23, 21, 1)));
        products5.add(new Product("Book", 333.0, true, LocalDateTime.now()));

        double totalPrice = Product.calculateTotalPrice(products5);
        System.out.println("Result of calculateTotalPrice method: " + totalPrice);

        List<Product> products6 = new ArrayList<>();
        products6.add(new Product("Apple", 50.0, true, LocalDateTime.of(2023, 8, 23, 21, 4)));
        products6.add(new Product("Book", 10.0, true, LocalDateTime.of(2022, 8, 23, 21, 3)));
        products6.add(new Product("Book", 22.0, true, LocalDateTime.of(2023, 8, 23, 21, 2)));
        products6.add(new Product("Disc", 40.0, true, LocalDateTime.of(2023, 8, 23, 21, 1)));
        products6.add(new Product("Disc", 333.0, true, LocalDateTime.now()));

        Map<String, List<Product>> groupedProducts = Product.groupedByKind(products6);
        System.out.println("Result of groupedByKind method:");
        System.out.println(groupedProducts);
    }
}
