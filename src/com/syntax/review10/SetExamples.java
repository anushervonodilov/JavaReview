package com.syntax.review10;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {

        Set<String> qaJobs = new HashSet();
        qaJobs.add("Automation Engineer");
        qaJobs.add("Manual Tester");
        qaJobs.add("SDET");
        qaJobs.add("QA Analyst");
        qaJobs.add("API Tester");
        qaJobs.add("Database Tester");
        System.out.println(qaJobs);

        qaJobs.remove("Manual Tester");
        System.out.println("Removed an element" + qaJobs);
        qaJobs.add("API Tester");
        qaJobs.add("API Tester");

        System.out.println("Added duplicates " + qaJobs);
        System.out.println(qaJobs.size());

        Set<String> lSet = new LinkedHashSet<>(qaJobs);
        System.out.println("LinkedHashSet = " + lSet);

        Set<String> tSet = new TreeSet<>();
        tSet.addAll(qaJobs);
        System.out.println("TreeSet = " + tSet);

    }
}
