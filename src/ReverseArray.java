import java.util.Scanner;

public class ReverseArray {
    static void main() {
        System.out.println("WELLCOME TO SYSTEM TO REVERSE AN ARRAY");
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
        reverseArray(inputArray);
    }
    public static void reverseArray(int[] inputArray){
        int[] mainArray = new int[inputArray.length];
        int i = 0;
        while (i < inputArray.length){
            mainArray[i] = inputArray[inputArray.length-i-1];
            i++;
        }
        i=0;
        System.out.print("THE ARRAY REVERSE IS : ");
        while (i < mainArray.length){
            System.out.print(mainArray[i] + " ");
            i++;
        }
    }
}
