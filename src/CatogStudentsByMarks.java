import java.util.Scanner;

public class CatogStudentsByMarks {
    static void main(String[] args) {
        System.out.println("WELLCOME TO STUDENT CATEGORY SYSTEM");
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER PERCENTAGE OF STUDENT : ");
        int inputVar = input.nextInt();
        System.out.println("THE STUDENT IS IN CATEGORY OF " + (inputVar >= 80?"HIGH":(inputVar < 80 && inputVar >= 50?"MEDIUM":"LOW")) + " STUDENTS." );
    }
}
