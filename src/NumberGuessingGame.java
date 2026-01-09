import java.util.Scanner;

public class NumberGuessingGame {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELLCOME TO GUESSING GAME");
        int numb = 5;
        int guessedNumb ;
        do {
            System.out.print("PLEASE ENTER A NUMBER TO BETWEEN 1 TO 10 : ");
            guessedNumb = input.nextInt();
        } while (guessedNumb != numb);

        System.out.println("CONGRATULATIONS YOU GUESSED THE RIGHT NUMBER.");
    }
}
