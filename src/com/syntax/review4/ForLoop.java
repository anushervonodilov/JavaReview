package com.syntax.review4;

public class ForLoop {
    public static void main(String[] args) {

        for (int i = 2; i <= 20; i += 5) {
            System.out.println(i);
            if (i == 12) {
                System.out.println("i is equal to 12 - I am breaking my loop");
                break;
            }
        }

        System.out.println("**********************************");

        for (int i = 1; i <= 10; i++) {

            if (i % 3 == 0) {
                System.out.println(i);
                continue;
            }
            System.out.println("Hello");
        }


    }
}
