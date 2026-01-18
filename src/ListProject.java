import java.util.ArrayList;
import java.util.List;

public class ListProject {
    static void main(String[] args) {
        System.out.println("WELLCOME TO THE LEARNING OF LIST.");
        ArrayList<String> listOfNames = new ArrayList<>();
        listOfNames.add("umair");
        listOfNames.add("ali");
        listOfNames.add("naveed");
        listOfNames.add("farhan");
        listOfNames.add("farhan");
        listOfNames.add("awais");
        listOfNames.add("umair");
        listOfNames.add("farhan");
        listOfNames.add("farhan");
        listOfNames.add("farhan");
//        System.out.println(listOfNames.indexOf("awais"));
//        String name = listOfNames.get(3);
//        System.out.println(listOfNames.remove("awais"));
        System.out.println(removeDuplicate(listOfNames));
    }

    static ArrayList removeDuplicate(ArrayList inputList){
        for (int i = 0; i < inputList.size() - 1; i++) {
            System.out.println(inputList);
            for (int j = 1;j < inputList.size() - i;j++){
                if (inputList.get(i).equals(inputList.get(j+i))){
                    inputList.remove(j+i);
                    j=1;
                }
            }
        }
        return inputList;
    }

}
