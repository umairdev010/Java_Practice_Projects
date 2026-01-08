import java.sql.Array;
import java.util.Scanner;

public class SumAndAvgOfArray {
    static void main() {
        System.out.println("WELLCOME TO THE SYSTEM OF FINDING SUM AND AVERAGE OF AN ARRAY");
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER THE SIZE OF ARRAY : ");
        int sizeOfArray = input.nextInt();
        int[] inputArray = new int[sizeOfArray];
        int i = 0;
        while (i < sizeOfArray ){
            System.out.print("PLEASE ENTER THE NUMBER " + (i+1) + " OF THE ARRAY : ");
            inputArray[i] = input.nextInt();
            i++;
        }
        i=0;
        System.out.print("THE ARRAY ENTERED IS : ");
        while (i < inputArray.length){
            System.out.print(inputArray[i] + " ");
            i++;
        }

        long sumOfarray = sumOfArray(inputArray);

        System.out.println("THE SUM OF ARRAY IS = " + sumOfarray + " AND THE AVERAGE OF ARRAY IS " + (double) sumOfarray/inputArray.length);

    }

    public static long sumOfArray (int[] inputArray){
        long sumOfArray = 0;
        int i = 0;
        while (i < inputArray.length){
            sumOfArray+=inputArray[i];
            i++;
        }
        return sumOfArray;
    }

}
