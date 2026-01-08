import java.util.Scanner;

public class DeleteNumberFromArray {
    static void main() {
        System.out.println("WELLCOME TO SYSTEM FOR DELETING A NUMBER FROM ARRAY");
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
        System.out.print("\n PLEASE ENTER A NUMBER TO DELETE : ");
        int deletenumb = input.nextInt();
        int[] newArray = deletingNumber(inputArray,checkOccurence(inputArray,deletenumb),deletenumb);
        i = 0;
        System.out.print("THE ARRAY AFTER DELETING NUMBER IS : ");
        while (i < newArray.length) {
            System.out.print(newArray[i] + " ");
            i++;
        }
    }
    public static int[] deletingNumber(int[] inputArray, int occurrence , int numb){
        int[] mainArray = new int[inputArray.length-occurrence];
        int i = 0;
        int j = 0;
        while (i < inputArray.length){
            if (inputArray[i] != numb){
                mainArray[j] = inputArray[i];
                j++;
            }
            i++;
        }
        return mainArray;
    }
    public static int checkOccurence(int[] inputArray ,int numb){
        int occurence = 0;
        int i = 0;
        while (i < inputArray.length){
            if (inputArray[i] == numb) occurence++;
            i++;
        }
        return occurence;
    }
}
