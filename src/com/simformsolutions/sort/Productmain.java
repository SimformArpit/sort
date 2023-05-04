package com.simformsolutions.sort;

import java.util.ArrayList;
import java.util.Collections;

public class Productmain {
    public static void main(String[] args) {
        ArrayList<Products> productsArrayList = new ArrayList<>();
        productsArrayList.add(new Products("Laptop", 60000));
        productsArrayList.add(new Products("Iphone 14 pro max", 100000));
        productsArrayList.add(new Products("iWatch", 20000));
        productsArrayList.add(new Products("Headphone", 2000));
        productsArrayList.add(new Products("Airconditionar", 38000));
        productsArrayList.add(new Products("Audi Car", 4300000));
        Collections.sort(productsArrayList);
        for (Products p :
                productsArrayList) {
            System.out.println(p);
        }
    }
}
