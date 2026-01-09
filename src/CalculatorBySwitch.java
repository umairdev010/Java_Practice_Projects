import java.util.Scanner;

public class CalculatorBySwitch {
    static void main(String[] args) {
        System.out.println("WELLCOME TO SWITCH STATEMENT CALCULATOR");
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER NUMBER 1 : ");
        int inputVar = input.nextInt();
        System.out.print("PLEASE ENTER NUMBER 2 : ");
        int inputVar1 = input.nextInt();
        System.out.print("PLEASE ENTER OPERATOR + ,- ,* ,/ : ");
        char operator = input.next().charAt(0);
        if (operator == '/' && inputVar1 == 0) System.out.println("IN DIVIDE NUMBER TWO MUST BE GREATER THEN ZERO");

        String miannumb = switch (operator){
            case '+' -> (inputVar + inputVar1) + "";
            case '-' -> (inputVar - inputVar1) + "";
            case '*' -> (inputVar * inputVar1) + "";
            case '/' -> (inputVar / inputVar1) + "";
            default -> "OPERATOR IS WRONG";
        };
        System.out.println("THE " + inputVar + " " + operator + " " + inputVar1 + " IS EQUAL TO = " + miannumb);
    }
}
