package unit05;

import java.util.Arrays;

public class ArrayIntro2 {
    public static void main(String[] args) {
        // [1,2,3,4,....100]

        int[] numbers = new int[100];
        // not like this 😒
     /*   numbers[0] = 1;
        numbers[1] = 2;*/

        // do it like this 😁
        for (int i = 0; i < numbers.length; i++) {
           // i ++   <==> i = i +1
            numbers[i] = i+1;
        }
        System.out.println(Arrays.toString(numbers));

        // now take every slot times 2 ==> [2,4,6,8, ....]
        for (int i = 0; i < numbers.length; i++) {
           // numbers[i] *=2;
            numbers[i] = numbers[i]*2;
        }
        System.out.println(Arrays.toString(numbers));

        // now we want to print our array backwards
        for (int i = numbers.length-1 ; i >= 0; i--) {
            System.out.print(numbers[i]+" ");
        }

    }
}
