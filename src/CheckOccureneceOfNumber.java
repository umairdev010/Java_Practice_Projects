import java.util.Scanner;

public class CheckOccureneceOfNumber {
    static void main(String[] args) {
        System.out.println("WELLCOME TO CHECK OCCURRENCE OF SPECIFIC NUMBER FROM A ARRAY");
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
        System.out.print("PLEASE ENTER A NUMBER FOR CHECKING FROM ARRAY : ");
        int checkNo = input.nextInt();
        System.out.println("THE OCCURRENCE FOR THE NUMBER IS : " + checkOccurrence(inputArray,checkNo));
    }

    public static int checkOccurrence(int[] inputArray, int checkingNo){
        int occurrence = 0;
        for (int numb : inputArray){
            if (numb == checkingNo) occurrence++;
        }
        return occurrence;
    }

}
