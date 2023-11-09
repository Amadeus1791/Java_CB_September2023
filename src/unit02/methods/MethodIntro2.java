package unit02.methods;

import java.util.Scanner;

public class MethodIntro2 {
    public static void main(String[] args) {
        int number = 8;
        printIfNumberIsEvenOrOdd(number);
        add2Numbers(2,9);
        max(2,4);
        min(5,10);
        readInputAndPrint();

    }
    // METHODS
    public static void printIfNumberIsEvenOrOdd(int num) {
        if(num % 2 == 0) {
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }
    }

    // -2 ==> your number is negative
    // 4 ==> your number is positive
   // public static void
    public static void add2Numbers (int num1, int num2) {
        int result = num1 + num2;
        System.out.println("your result is: "+result );
    }

    // min(3,8) ==> your maximum is 8
    public static void max(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("Your max is "+num1);
        } else {
            System.out.println("Your max is "+num2);
        }
    }
    public static void min(int num1, int num2) {
        if (num1 < num2) {
            System.out.println("Your min is "+num1);
        } else {
            System.out.println("Your min is "+num2);
        }
    }

    public static void readInputAndPrint() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scanner.nextInt();
        System.out.println("Your number is "+number);
    }

}
