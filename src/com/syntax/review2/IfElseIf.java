package com.syntax.review2;

public class IfElseIf {
    public static void main(String[] args) {

        int task = 30;

        if (task > 25) {
            System.out.println("Great Job");
        } else if (task > 20) {
            System.out.println("Good Job");
        } else if (task > 10) {
            System.out.println("Ok Job");
        } else if (task > 5) {
            System.out.println("Not Good Job");
        }

        String browser = "opera";

        if (browser.equals("chrome")) {
            System.out.println("Test cases executed on chrome browser");
        } else if (browser.equals("safari")) {
            System.out.println("Test cases executed on safari browser");
        } else if (browser.equals("firefox")) {
            System.out.println("Test cases executed on firefox browser");
        } else {
            System.out.println("Browser is not supported");
        }

    }
}
