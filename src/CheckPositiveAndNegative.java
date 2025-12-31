import java.util.Scanner;

class CheckPositiveAndNegative {
    public static void main(String[] args) {
        System.out.print("Hello Please enter the number to check :");
        Scanner input = new Scanner(System.in);
        int inputVar = input.nextInt();
        if (inputVar > 0){
            System.out.println("THE NUMBER YOU GIVE IS POSITIVE");
        } else if (inputVar < 0) {
            System.out.println("THE NUMBER YOU GIVE IS NEGATIVE");
        } else {
            System.out.println("THE NUMBER IS EQUAL TO ZERO");
        }
    }
}