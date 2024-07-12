package app;

import java.security.AlgorithmConstraints;

import static app.ArrayUtilsSort.getData;

public class ArrayUtilsSearch {

    public static void main(String[] args) {
        int key = 12;
        getOutput(binarySearch(getData(), key), key);
    }

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] < target) {
                low = mid + 1;
            } else if (array[mid] > target) {
                high = mid - 1;
            } else if (array[mid] == target) {
                return mid;
            }
        }
        return -1;
    }

    private static void getOutput(int index, int key) {
        if (index == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element " + key +
                    " found at index " + index);
        
    }
}
