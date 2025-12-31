import java.util.Scanner;

public class CheckOldAndEven {
    static void main() {
        System.out.println("WELLCOME TO CHECK OLD AND EVEN\n");
        System.out.print("PLEASE ENTER THE NUMBER TO CHECK : ");
        Scanner input = new Scanner(System.in);
        int inputVar = input.nextInt();
        if (inputVar%2 == 0) {
            System.out.println("THE GIVEN NUMBER IS EVEN");
        } else {
            System.out.println("THE GIVEN NUMBER IS OLD");
        }
    }
}
