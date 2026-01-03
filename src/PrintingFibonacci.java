import java.util.Scanner;

public class PrintingFibonacci {
    static void main() {
        System.out.println("WELLCOME TO PRINTING FIBONACCI SERIES FOR A NUMBER");
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER A NUMBER : ");
        int inputVar = input.nextInt();
        System.out.println("THE FIBONACCI SERIES OF THE NUMBER " + inputVar +" IS " + getFibonacci(inputVar));
    }
    public static String getFibonacci(int numb){
        if (numb <= 0) return "0";
        int a = 0;
        int b = 1;
        int c = 0;
        String mainString="0 1";
        while (numb>a+b){
            c=a+b;
            mainString=mainString + " " + c;
            a=b;
            b=c;
        }
        return mainString;
    }
}
