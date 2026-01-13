package com.mainclasses;

public class ArrayOperation {
    static int[] inputArray;

    public static void setArray(int[] inputArray){
        ArrayOperation.inputArray = inputArray;
    }

    public static class Statistics {
        public static void mean(){
            int totalSum = 0;
            for (int numb:inputArray){
                totalSum += numb;
            }

            System.out.printf("THE MEAN OF THE ARRAY IS %d",totalSum/inputArray.length);
        }
    }

}
