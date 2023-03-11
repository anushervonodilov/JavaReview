package com.syntax.review2;
import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {

//        double d = 5;
//        System.out.println(d);
//
//        int i = (int) 5.0;
//        System.out.println(i);
//
//        byte b = (byte) 128;
//        System.out.println(b);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();

        System.out.println("Enter your mobile number");
        String mobileNumber = input.nextLine();

        System.out.println("Enter your age");
        int age = input.nextInt();


        System.out.println("Your name is " + name + ", " + "your age is " + age + " and your mobile number is " + mobileNumber);


    }

}
