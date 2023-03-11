package com.syntax.review7;

public class Methods {

    int findLargest(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    double findAverage(double num1, double num2) {
        return (num1 + num2) / 2;
    }

    String reverseString(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }

    int arr(int[] array) {
        int minimum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        return minimum;
    }

    public static void main(String[] args) {

        Methods methods = new Methods();
        int largest = methods.findLargest(10, 20);
        System.out.println("The largest number is " + largest);

        System.out.println("The average is " + methods.findAverage(10, 30));

        System.out.println(methods.reverseString("Syntax"));

        int[] nums = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        System.out.println(methods.arr(nums));

    }
}
