import java.util.Scanner;

public class CheckGreatestOfThreeNumbers {
    static void main() {
        System.out.println("WELLCOME TO NUMBER CHECKING SYSTEM \n");
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER THE FIRST NUMBER : ");
        int firstVar = input.nextInt();
        System.out.print("PLEASE ENTER THE SECOND NUMBER : ");
        int secondVar = input.nextInt();
        System.out.print("PLEASE ENTER THE THIRD NUMBER : ");
        int thirdVar = input.nextInt();
        if (firstVar > secondVar && firstVar > thirdVar) {
            System.out.println(firstVar + " IS THE GREATEST NUMBER");
        } else if (secondVar > thirdVar) {
            System.out.println(secondVar + " IS THE GREATEST NUMBER");
        } else {
            System.out.println(thirdVar + " IS THE GREATEST NUMBER");
        }
    }
}
