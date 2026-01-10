import java.util.Scanner;

public class MultipleTableByForLoop {
    static void main(String[] args) {
        System.out.println("WELLCOME TO MULTIPLICATION TABLE SYSTEM.");
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER A NUMBER FOR TABLE : ");
        int inputVar = input.nextInt();
        for (int i = 1 ; i <= 10 ; i++){
            System.out.println(inputVar + " x " + i + " = " + inputVar*i);
        }
    }
}
