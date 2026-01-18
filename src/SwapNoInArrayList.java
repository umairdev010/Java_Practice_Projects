import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapNoInArrayList {
    static void main(String[] args) {
        System.out.println("Wellcome To Swap No In ArrayList.");
        List<String> inputList = new ArrayList<>(Arrays.asList("umair","ali","naveed","farhan","abbas"));
        System.out.println(swapValue(inputList,1,3));
        List<Integer> intList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println(swapValue(intList,2,5));
    }

    static <T> List<T> swapValue(List<T> inputList, int a, int b){
        T reserveValue = inputList.get(a);
        inputList.set(a,inputList.get(b));
        inputList.set(b,reserveValue);
        return inputList;
    }

}
