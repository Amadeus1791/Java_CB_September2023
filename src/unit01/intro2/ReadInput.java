package unit01.intro2;

import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int input = scanner.nextInt();
        System.out.println("You chose the number "+ input);
    }
}
