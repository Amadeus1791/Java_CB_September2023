package unit05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallenge {
    public static void main(String[] args) {
        readArray();
    }

    public static void readArray() {
        System.out.println("Enter the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        final int SIZE = scanner.nextInt();
        double[] arr = new double[SIZE];
        for (int i = 0; i < SIZE; i++) {
            System.out.println("Enter element" + (i + 1) + ": ");
            double value = scanner.nextDouble();
            arr[i] = value;
        }
        System.out.println(Arrays.toString(arr));
    }
    //Enter size: ?
    // user: 3
    // Enter element 1: .....(=input from user)
    // Enter element 2: .....(=input from user)
    // Enter element 3: .....(=input from user)

    // Your elements are: [1,2,3]
    // the sum of your elements is 6
    // the average is ....2
    // your array is sorted/not sorted


    //1. MAX
    // [1,2,3] ==> 3

    //2. DUPLICATE VALUE
    // [1,2,3] ==> [1,1,2,2,3,3]

    //3. ONLY EVEN NUMBERS
    // [2,4,6] ==> TRUE
    // [3,4,6] ==> FALSE

    //4. SAME ARRAY
    // [2,4], [2,4] ==> TRUE
    // [2,4], [2,5] ==> FALSE

    //
}
