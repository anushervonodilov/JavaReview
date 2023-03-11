package com.syntax.review5;

public class TwoDArrayReview {
    public static void main(String[] args) {

        int[][] array = {
                          {1, 2, 3},
                          {11, 12, 13},
                          {20, 21, 22},
                          {100, 101}

        };

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }



























//        for (int[] arr : array) {
//            for (int num : arr) {
//                if (num % 2 == 0) {
//                    System.out.print(num + " ");
//                }
//            }
//            System.out.println();
//        }














//        int numberOfArrays = array.length;
//        System.out.println(numberOfArrays);
//
//        int numberOfElementsIn1Array = array[0].length;
//        System.out.println(numberOfElementsIn1Array);
//
//        int numberOfElementsIn4Array = array[3].length;
//        System.out.println(numberOfElementsIn4Array);

//        System.out.println(array[2][1]);



    }
}
