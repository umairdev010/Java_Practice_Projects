import java.util.Arrays;
import java.util.List;

public class LambdaProject3 {
    static void main(String[] args) {

        List<String> names = List.of("umair","ali","farhan","naveed","you","me");

        names.stream().filter(name -> name.length() > 3).forEach(name -> System.out.println(name));

    }
}
