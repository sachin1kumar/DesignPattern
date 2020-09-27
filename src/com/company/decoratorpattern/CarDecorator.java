package com.company.decoratorpattern;

abstract public class CarDecorator implements Car {

    private Car decoratedCar;

    public CarDecorator(Car decoratedCar) {
        this.decoratedCar = decoratedCar;
    }

    public void modify() {
        decoratedCar.modify();
    }
}
