import java.util.Scanner;

public class FindGCDofNumbers {
    static void main() {
        System.out.println("WELLCOME FOR FINDING GCD OF TWO NUMBERS\n");
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER THE FIRST NUMBER : ");
        int firstVar = input.nextInt();
        System.out.print("PLEASE ENTER THE SECOND NUMBER : ");
        int secondVar = input.nextInt();
        System.out.println("THE GCD OF " + firstVar + " AND " + secondVar + " is " + findingGCD(firstVar, secondVar));

    }

    public static int findingGCD(int numb1, int numb2) {
        if (numb1==0) return numb2;
        if (numb2==0) return numb1;
        int var1copy = numb1;
        int var2copy = numb2;
        while (true) {
            if (numb2 > numb1) {
                if (numb2 % numb1 == 0 && var1copy % numb1 == 0) return numb1;
                numb1--;
            } else {
                if (numb1 % numb2 == 0 && var2copy % numb2 == 0) return numb2;
                numb2--;
            }
        }
    }

}
