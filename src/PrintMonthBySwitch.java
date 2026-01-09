import java.util.Scanner;

public class PrintMonthBySwitch {
    static void main(String[] args) {
        System.out.println("WELLCOME TO MONTH PRINTING SYSTEM BY SWITCH STATEMENT");
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER NUMBER FOR MONTH : ");
        int inputVar = input.nextInt();
        if (inputVar < 13) System.out.print("THE MONTH IS ");
        switch (inputVar){
            case 1:
                System.out.println("JANUARY");
                break;
            case 2:
                System.out.println("FEBRUARY");
                break;
            case 3:
                System.out.println("MARCH");
                break;
            case 4:
                System.out.println("APRIL");
                break;
            case 5:
                System.out.println("MAY");
                break;
            case 6:
                System.out.println("JUNE");
                break;
            case 7:
                System.out.println("JULY");
                break;
            case 8:
                System.out.println("AUGUST");
                break;
            case 9:
                System.out.println("SEPTEMBER");
                break;
            case 10:
                System.out.println("OCTOBER");
                break;
            case 11:
                System.out.println("NOVEMBER");
                break;
            case 12:
                System.out.println("DECEMBER");
                break;
            default:
                System.out.println("YOU ENTER THE WRONG NUMBER.");
        }
    }
}
