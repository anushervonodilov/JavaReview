package com.syntax.review10;

import java.util.*;

public class AllElementsFromSet {
    public static void main(String[] args) {

        Set<String> qaJobs = new LinkedHashSet<>();
        qaJobs.add("Automation Engineer");
        qaJobs.add("Manual Tester");
        qaJobs.add("SDET");
        qaJobs.add("QA Analyst");
        qaJobs.add("API Tester");
        qaJobs.add("Database Tester");

//        System.out.println(qaJobs);
//
//        for (String qaJob : qaJobs) {
//            System.out.println(qaJob);
//        }

        Iterator<String> qa = qaJobs.iterator();
        while (qa.hasNext()) {
            String element = qa.next();
            System.out.println(element);
        }

    }
}
