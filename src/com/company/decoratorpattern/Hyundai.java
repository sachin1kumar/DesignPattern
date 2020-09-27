package com.company.decoratorpattern;

public class Hyundai implements Car {
    @Override
    public void modify() {
        System.out.println("Car is Hyundai");
    }
}
