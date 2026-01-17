import java.io.FileReader;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("WELCOME TO READ A NEW FILE FROM THE SYSTEM.");
            System.out.print("PLEASE ENTER THE NAME OF FILE WITH EXTENSION LIKE UMAIR.TXT : ");
            String fileName = input.nextLine();

            try (FileReader reader = new FileReader(fileName)) {
                int character;
                while ((character = reader.read()) != -1) {
                    System.out.print((char) character);
                }
            }
        } catch (Exception e) {
            System.out.printf("THE ERROR IS : %s", e.getMessage());
        }
    }
}