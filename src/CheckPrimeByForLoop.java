import java.util.Scanner;

public class CheckPrimeByForLoop {
    static void main(String[] args) {
        System.out.println("WELLCOME TO SYSTEM FOR CHECKING A NUMBER FOR PRIME AND NOT.");
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER A NUMBER FOR CHECKING : ");
        int inputVar = input.nextInt();
        int division = 0;
        for (int i = 2; i < inputVar; i++) {
            if (inputVar % i ==0){
                division++;
            }
        }
        System.out.println("THE GIVEN NUMBER IS " + (division > 0 ? "NOT PRIME" : "PRIME"));
    }
}
