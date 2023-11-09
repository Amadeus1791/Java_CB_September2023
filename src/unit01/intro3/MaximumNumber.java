package unit01.intro3;

public class MaximumNumber {
    public static void main(String[] args) {
        //1. read 3 numbers from the user
        int num1 = 12;
        int num2 = 13;
        int num3 = 12;
        //2. print largest number
        int largest;

        if (num1 > num2) {
            // num1> num2 ---> num3?
            if (num1 > num3) {
                largest = num1;
            } // num1 > num2   ,   num3 >= num1
            else {
                largest = num3;
            }
        } else {  // num2 >=num1
            if (num2 > num3) {
                largest = num2;
            } else {
                largest = num3;
            }
        }
        System.out.println(largest);

        //3. optional: also print smallest number

    }
}
