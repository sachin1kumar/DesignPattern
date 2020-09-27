package com.company.decoratorpattern;

public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Car car = new Honda();

        Car redCar = new RedCarDecorator(new Honda());

        //white honda car..
        car.modify();

        //Red honda car..
        redCar.modify();
    }
}
