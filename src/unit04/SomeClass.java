package unit04;

public class SomeClass {

    public static void main(String[] args) {
        // (1,true)  ==> 7
        // (8, false) ==> 8*9= 72 ==> ~65
        double r1 = calculatePizzaPrice(1, true);
        double r2 = calculatePizzaPrice(8, false);
        double r3 = calculatePizzaPrice(10, true);
//        System.out.println(r1);
//        System.out.println(r2);
//        System.out.println(r3);
        printLoop();
    }


    // (99,78) ==> Congrats you have a new highscore
    // (46, 102) ==> No highscore, keep going :)
    public String checkHighscore(int points, int highscore) {
        if (points > highscore) {
            return "congrats";
        }
        return "no highscore";
    }

    public boolean checkHighscore2(int points, int highscore) {
        if (points > highscore) {
            System.out.println("congrats");
            return true;
        }
        return false;
    }

    public boolean checkHighscore3(int points, int highscore) {
        return points > highscore;
    }


    public String returnSmiley(boolean b) {
        return b ? "😁" : "😒";
    }

    public String returnSmiley2(boolean b) {
        if (b == true) {
            return "😁";
        } else {
            return "😒";
        }
    }

    public String returnSmiley3(boolean b) {
        if (b) {
            return "😁";
        }
        return "😒";
    }


 /*   jede Pizza kostet 9 Euro
    Ab 5 bestellten Pizzen gibt es 10% Rabatt
    Bei Selbstabholung gibt es einen Preisnachlass von 2 Euro pro Pizza*/

    // (1,true)  ==> 7
    // (8, false) ==> 8*9= 72 ==> ~65
    public static double calculatePizzaPrice(int numberOfPizzas, boolean takeaway) {
        // 1. jede Pizza kostet 9 Euro
        int currentPizzaPrice = 9;
        int discount = 2;
        double result = numberOfPizzas * currentPizzaPrice;


        // 2. Ab 5 bestellten Pizzen gibt es 10% Rabatt
        if (numberOfPizzas >= 5) {
            result = result * 0.9;
        }
        // 3. Bei Selbstabholung gibt es einen Preisnachlass von 2 Euro pro Pizza
        if (takeaway == true) {
            result = result - (numberOfPizzas * discount);
        }
        return result;

    }

    public static void printLoop() {
        int counter = 1;
        int evenNumber = 0;
        while (counter <= 6) {
            System.out.println("Iteration "+ counter + " : "+ evenNumber);
            evenNumber = evenNumber+2;
            counter++;
        }

    }


}
