package com.syntax.review8;

import com.syntax.review7.Car;
import com.syntax.review7.Tesla;

public class CarTest {
    public static void main(String[] args) {

//        Bmw bmw = new Bmw("BMW", "X7");
//        bmw.start();
//        System.out.println(bmw.drive("smooth"));
//        bmw.brake();
//
//        Car car = new Car("SomeCar", "SomeModel");
//        car.start();
//        car.drive("DC", 90);
//
//        Tesla tesla = new Tesla("Tesla", "S", 2022, 350, "EV", true);
//        tesla.start();
//        tesla.drive(75, "CA");
//        tesla.haveAutoPilot();

        Car bmw1 = new Bmw("BMW", "X77");
        bmw1.start();
        bmw1.drive(100, "WA");
        bmw1.drive("Miami", 120);


    }
}
