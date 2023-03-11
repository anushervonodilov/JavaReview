package com.syntax.review10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {

        Map<String, Double> grocery = new HashMap<>();
        grocery.put("Milk", 5.99);
        grocery.put("Eggs", 6.50);
        grocery.put("Bread", 2.99);
        grocery.put("Tea", 4.99);
        grocery.put("Cucumber", 2.50);
        grocery.put("Eggs", 7.99);
        grocery.put("Tomato", 2.50);

        Double teaPrice = grocery.get("Tea");
        System.out.println(teaPrice);

        System.out.println(grocery);
        int size = grocery.size();
        System.out.println("Number of objects = " + size);

        Map<String, Double> lMap = new LinkedHashMap<>();
        lMap.put("Milk", 5.99);
        lMap.put("Eggs", 6.50);
        lMap.put("Bread", 2.99);
        lMap.put("Tea", 4.99);
        lMap.put("Cucumber", 2.50);
        lMap.put("Eggs", 7.99);
        lMap.put("Tomato", 2.50);

        System.out.println("Order is preserved " + lMap);

        System.out.println("---------------------------------------------");

        Map<String, Double> tMap = new TreeMap<>();
        tMap.putAll(grocery);
        tMap.putAll(lMap);

        System.out.println("Size = " + tMap.size());
        System.out.println("Sorted Order " + tMap);


    }
}
