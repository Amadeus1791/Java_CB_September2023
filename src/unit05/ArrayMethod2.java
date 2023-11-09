package unit05;

public class ArrayMethod2 {
    public static void main(String[] args) {
        int[] arr = {10, 2, 3};
        boolean sorted = isSorted(arr);
        System.out.println(sorted);
    }

    // (3) => [0,0,0]
    public static int[] returnIntArray(int size) {
        int[] numbers = new int[size];
        return numbers;
    }

    // (3,10) ==> [10,10,10]
    public static int[] returnIntArrayWithValue(int size, int value) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = value;
        }
        return numbers;
    }

    // [1,2,3] ===> TRUE
    // [2,4,1] ===> FALSE
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1] < arr[i]) {
                return false;
            }
        }
        return true;
    }



}
