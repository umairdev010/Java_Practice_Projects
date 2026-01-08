import java.util.Scanner;

public class CheckArraySorted {
    static void main() {
        System.out.println("WELLCOME TO CHECK ARRAY IS SORTED AND NOT");
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
        System.out.println("THE INPUT ARRAY IS " + (checksorted(inputArray) ? " SORTED." : " NOT SORTED."));
    }

    public static boolean checksorted(int[] inputArray) {
        if (inputArray.length == 0 && inputArray.length == 1) return true;
        int i = 0;
        while (true) {
            if (inputArray[i] > inputArray[i + 1]) return false;
            if (i + 2 == inputArray.length) return true;
            i++;
        }
    }
}
