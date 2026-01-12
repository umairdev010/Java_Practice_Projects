import java.util.Scanner;

public class MakingDice {
    static void main(String[] args) {
        System.out.println("WELLCOME TO A LUDO DICE SYSTEM");


        System.out.printf("\nTHE RANDOM NUMBER IS %d",dice());
        System.out.printf("\nTHE RANDOM NUMBER IS %d",dice());
        System.out.printf("\nTHE RANDOM NUMBER IS %d",dice());
        System.out.printf("\nTHE RANDOM NUMBER IS %d",dice());

    }

    public static int dice(){
        return (int) Math.ceil(Math.random() * 6);
    }

}
