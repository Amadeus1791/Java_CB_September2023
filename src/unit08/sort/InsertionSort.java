package unit08.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] testArr = {3, 0, 67, 2, 4, 10};
        InsertionSort sorter = new InsertionSort();
        sorter.insertionSort(testArr);
        System.out.println(Arrays.toString(testArr));
    }

    public void insertionSort(int[] array) {
        // [3,2,1]
        //{3, 0, 67, 2, 4, 10};
        // take one card step by step
        for (int i = 1; i < array.length; i++) {
           // int valueToInsert = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > array[i]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = array[i];
            System.out.println("value: " + array[i] + "inserted at index" + (j + 1));
        }
    }
}
