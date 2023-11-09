package unit03;

import java.util.Scanner;

public class While1 {
    public static void main(String[] args) {
      //  printNumFrom1To100();
        printEvenNumbers();
       // printNumFromLowerToUpperLimit(-475, 1289);
        int result = sumUpFromLowerToUpper(10, 8);
        System.out.println(result);
        readNumberUntil0();

    }

    public static void printNumFrom1To100() {
        int counter = 1;
        while (counter <= 100 ) {
            System.out.println(counter);
          //  counter = counter + 1;
            counter++;
        }
    }

    public static void printEvenNumbers(){
        int counter = 1;
        while (counter <= 100 ) {
            if(counter % 2 ==0) {
                System.out.println(counter);
            }
            counter++;
        }
    }

    public static void printNumFromLowerToUpperLimit(int lower, int upper) {
        int counter = lower;
        while (counter <= upper) {
            System.out.println(counter);
            //  counter = counter + 1;
            counter++;
        }
    }

    // BSP. (1,9) ===> 1+2+3+4+5+6+7+8+9
    public static int sumUpFromLowerToUpper(int from, int to) {
        int sum = 0;
        int counter = from;
        while (counter <= to) {
            sum = sum + counter; //1. sum = 0+1   2. sum = 1+2
            counter++;          // counter => 2
            // sum += counter;
        }
        return sum;
    }

    // BSP (1,2,3,6) ===> 3
    public static double averageOf4Numbers(int num1, int num2, int num3, int num4) {
        double sum = num1 + num2 + num3 + num4;
        return sum/4;
    }


    // BSP
    // please enter your number:
    // user: 5
    // your number is 5
    // do want to continue? press 0 to quit
    public static void readNumberUntil0() {
        Scanner scanner = new Scanner(System.in);
        int userInput = 1;
        while (userInput != 0) {
            System.out.println("please enter your number:");
            int num = scanner.nextInt();
            System.out.println("Your number is: "+num);
            System.out.println("do want to continue? press 0 to quit");
            userInput = scanner.nextInt();
        }

    }

}
