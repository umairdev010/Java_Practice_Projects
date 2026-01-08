import java.security.PublicKey;
import java.util.Scanner;

public class FindingMinAndMaxNo {
    static void main() {
        System.out.println("WELLCOME TO FINDING MAX AND MIN NUMBER FROM AN ARRAY");
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
        System.out.println("THE MAX NUMBER IS = " + findingMaxNumb(inputArray));
    }

    public static int findingMaxNumb(int[] inputArray){
        int i = 0;
        while (i < inputArray.length){
            int j = 0;
            while (inputArray[i] >= inputArray[j]){
                if (j+1==inputArray.length) return inputArray[i];
                j++;
            }
            i++;
        }
        return 0;
    }

}
