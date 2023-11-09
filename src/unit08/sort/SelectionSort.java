package unit08.sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] testArr = {3, 0, 67, 2, 4, 10};
        
    }

    public void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            
            for (int j = 0; j < arr.length; j++) {
                // search for max
            }
        }
    }

    private int findMaxIndex(int[] arr, int end) {
        int max = 0;
        for (int i = 1; i < end ; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    private void swap(int[] arr, int pos1, int pos2) {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
}
