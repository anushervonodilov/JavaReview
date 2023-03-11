package com.syntax.review9;

public class Bank {
    public static void main(String[] args) {

        Customer c = new Customer();
        c.setName("Slava Friz");
        System.out.println("Name of the customer is " + c.getName());

        c.setSsn(1234566789);
        System.out.println("SSN of the customer is " + c.getSsn());

    }
}
