package com.syntax.review8;

public class InsuranceTest {
    public static void main(String[] args) {

        Insurance carPolicy = new CarPolicy("I6541987",
                "John Smith", 200, 22);
        carPolicy.getInsurance();
        System.out.println(carPolicy.calculateCoverage());

        Insurance petPolicy = new PetPolicy("P49848915",
                "Olena L", 20, 4);
        petPolicy.getInsurance();
        System.out.println(petPolicy.calculateCoverage());


    }
}
