package app;

public class ArrayUtilsSort {

    public static int[] getData() {
        int [] arr = new int[15];
        for (int i = 0; i < 15; i++) {
            arr[i] = (int) (Math.random() * 101);
        }
        return arr;
    }
    public static void main(String[] args) {
        getOutput(mergeSort(getData(), 0,
                getData().length - 1));

    }
    private static int[] mergeSort(int[] array, int low,
                                   int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);
            merge(array, low, mid, high);
        }
        return array;
    }

    private static void merge(int[] subset, int low,
                              int mid, int high) {

        int n = high - low + 1;
        int[] temp = new int[n];

        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid || j <= high) {
            if (i > mid)
                temp[k++] = subset[j++];
            else if (j > high)
                temp[k++] = subset[i++];
            else if (subset[i] < subset[j])
                temp[k++] = subset[i++];
            else
                temp[k++] = subset[j++];
        }
        for (j = 0; j < n; j++)
            subset[low + j] = temp[j];
    }

    private static void getOutput(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
    }

}
