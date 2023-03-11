package com.syntax.review5;

import java.util.Scanner;

public class ArrayWithScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many names do you want to store?");
        int size = input.nextInt();
        String[] name = new String[size];

        for (int i = 0; i < name.length; i++) {

            System.out.println("Please enter name");
            name[i] = input.next();
        }

        for (String names : name) {
            System.out.println(names);
        }


    }
}
