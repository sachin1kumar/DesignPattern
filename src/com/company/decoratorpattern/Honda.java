package com.company.decoratorpattern;

public class Honda implements Car {
    @Override
    public void modify() {
        System.out.println("Car is Honda: Color is White");
    }
}
