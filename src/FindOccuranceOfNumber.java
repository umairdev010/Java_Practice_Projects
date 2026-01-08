import java.util.Scanner;

public class FindOccuranceOfNumber {
    static void main() {
        System.out.println("WELLCOME TO THE SYSTEM OF FINDING A NUMBER OCCURRENCE IN AN ARRAY");
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
        System.out.print("PLEASE ENTER NUMBER TO FIND : ");
        int numberToFind = input.nextInt();
        i = 0;
        System.out.print("THE ARRAY ENTERED IS : ");
        while (i < inputArray.length) {
            System.out.print(inputArray[i] + " ");
            i++;
        }
        System.out.println("\nTHE NUMBER " + numberToFind + " occurs " + findingOccurrence(inputArray,numberToFind) + " TIMES IN THE ARRAY.");
    }

    public static int findingOccurrence(int[] inputArray, int numb){
        int i = 0;
        int occurrence = 0;
        while (i < inputArray.length){
            if (inputArray[i]==numb) occurrence++;
            i++;
        }
        return occurrence;
    }
}
