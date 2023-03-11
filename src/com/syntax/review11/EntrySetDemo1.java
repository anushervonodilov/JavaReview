package com.syntax.review11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EntrySetDemo1 {
    public static void main(String[] args) {

        Map<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 12.5);
        fruit.put("Banana", 4.9);
        fruit.put("Dragon Fruit", 5.6);
        fruit.put("Pear", 16.5);
        fruit.put("Orange", 15.5);
        fruit.put("Mango", 10.6);

        fruit.entrySet().removeIf(entry -> (entry.getKey().contains("a") || entry.getKey().contains("e")) && entry.getValue() > 8);
        System.out.println(fruit);

//        Iterator<Map.Entry<String, Double>> iterator = fruit.entrySet().iterator();
//        while (iterator.hasNext()) {
//            var entry = iterator.next();
//            String key = entry.getKey();
//            Double value = entry.getValue();
//            if ((key.contains("a") || key.contains("e")) && value > 8) {
//                iterator.remove();
//            }
//        }

    }
}
