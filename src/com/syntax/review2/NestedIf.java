package com.syntax.review2;

public class NestedIf {
    public static void main(String[] args) {

        boolean vaccine = false;
        int dose = 2;

        if (vaccine) {

            System.out.println("How many doses you have?");

            if (dose == 1) {
                System.out.println("Need a second shot");
            } else {
                System.out.println("You are fully vaccinated");
            }

        } else {
            System.out.println("I do not have a vaccine");
        }


    }
}
