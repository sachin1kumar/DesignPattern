package com.company.decoratorpattern;

public class RedCarDecorator extends CarDecorator {

    private Car decoratedCar;

    public RedCarDecorator(Car decoratedCar) {
        super(decoratedCar);
        this.decoratedCar = decoratedCar;
    }

    @Override
    public void modify() {
        decoratedCar.modify();
        setRedColor(decoratedCar);
    }

    private void setRedColor(Car decoratedCar) {
        System.out.println("Honda car is now red");
    }
}
