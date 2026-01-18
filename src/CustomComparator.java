import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomComparator {
    static void main(String[] args) {
        System.out.println("wellcome to custom comparator learning.");
        List<String> newList = new ArrayList<>();
        newList.add("umair");
        newList.add("ali");
        newList.add("farhan");
        newList.sort(new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(0)-o2.charAt(0);
            }
        });
        System.out.println(newList);
    }
}
