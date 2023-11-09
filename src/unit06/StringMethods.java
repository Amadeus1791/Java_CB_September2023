package unit06;

public class StringMethods {
    public static void main(String[] args) {
        String s = "JAVA";
        String reverseString = reverseString(s);
        System.out.println(reverseString);

    }

    // "JAVA" ==> "AVAJ"
    public static String reverseString(String s) {
        String newString = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            newString = newString + s.charAt(i);
           // newString += s.charAt(i);
        }
        return newString;
    }

    // new method: printNumOfUppercaseAndLowercaseLetters()
    // (CodersBAY) ===> PRINT: you have 4 uppercase letters and 5 lowercase
    // codersbay   ===> PRINT: you have 9 lowercase letters
    // JAVA        ===> PRINT: you have 4 uppercase letters
    // ""          ===> PRINT: your string is empty

    // other method: convert a string to uppercase without using toUpperCase()
}
