import java.util.Scanner;

public class CheckingString {
    static void main(String[] args) {
        System.out.println("WELLCOME TO CHECKING STRING IS PALINDROME OR NOT");
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER A STRING FOR CHECKING : ");
        String inputString = input.nextLine();

        System.out.println("THE INPUT STRING IS " + (checkingString(inputString) ? "PALINDROME" : "NOT PALINDROME"));
    }

    public static boolean checkingString(String inputString){
        boolean b = inputString.length() == 1;
        if (b) return true;
        if (inputString.length() != 0 && inputString.charAt(0) == inputString.charAt(inputString.length() - 1)){
            return checkingString(inputString.substring(1,inputString.length() - 1));
        }

        return false;
    }

}
