import java.util.Scanner;

public class CheckingArmstrong {
    static void main() {
        System.out.println("WELLCOME TO CHECK A NUMBER FOR ARMSTRONG");
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER A NUMBER TO CHECK : ");
        int inputVar = input.nextInt();
        if (checkArmstrong(inputVar)) {
            System.out.println("THE NUMBER " + inputVar + " IS ARMSTRONG");
        } else {
            System.out.println("THE NUMBER " + inputVar + " IS NOT ARMSTRONG");
        }
    }

    public static boolean checkArmstrong(int numb) {
        int finalNo = 0;
        int numbCopy = numb;
        int digits = noOfDigits(numbCopy);
        while (numb > 0) {
            finalNo += getPow(numb % 10, digits);
            numb /= 10;
        }
        return finalNo == numbCopy;
    }

    public static int getPow(int numb, int power) {
        int mainNo = 1;
        while (power > 0) {
            mainNo *= numb;
            power--;
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
