package com.company.bridgepattern;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 100, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 100, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
