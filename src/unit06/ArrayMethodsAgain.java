package unit06;

public class ArrayMethodsAgain {
    public static void main(String[] args) {

    }

    // method 1
    // [1,2,3] ==> 3
    public int lengthOfArray(int[] arr) {
        int counter=0;
        for (int i = 0; i < arr.length; i++) {
            counter++;
        }
        return counter;
    }

    // method 2: numberOfEvenNumbers()
    // [2,5,8,3] ==> 2
    // [1,9,5] ===> 0

    // method2b: getArrayOfOddNumbers()
    // [1,2,3] ==> [1,1,2,2,3,3]



    // method 3: numbersInRange(int from, int to)
    // original Array: [-1,3,22,35,42,6,9,101]
    // invocation of numbersInRange(5, 37) ===> [22,35,6,9]



}
