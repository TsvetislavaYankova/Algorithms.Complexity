import java.util.Arrays;

public class T02SelectionSort {
    public static void main(String[] args) {
        int[] arr = {8, 6, 1, 4, 7, 2, 9};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int times = 0; times < arr.length / 2; times++) {
            int min = arr[times];
            int max = arr[times];
            int minIdx = times;
            int maxIdx = times;
            for (int i = times + 1; i < arr.length - times; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    minIdx = i;
                }
                if (arr[i] > max) {
                    max = arr[i];
                    maxIdx = i;
                }
            }
            int temp = arr[times];
            arr[times] = arr[minIdx];
            arr[minIdx] = temp;
            if (maxIdx != times) {
                temp = arr[arr.length - 1 - times];
                arr[arr.length - 1 - times] = arr[maxIdx];
                arr[maxIdx] = temp;
            } else {
                temp = arr[arr.length - 1 - times];
                arr[arr.length - 1 - times] = arr[minIdx];
                arr[minIdx] = temp;
            }
        }
    }
}
