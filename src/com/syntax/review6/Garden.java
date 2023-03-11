package com.syntax.review6;

public class Garden {

    void hello() {

        String name = "Adem";
        System.out.println("Hello " + name);

    }

    public static void main(String[] args) {

        String str;

        Flower flower1 = new Flower();
        System.out.println(Flower.pretty);
        flower1.name = "Hibiscus";
        flower1.color = "red";
        flower1.price = 5;

        System.out.println(flower1.price);

        flower1.bloom();
        flower1.grow();
        flower1.smell();


        System.out.println("Creating second object of the flower class");

        Flower flower2 = new Flower();
        flower2.name = "Rose";
        flower2.color = "blue";
        flower2.price = 15;
        flower2.price = 18;
        System.out.println(flower2.price);

        flower2.bloom();
        flower2.grow();
        flower2.smell();

        Flower flower3 = new Flower();




    }
}
