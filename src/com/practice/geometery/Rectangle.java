package com.practice.geometery;

public class Rectangle {
    int length;
    int width;

    Rectangle(int length , int width){
        this.length = length;
        this.width = width;
    }

    public static Rectangle createRectangle(int lenght1, int width1){
        return new Rectangle(lenght1,width1);
    }

    public int calculateArea(){
        return length * width;
    }

}
