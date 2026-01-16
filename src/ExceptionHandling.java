import java.util.Scanner;

public class ExceptionHandling {
    static void main(String[] args) {
        try {
            System.out.println("WELLCOME TO EXCEPTIONAL HANDLING IN JAVA");
            Scanner input = new Scanner(System.in);
            System.out.print("PLEASE ENTER THE FIRST NUMBER : ");
            int var1st = input.nextInt();
            System.out.print("PLEASE ENTER THE SECOND NUMBER : ");
            int var2nd = input.nextInt();
            System.out.printf("THE DIVISION OF TWO NUMBER IS %d", var1st/var2nd);
        } catch (ArithmeticException e){
            System.out.printf("THERE IS A ERROR : %s",e.getMessage());
            // Exception is main class of all error which parent class is throwable
        } catch (Exception e){
            System.out.printf("THERE IS A Exception ERROR : %s",e.getMessage());
        }
    }
}
