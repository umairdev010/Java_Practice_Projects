import java.io.FileWriter;
import java.util.Scanner;

public class FileWrite {
    static void main(String[] args) {
        try {
                System.out.println("WELLCOME TO MAKE A NEW FILE AND WRITE IN IT.");
                Scanner input = new Scanner(System.in);
                System.out.print("PLEASE ENTER THE NAME OF FILE WITH EXTENSION LIKE UMAIR.TXT : ");
                String fileName = input.next();
                FileWriter writer = new FileWriter(fileName);
                String content;
                do {
                    System.out.print("PLEASE WRITE WHAT TO WRITE IN THE FILE ENTER EXIT TO CLOSE : ");
                    content = input.next();
                    writer.write(content);
                } while (!(content.equalsIgnoreCase("exit")));
                writer.close();
                System.out.println("YOUR FILE IS SUCCESSFULLY WRITTEN.");
        } catch (Exception e) {
            System.out.printf("THE ERROR IS : %s", e.getMessage());
        }
    }
}
