package unit05;

public class ArrayMethods1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        String intArray = getIntArray(arr);
        System.out.println(intArray);

    }

    public static String getIntArray(int[] arr) {
        String s = "";
        s = s + "[";
        // s += "[";
        if (arr.length > 0) {
           // System.out.print(arr[0]);
            s = s + arr[0];
        }
        for (int i = 1; i < arr.length; i++) {
            // System.out.print(", " + arr[i]);
            s = s + ", " + arr[i];
        }
        //System.out.println("]");
        s = s + "]";
        return s;
    }

    public static String getIntArrayBackwards(int[] arr) {
        String s = "";
        s = s + "[";
        // s += "[";
        if (arr.length > 0) {
            // System.out.print(arr[0]);
            s = s + arr[0];
        }
        for (int i = 1; i < arr.length; i++) {
            // System.out.print(", " + arr[i]);
            s = s + ", " + arr[i];
        }
        //System.out.println("]");
        s = s + "]";
        return s;
    }


}
