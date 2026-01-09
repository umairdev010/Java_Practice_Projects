import java.util.Scanner;

public class MergeArrayAndSort {
    static void main(String[] args) {
        System.out.println("WELLCOME TO SYSTEM TO MERGE TWO ARRAY AND SORT THEM");
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER THE SIZE OF ARRAY : ");
        int sizeOfArray1 = input.nextInt();
        int[] inputArray1 = new int[sizeOfArray1];
        int i = 0;
        while (i < sizeOfArray1) {
            System.out.print("PLEASE ENTER THE NUMBER " + (i + 1) + " OF THE ARRAY : ");
            inputArray1[i] = input.nextInt();
            i++;
        }
        i = 0;
        System.out.print("THE ARRAY ENTERED IS : ");
        while (i < inputArray1.length) {
            System.out.print(inputArray1[i] + " ");
            i++;
        }
        System.out.print("\nPLEASE ENTER THE SIZE OF ARRAY : ");
        int sizeOfArray = input.nextInt();
        int[] inputArray = new int[sizeOfArray];
        i = 0;
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
        int[] mainArray = mergeArray(inputArray1,inputArray);
        int[] mergedArray = sortedArray(mainArray);
        i = 0;
        System.out.print("THE ARRAY MAIN IS : ");
        while (i < mergedArray.length) {
            System.out.print(mergedArray[i] + " ");
            i++;
        }
    }

    public static int[] mergeArray(int[] array1, int[] array2){
        int [] mainArray = new int[array1.length + array2.length];
        int i = 0;
        while (i < array1.length){
            mainArray[i] = array1[i];
            i++;
        }
        i = 0;
        while (i < array2.length){
            mainArray[array1.length+i] = array2[i];
            i++;
        }
        return mainArray;
    }

    public static int[] sortedArray(int[] inputArray){
        int i = 0;
        int k;
        while (i < inputArray.length-1){
            int j = 0;
            while (j < inputArray.length-i-1){
                if (inputArray[j] > inputArray[j+1]){
                    k = inputArray[j];
                    inputArray[j] = inputArray[j+1];
                    inputArray[j+1] = k;
                }
                j++;
            }
            i++;
        }
        return inputArray;
    }

}
