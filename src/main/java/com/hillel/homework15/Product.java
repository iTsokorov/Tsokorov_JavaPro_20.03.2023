package com.hillel.homework15;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Product {
    private final String kind;
    private final Double price;
    private boolean isDiscount;
    private LocalDateTime dateAdd;
    private int id;

    public Product(String kind, Double price) {
        this.kind = kind;
        this.price = price;
    }

    public Product(String kind, Double price, boolean isDiscount) {
        this.kind = kind;
        this.price = price;
        this.isDiscount = isDiscount;
    }

    public Product(String kind, Double price, boolean isDiscount, LocalDateTime dateAdd) {
        this.kind = kind;
        this.price = price;
        this.isDiscount = isDiscount;
        this.dateAdd = dateAdd;
    }

    public Product(String kind, Double price, boolean isDiscount, LocalDateTime dateAdd, int id) {
        this.kind = kind;
        this.price = price;
        this.isDiscount = isDiscount;
        this.dateAdd = dateAdd;
        this.id = id;
    }

    public static List<Product> getBooks(List<Product> productList) {
        Double correctPrice = 250.0;
        return productList.stream()
                .filter(product -> product.getKind().equals("Book"))
                .filter(product -> product.getPrice() > correctPrice)
                .collect(Collectors.toList());
    }

    public static List<Product> getBooksWithDiscount(List<Product> productList) {
        return productList.stream()
                .filter(product -> product.getKind().equals("Book"))
                .filter(Product::isDiscount)
                .map(product -> new Product(product.getKind(), product.getDiscountPrice(), product.isDiscount()))
                .collect(Collectors.toList());
    }

    public static Product getCheapestProduct(List<Product> productList) throws ProductNotFoundException{
        return productList.stream()
                .filter(product -> product.getKind().equals("Book"))
                .min(Comparator.comparing(Product::getPrice))
                .orElseThrow(() -> new ProductNotFoundException("Product [Kind: Book] is not found"));
    }

    public static List<Product> getLastThreeProducts(List<Product> productList) {
        return productList.stream()
                .sorted(Comparator.comparing(Product::getDateAdd).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public static Double calculateTotalPrice(List<Product> productList) {
        LocalDateTime currentDate = LocalDateTime.now();
        Double currentPrice = 75.0;
        return productList.stream()
                .filter(product -> product.getKind().equals("Book"))
                .filter(product -> product.getDateAdd().getYear() == currentDate.getYear())
                .filter(product -> product.getPrice() <= currentPrice)
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public static Map<String, List<Product>> groupedByKind(List<Product> productList) {
        return productList.stream()
                .collect(Collectors.groupingBy(Product::getKind));


    }
        public String getKind() {
        return kind;
    }

    public Double getPrice() {
        return price;
    }

    public boolean isDiscount() {
        return isDiscount;
    }

    public Double getDiscountPrice() {
        if (isDiscount) {
            return price * 0.9;
        }
        return price;
    }

    public LocalDateTime getDateAdd() {
        return dateAdd;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Kind = " + kind +
                ", Price = " + price;
    }

}
