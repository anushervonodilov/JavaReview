package com.syntax.review11;

import java.util.HashMap;
import java.util.Map;

public class EntrySetDemo {
    public static void main(String[] args) {

        Map<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 12.5);
        fruit.put("Banana", 4.9);
        fruit.put("Dragon Fruit", 5.6);
        fruit.put("Pear", 16.5);
        fruit.put("Orange", 15.5);
        fruit.put("Mango", 10.6);

        for (var entry : fruit.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            if ((key.contains("a") || key.contains("e")) && value > 8) {
                System.out.println(key + " " + value);
            }
        }


    }
}
