import java.util.Scanner;

public class FindingMaxByForLoop {
    static void main(String[] args) {
        System.out.println("WELLCOME TO FINDING MAX NUMBER IN AN ARRAY.");
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
        if (inputArray.length == 0) {
            System.out.println("SORRY TRY AGAIN THE ARRAY IS EMPTY.");
        } else {
            System.out.println("THE MAX NUMBER FROM THE GIVEN ARRAY IS " + checkingMax(inputArray));
        }
    }


    public static int checkingMax(int[] inputArray) {
        int maxNumb = inputArray[0];
        for (int i = 0; i < inputArray.length; i++) {
            if (maxNumb < inputArray[i]) {
                maxNumb = inputArray[i];
            }
        }
        return maxNumb;
    }

}
