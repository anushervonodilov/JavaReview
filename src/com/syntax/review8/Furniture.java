package com.syntax.review8;

public class Furniture {

    public void assemble() {
        System.out.println("Furniture needs to be assembled");
    }

    public void comfort() {
        System.out.println("Furniture needs to be comfortable");
    }

    private void use() {
        System.out.println("Furniture is used by humans");
    }

    public static void breaks() {
        System.out.println("Furniture breaks");
    }

}

class Chair extends Furniture {

    public static void breaks() {
        System.out.println("Chair can break too");
    }

    private void use() {
        System.out.println("Chair is used by humans to seat");
    }

    public void comfort() {
        System.out.println("Not every chair is comfortable");
    }

    protected void loveSeat() {
        System.out.println("This is the best chair");
    }

}

class Table extends Furniture {

    public void comfort() {
        System.out.println("Table cannot be comfortable");
    }

    protected void buildTable() {
        System.out.println("We can easily build a table");
    }

    void buildTable(String material) {
        System.out.println("We build table from " + material);
    }

}
