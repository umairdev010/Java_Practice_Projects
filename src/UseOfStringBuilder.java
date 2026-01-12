public class UseOfStringBuilder {
    static void main(String[] args) {
        System.out.println("WELLCOME TO STRING CONCATENATION WITH THE HELP OF STRING BUILDER");
        String[] stringArray = {"apple","banana","grapes","watermelon","melon"};
        StringBuilder namesFruits = new StringBuilder("THE NAMES OF FRUITS IS");
        for (String fruit:stringArray){
            namesFruits.append(" ");
            namesFruits.append(fruit.toUpperCase());
        }
        System.out.println(namesFruits);
    }
}
