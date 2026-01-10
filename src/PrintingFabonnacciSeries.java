import java.util.Scanner;

public class PrintingFabonnacciSeries {
    static void main(String[] args) {
        System.out.println("WELLCOME TO PRINT FIBONACCI SERIES FOR THE NUMBER ENTER");
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER A NUMBER : ");
        int inputVar = input.nextInt();
        System.out.print("THE FIBONACCI SERIES IS : ");
        for (int i = 0; i < inputVar; i++) {
            System.out.print( previousNumb(i) + " ");
        }
    }

    public static int previousNumb (int numb){
        if (numb == 0) return 0;
        if (numb == 1) return 1;
        return (previousNumb(numb-1) + previousNumb(numb-2));
    }
}
