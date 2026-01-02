import java.util.Scanner;

public class PrintMultiplicationTable {
    static void main() {
        System.out.println("WELLCOME TO TABLE PRINTING SYSTEM \n");
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER A NUMBER : ");
        int inputVar = input.nextInt();
        printTable(inputVar);
    }
    // FUNCTION FOR PRINTING TABLES
    static void printTable(int number){
        int i = 1;
        while (i<11){
            System.out.println(number + " x " + i + " = " + number*i );
            i++;
        }
    }
}
