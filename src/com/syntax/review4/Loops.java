package com.syntax.review4;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String answer;

        do {
            System.out.println("Do you understand loops in Java");
            answer = input.nextLine();
        } while (!answer.equalsIgnoreCase("yes"));

        System.out.println("Great Job, let's learn arrays now");


    }
}
