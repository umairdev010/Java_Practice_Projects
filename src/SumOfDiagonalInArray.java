import java.util.Scanner;

public class SumOfDiagonalInArray {
    static void main(String[] args) {
        System.out.println("WELLCOME TO PRINTING SUM OF DIAGONAL OF 2 D ARRAY.");
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
        System.out.println("THE SUM FOR 1ST DIAGONAL IS : " + sumfromleft(inputArray));
        System.out.println("THE SUM FOR 2ND DIAGONAL IS : " + sumfromright(inputArray));
    }

    public static int sumfromleft(int[][] inputArray){
        int i= 0;
        int totalSum = 0;
        int j = 0;
        while (i < inputArray.length){
            totalSum += inputArray[i][j];
            j++;
            i++;
        }
        return totalSum;
    }
    public static int sumfromright(int[][] inputArray){
        int i= 0;
        int totalSum = 0;
        while (i < inputArray.length){
            totalSum += inputArray[i][inputArray.length-1-i];
            i++;
        }
        return totalSum;
    }

}
