package com.practice.geometery;

public class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int calculateArea(){
        return (int) ( Math.PI * Math.pow(radius , 2));
    }
}
