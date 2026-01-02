import java.util.Scanner;

public class ReverseDigitsOfNumbers {
    static void main() {
        System.out.println("WELLCOME TO SYSTEM TO REVERSE DIGITS OF NUMBER");
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER A NUMBER : ");
        int inputVar = input.nextInt();
        System.out.println("THE RESULT FOR " + inputVar + " IS " + reverseNo(inputVar));
    }

    public static long reverseNo(int numb) {
        long finalNo = 0L;
        int digits = noOfDigits(numb);
        while (numb > 0) {
            long multiNo = powOfTen(10L, digits-1);
            finalNo += (numb % 10) * multiNo;
            numb /= 10;
            digits--;
        }
        return finalNo;
    }

    public static long powOfTen(long numb1, int numb2) {
        if (numb2 == 0) return 1L;
        long mainNo = numb1;
        while (numb2 > 1) {
            mainNo *= numb1;
            numb2--;
        }
        return mainNo;
    }

    public static int noOfDigits(int numb) {
        int i = 0;
        while (numb > 0) {
            i++;
            numb /= 10;
        }
        return i;
    }
}
