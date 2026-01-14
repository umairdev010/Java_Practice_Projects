package com.mainclasses;

public class Eagle extends Bird{

    @Override
    public void fly() {
        System.out.println("THE EAGLE IS FLYING IN THE AIR.");
    }


    static void main(String[] args) {
        Bird eagle = new Eagle();
        eagle.fly();
    }

}
