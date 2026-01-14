package com.practice.utils;

import com.practice.geometery.Circle;
import com.practice.geometery.Rectangle;

public class Calculator {

    void calculatingArea() {
        Rectangle rectangle = Rectangle.createRectangle(5, 6);

        System.out.printf("THE AREA OF RECTANGLE IS %d \n", rectangle.calculateArea());

        Circle circle = new Circle(4);

        System.out.printf("THE AREA OF CIRCLE IS %d ", circle.calculateArea());
    }

    void add(int a, int b){
        System.out.printf("THE SUM OF A AND B IS %d",(a+b));
    }

    void add(int a, int b, int c){
        System.out.printf("\nTHE SUM OF A , B AND C %d",(a+b+c));
    }

    void add(double a,double b){
        System.out.printf("\nTHE SUM OF A AND B %f",(a+b));
    }

    static void main(String[] args) {

        Calculator calculator = new Calculator();

//        calculator.calculatingArea();

        calculator.add(3,5);
        calculator.add(5,5,6);
        calculator.add(5.4,6.4);

    }

}
