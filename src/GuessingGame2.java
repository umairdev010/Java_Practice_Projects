import java.util.Scanner;

public class GuessingGame2 {
    static void main(String[] args) {
        System.out.println("WELLCOME TO NUMBER GUESSING GAME");
        Scanner input = new Scanner(System.in);
        int randomNo = (int) Math.ceil(Math.random() * 10);
        int tries = 0;
        int inputNo;
        System.out.print("PLEASE ENTER A NUMBER TO GUESS TO WIN LESS THEN 10 : ");
        inputNo = input.nextInt();
        tries++;
        do {
            if (randomNo > inputNo){
                System.out.println("YOU GUESSED SMALLER NUMBER");
            } else {
                System.out.println("YOU GUESSED LARGER NUMBER");
            }
            System.out.print("PLEASE ENTER A NUMBER AGAIN TO GUESS TO WIN : ");
            inputNo = input.nextInt();
            tries++;
        } while (inputNo != randomNo);

        System.out.printf("CONGRATULATION YOU WIN THE GAME IN %d TRIES", tries);
    }
}
