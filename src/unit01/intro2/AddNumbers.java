package unit01.intro2;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        // I only need the scanner at the beginning:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number 1: ");
        int input1 = scanner.nextInt();
        System.out.println("You chose the number " + input1);

        System.out.println("Please enter your number 2: ");
        int input2 = scanner.nextInt();
        System.out.println("You chose the number " + input2);

        int result = input1 + input2;
        System.out.println("Your result is " + result);
    }
}
