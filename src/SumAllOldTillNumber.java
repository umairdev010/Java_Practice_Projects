import java.util.Scanner;

public class SumAllOldTillNumber {
    static void main() {
        System.out.println("WELLCOME TO TOOL WHICH PRINT SUM OF ALL OLD NUMBERS TILL GIVE NUMBER\n");
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER THE NUMBER : ");
        int inputVar = input.nextInt();
        System.out.println("THE SUM OF ALL OLD NUMBER TILL "+ inputVar + " is " + sumOfAllOld(inputVar));
    }
    static int sumOfAllOld(int numb){
        int i = 1;
        int totalSum = 0;
        while (i<=numb){
            totalSum+=i;
            i+=2;
        }
        return totalSum;
    }
}
