import java.util.Scanner;

public class PrintingStarPatterns {
    static void main() {
        System.out.println("WELLCOME TO PRINTING STAR PATTERN");
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER A NUMBER : ");
        int inputVar = input.nextInt();
        printStar1(inputVar);
        printStar2(inputVar);
    }

    public static void printStar1(int numb) {
        String star = "*";
        String mainString = "";
        int i = 0;
        while (numb > i) {
            if (i>0) mainString+=" ";
            mainString+=star;
            i++;
            System.out.println(mainString);
        }
    }
    public static void printStar2(int numb) {
        String star = "*";
        String mainString = "";
        while (numb > 0){
            int i = 0;
            while (i<numb){
                mainString+=star;
                if (i+1!=numb) mainString+=" ";
                i++;
            }
            System.out.println(mainString);
            mainString="";
            numb--;
        }
    }
}
