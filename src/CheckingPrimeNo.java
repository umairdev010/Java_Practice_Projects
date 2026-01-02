import java.util.Scanner;

public class CheckingPrimeNo {
    static void main() {
        System.out.println("WELLCOME TO THE PRIME NUMBER CHECKING SYSTEM");
        Scanner inout = new Scanner(System.in);
        System.out.print("PLEASE ENTER A NUMBER : ");
        int inputVar = inout.nextInt();
        System.out.println(inputVar + " IS " + primeChecker(inputVar) + " NUMBER");
    }

    public static String primeChecker(int numb) {
        if (numb==1) return "NOT PRIME";
        if (numb==2 || numb==3) return "PRIME";
        int i = 2;
        while(true){
            if (numb%i==0) return "NOT PRIME";
            i++;
            if (numb==i) return "PRIME";
        }
    }
}
