import java.util.Arrays;

public class T01BubbleSort {
    public static void main(String[] args) {
        int[] arr = {8, 6, 1, 4, 7, 2, 9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        for (int times = 0; times < arr.length; times++) {
            boolean sorted = true;
            for (int i = 0; i < arr.length - 1 - times; i++) {
                if (arr[i] > arr[i + 1]) {
                    sorted = false;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            if (sorted) {
                break;
            }
        }
    }
}
