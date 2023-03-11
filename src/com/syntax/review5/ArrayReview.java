package com.syntax.review5;

import java.util.Arrays;

public class ArrayReview {
    public static void main(String[] args) {

        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

//        System.out.println(arr[2]);
//        System.out.println(arr.length);
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        String[] colors = {"black", "white", "red", "purple", "blue"};

        for (String color : colors) {
            System.out.print(color + " ");
        }

        System.out.println();

        for (int i = 0; i < colors.length; i++) {
            System.out.print(colors[i] + " ");
        }

        System.out.println();

        for (int num : arr) {
            System.out.println(num);
        }

        System.out.println();

        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.print(colors[i] + " ");
        }

    }
}
