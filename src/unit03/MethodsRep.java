package unit03;

import java.util.Objects;

public class MethodsRep {
    public static void main(String[] args) {
        printSmiley();
        String smiley0 = "😁";
        String smiley = returnSmiley();
        System.out.println(smiley);

        String happyOrSadSmiley = returnHappyOrSadSmiley("asd");
        System.out.println(happyOrSadSmiley);
    }

    public static void printSmiley() {
        System.out.println("😊");
    }
    public static String returnSmiley() {
        // load something from database
        return "😁";
    }

    // input: happy --> 🤣
    //          sad --> 😒
    public static String returnHappyOrSadSmiley(String happyOrSad) {
        if(happyOrSad.equals("happy") ) {
            return "😁";
        }
        else if(happyOrSad.equals("sad")) {
            return "😢";
        }
        else {
            return "😐";
        }
    }
}
