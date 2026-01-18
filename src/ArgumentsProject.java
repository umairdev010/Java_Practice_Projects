public class ArgumentsProject {
    static void main(String[] args) {
        System.out.println("WELLCOME TO THE LEARNING OF VARIABLE ARGUMENTS.");
        System.out.println(concatString("umair"," ","good"," ","boy"));
    }

    static String concatString(String... inputArray){
        StringBuilder mainString = new StringBuilder();
        for (String string: inputArray){
            mainString.append(string);
        }
        return String.valueOf(mainString);
    }

}
