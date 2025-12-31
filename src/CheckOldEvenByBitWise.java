import java.util.Scanner;

public class CheckOldEvenByBitWise {
    static void main() {
        System.out.println("WELLCOME TO CHECKING OLD AND EVEN\n");
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER THE NUMBER TO CHECK : ");
        int inputVar = input.nextInt();
        if ((inputVar & 1) == 1) {
            System.out.println("NUMBER YOU ENTERED IS ODD");
        } else {
            System.out.println("NUMBER YOU ENTERED IS EVEN");
        }
    }
}
