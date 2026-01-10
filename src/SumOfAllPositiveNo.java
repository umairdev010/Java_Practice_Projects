import java.util.Scanner;

public class SumOfAllPositiveNo {
    static void main(String[] args) {
        System.out.println("WELLCOME TO SYSTEM OF PRINTING SUM OF ALL POSITIVE NUMBERS FROM ARRAY.");
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER THE SIZE OF ARRAY : ");
        int sizeOfArray = input.nextInt();
        int[] inputArray = new int[sizeOfArray];
        int i = 0;
        while (i < sizeOfArray) {
            System.out.print("PLEASE ENTER THE NUMBER " + (i + 1) + " OF THE ARRAY : ");
            inputArray[i] = input.nextInt();
            i++;
        }
        i = 0;
        System.out.print("THE ARRAY ENTERED IS : ");
        while (i < inputArray.length) {
            System.out.print(inputArray[i] + " ");
            i++;
        }
        System.out.println("THE SUM OF ALL POSITIVE NUMBERS IS " + sumofnumbs(inputArray));
    }

    public static int sumofnumbs (int[] inputArray){
        int mainSum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] < 0) continue;
            mainSum += inputArray[i];
        }
        return mainSum;
    }

}
