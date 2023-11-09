package unit08.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] testArr = {3, 0, 67, 2, 4, 10};
        BubbleSort bubbleSort = new BubbleSort();
//        bubbleSort.bubbleSort(testArr);
//        System.out.println(Arrays.toString(testArr));
        bubbleSort.bubbleSortWithSwapMethod(testArr);
        System.out.println(Arrays.toString(testArr));
    }

    void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    void bubbleSortWithSwapMethod(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    //void swap(int[] arr, int pos1, int pos2)
                    swap(arr, j, j - 1);
                }
            }
        }
    }

    private void swap(int[] arr, int pos1, int pos2) {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    void bubbleSortTuned(int[] arr) {
        boolean isSorted;
        for (int i = 0; i < arr.length; i++) {
            isSorted = true;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    //void swap(int[] arr, int pos1, int pos2)
                    swap(arr, j, j - 1);
                    isSorted = false;
                }
            }
            if (isSorted) {
                return;
            }
        }
    }
}
