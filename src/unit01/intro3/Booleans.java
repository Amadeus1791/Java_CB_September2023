package unit01.intro3;

public class Booleans {
    public static void main(String[] args) {
        boolean isThursday = false;
        boolean isWeekend = false;
        int num1 = 3;
        int num2 = 10;

        if (isThursday == true) {
            System.out.println("today is Thursday, keep going, weekend is coming soon");
        } else if(isWeekend==true) {
            System.out.println("Party");
        } else {
            System.out.println("Today is another weekday but NOT Thursday");
        }


        if (isWeekend == true) {
            System.out.println("Party!!!");
        }
        else {
            System.out.println("go to work");
        }


        if (num1 < num2) {
            System.out.println("num1 is smaller than num2");
            System.out.println("blabla");
        }
        else {
            System.out.println("num1 is greater or equal to num2");
        }


        if(num1 == num2) {
            System.out.println("num1 is equal num2");
        }
//        if(num1 != num2) {
//            System.out.println("num1 is not num2");
//        }
        else {
            System.out.println("num1 is not num2");
        }


    }
}
