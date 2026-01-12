import java.util.Scanner;

public class AreaAndCircumOfCircle {
    static void main(String[] args) {
        System.out.println("WELLCOME TO CALCULATE AREA AND CIRCUMFERENCE OF A CIRCLE");
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER THE DIAMETER OF CIRCLE : ");
        int diameterOfCircle = input.nextInt();

        System.out.printf("THE CIRCUMFERENCE OF THE CIRCLE IS =%1f",(2*Math.PI*diameterOfCircle/2));

        System.out.printf("\nTHE AREA OF THE CIRCLE IS =%1f",(Math.PI*Math.pow(diameterOfCircle/2,2)));

    }
}
