import java.util.Arrays;
import java.util.List;

public class LambdaProject2 {
    static void main(String[] args) {
        List<String> names = Arrays.asList("umair","ali","salman","naveed");

        names.stream().forEach(name -> System.out.println(name));

    }
}

