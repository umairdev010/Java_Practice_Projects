package com.practice.utils;

import com.practice.geometery.Circle;
import com.practice.geometery.Rectangle;

public class Calculator {

    static void main(String[] args) {
        Rectangle rectangle = Rectangle.createRectangle(5,6);

        System.out.printf("THE AREA OF RECTANGLE IS %d \n",rectangle.calculateArea());

        Circle circle = new Circle(4);

        System.out.printf("THE AREA OF CIRCLE IS %d ", circle.calculateArea());
    }

}
