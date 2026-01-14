package com.mainclasses;

public class Circle extends Shape{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    void calculateArea() {
        System.out.printf("The Area Of Circle is %d", (int) (Math.PI * Math.pow(radius,2)));
    }

    static void main(String[] args) {
        Shape newCircle = new Circle(5);
        newCircle.calculateArea();
    }

}
