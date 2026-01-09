import java.util.Scanner;

public class PasswordChecker {
    static void main(String[] args) {
        System.out.println("WELLCOME TO PASSWORD CHECKER : ");
        Scanner input = new Scanner(System.in);
        int password;
        do {
            System.out.print("PLEASE ENTER A PASSWORD TO CHECK BUT IN NUMBERS ALSO ABOVE 6 DIGITS: ");
            password = input.nextInt();
        } while (password < 999999);

        System.out.println("PASSWORD IS SUCCESSFULLY SET TO " + password);

    }
}
