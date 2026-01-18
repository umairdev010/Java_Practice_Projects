import java.util.HashMap;
import java.util.Scanner;

public class MapProject {
    static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<>();
        countries.put("pakistan", "islamabad");
        countries.put("china", "beijing");
        countries.put("india", "dehli");
        System.out.println("WELLCOME TO COUNTRY PRINTING ENTER THE COUNTRY NAME AND WE GIVE YOU ITS CAPITAL.");
        Scanner input = new Scanner(System.in);
        String country;
        String message = "PLEASE ENTER NAME OF COUNTRY : ";
        do {
            System.out.print(message);
            country = input.nextLine();
            message = "PLEASE ENTER THE COUNTRY NAME AGAIN ENTERED COUNTRY IS NOT FOUND: ";
        } while (!countries.containsKey(country));
        System.out.printf("THE CAPITAL OF %S IS : %S", country, countries.get(country));
    }
}
