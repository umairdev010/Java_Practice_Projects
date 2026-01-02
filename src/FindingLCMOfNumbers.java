import java.util.Scanner;

public class FindingLCMOfNumbers {
    static void main() {
        System.out.println("WELLCOME TO FIND LCM OF TWO NUMBERS");
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER THE FIRST NUMBER : ");
        int firstVar= input.nextInt();
        System.out.print("PLEASE ENTER THE SECOND NUMBER : ");
        int secondVar = input.nextInt();
        System.out.println("THE LCM OF GIVEN NUMBER " + firstVar + " AND " + secondVar + " is " + lcmOfNumbers(firstVar,secondVar));

    }
    static int lcmOfNumbers(int numb1,int numb2){
        if ((numb1 <= 0) || (numb2 <= 0)) return 0;
        int i = 1;
        while (true){
            if ((numb1*i)%numb2==0) return numb1*i;
            i++;
        }
    }
}
