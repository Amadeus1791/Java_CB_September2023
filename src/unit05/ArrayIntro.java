package unit05;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        final int LENGTH = 10;
        int favoriteNumbers[] = new int[LENGTH];
        favoriteNumbers[0]= 2;
        favoriteNumbers[1]= 8;
        favoriteNumbers[2]= 14;
        favoriteNumbers[3]= 22;
        favoriteNumbers[4+3]= 54;
        System.out.println("test");
      //  favoriteNumbers[10]= 100;
        System.out.println("test2");
        System.out.println(Arrays.toString(favoriteNumbers));



        System.out.print("[");
        if (favoriteNumbers.length > 0) {
            System.out.print(favoriteNumbers[0]);
        }
        for (int i = 1; i < favoriteNumbers.length; i++) {
            System.out.print(", "+favoriteNumbers[i]);
        }
        System.out.println("]");


    }
}
