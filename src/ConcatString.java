import java.util.Scanner;

public class ConcatString {
    static void main(String[] args) {
        System.out.println("WELLCOME TO JOIN STRINGS AND PRINT THEM IN UPPER CASE");
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER A STRING (TEXT) : ");
        String inputString1 = input.next();
        System.out.print("PLEASE ENTER A STRING (TEXT) : ");
        String inputString2 = input.next();
        int age = 22;
        System.out.printf("THE RESUTL FOR NEW STRING %2S %2S",inputString1,inputString2);

        System.out.printf("\nTHE RESUTL FOR NEW STRING %2S %2S HIS AGE IS %d",inputString1,inputString2,age);

    }
}
