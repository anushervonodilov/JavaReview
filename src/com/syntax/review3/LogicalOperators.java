package com.syntax.review3;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean loginButtonDisplayed = true;
        boolean loginButtonClickable = true;

        if (loginButtonDisplayed && loginButtonClickable) {
            System.out.println("Test case is passed");
        } else {
            System.out.println("Test case failed");
        }




    }
}
