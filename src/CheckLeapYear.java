import java.util.Scanner;

public class CheckLeapYear {
    static void main() {
        System.out.println("WELLCOME TO CHECK THE LEAP YEAR\n");
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER THE YEAR TO CHECK : ");
        int inputVar = input.nextInt();
        if (inputVar%4 == 0 && inputVar%100 != 0){
            System.out.println(inputVar + " IS A LEAP YEAR");
        } else if ( inputVar%400 == 0) {
            System.out.println(inputVar + " IS A LEAP YEAR");
        } else {
            System.out.println(inputVar + " IS NOT A LEAP YEAR");
        }
    }
}
