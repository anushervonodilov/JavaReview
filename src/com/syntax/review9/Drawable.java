package com.syntax.review9;

public interface Drawable {

    String TOOL = "Pencil";
    void draw();

    default void printName() {
        System.out.println("We are drawing an object using " + TOOL);
    }

    static void erase() {
        System.out.println("All drawings are erasable");
    }

}

abstract class Shape {

    public String color;
    protected double width, length;

    Shape(String color, double width, double length) {
        this.color = color;
        this.width = width;
        this.length = length;
    }

    public abstract double calculateArea();

}

class Rectangle extends Shape implements Drawable {

    Rectangle(String color, double width, double length) {
        super(color, width, length);
    }

    public double calculateArea() {
        return length * width;
    }

    public void draw() {
        System.out.println("I am drawing a rectangle");
    }

}

class Square implements Drawable {

    public void draw() {
        System.out.println("I am drawing a square");
    }

}
