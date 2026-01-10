import java.util.Scanner;

public class ExitLoopByInput {
    static void main(String[] args) {
        System.out.println("WELLCOME TO SYSTEM TO EXIT PROGRAM BY ENTERING EXIT.");
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER A KEYWORD FOR PRINTING : ");
        String inputVar = input.nextLine();
        do {
            System.out.println("YOU ENTER : " + inputVar);
            System.out.print("PLEASE ENTER A KEYWORD FOR PRINTING (ENTER EXIT TO CLOSE) : ");
            inputVar = input.nextLine().trim();
        } while (!inputVar.equalsIgnoreCase("EXIT"));
    }
}
