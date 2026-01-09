import java.util.Scanner;

public class SearchFromTwoDArray {
    static void main(String[] args) {
        System.out.println("WELLCOME TO SEARCH VALUE FROM 2 D ARRAY");
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER NUMBER OF ROWS : ");
        int rows = input.nextInt();
        System.out.print("PLEASE ENTER NUMBER OF COLUMNS : ");
        int columns = input.nextInt();
        int[][] inputArray = new int[rows][columns];
        int i = 0;
        while (i < rows){
            int j = 0;
            while (j < columns){
                System.out.print("PLEASE ENTER NUMBER FOR " + (i+1) + " ROW AND " + (j+1) + " COLUMN : ");
                inputArray[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        i=0;
        while (i<inputArray.length){
            int j = 0;
            while (j < inputArray[i].length){
                if (j+1 != inputArray[i].length) System.out.print(inputArray[i][j] + "  ");
                if (j+1 == inputArray[i].length) System.out.println(inputArray[i][j]);
                j++;
            }
            i++;
        }
        System.out.print("PLEASE ENTER A NUMBER TO SEARCH : ");
        int searchnumb = input.nextInt();
        System.out.println("THE NUMBER YOU GIVE IS " + (searchNumb(inputArray , searchnumb)?"PRESENT":"NOT PRESENT" + " IN THE ARRAY."));

    }

    public static boolean searchNumb (int[][] inputArray , int numb){
        int i=0;
        while (i<inputArray.length){
            int j = 0;
            while (j < inputArray[i].length){
                if (inputArray[i][j] == numb) return true;
                j++;
            }
            i++;
        }
        return false;
    }

}
