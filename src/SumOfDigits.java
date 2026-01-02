import java.util.Scanner;

public class SumOfDigits {
    static void main() {
        System.out.println("WELLCOME TO FIND SUM OF DIGITS OF AN INTEGER");
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER A NUMBER : ");
        int inputVar = input.nextInt();
        System.out.println("THE SUM OF ALL DIGITS OF THE NUMBER " + inputVar + " is " + sumOfDigits(inputVar));

    }
    static int sumOfDigits(int numb){
        int sumOfDigit = 0;
        while (numb > 0){
            sumOfDigit+=(numb%10);
            numb/=10;
        }
        return sumOfDigit;
    }
}
