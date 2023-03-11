package com.syntax.review7;

public class Car {

    protected String make, model;
    int year, horsepower;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Car(String make, String model, int year, int horsepower) {
        this(make, model);
        this.year = year;
        this.horsepower = horsepower;
    }

    public void start() {
        System.out.println(make = " starts");
    }

    void drive(int speed) {
        System.out.println(make + "drives with speed " + speed);
    }

    protected String drive(String destination) {
        System.out.println(make + " drives to " + destination);
        return destination;
    }

    public void drive(int speed, String destination) {
        System.out.println(make + " drives to " + destination + " with speed = " + speed);
    }

    public void drive(String destination, int speed) {
        System.out.println(make + " drives to " + destination + " with speed = " + speed);
    }

}
