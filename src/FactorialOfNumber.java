import java.util.Scanner;

public class FactorialOfNumber {
    static void main() {
        System.out.println("WELLCOME TO SYSTEM FINDING FACTORIAL OF GIVEN NUMBER");
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER A NUMBER : ");
        int inputVar = input.nextInt();
        System.out.println("THE FACTORIAL OF THE NUMBER "+ inputVar + " is " + factorialOfN0(inputVar));
    }
    static int factorialOfN0(int numb){
        int totalProduct = 1;
        while (numb>1){
            totalProduct*=numb;
            numb--;
        }
        return totalProduct;
    }
}
