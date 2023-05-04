package com.simformsolutions.sort;

public class Products implements Comparable<Products> {
    String productName;
    int productPrice;

    Products(String productName, int productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public int compareTo(Products o) {
        if (productPrice > o.productPrice) {
            return 1;
        } else if (productPrice < o.productPrice) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Products{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
