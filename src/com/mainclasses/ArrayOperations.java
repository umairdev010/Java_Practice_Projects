package com.mainclasses;

public class ArrayOperations {
    int[] inputArray;

    public ArrayOperations(int[] inputArray) {
        this.inputArray = inputArray;
    }

    public class Statistics {

        public void mean(){
            int totalSum = 0;
            for (int numb:inputArray){
                totalSum += numb;
            }
            System.out.printf("THE MEAN OF ARRAY IS %d",totalSum/inputArray.length);
        }

    }

}
