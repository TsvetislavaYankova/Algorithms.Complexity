import java.util.Arrays;

public class T05QuickSort {
    //NlogN complexity
    public static void main(String[] args) {
        int[] arr = {6, 7, 2, 8, 4, 5, 9, 76, 45, 33, 43, 1, 10, 19};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivotIdx = partition(arr, start, end);
        quickSort(arr, start, pivotIdx - 1);
        quickSort(arr, pivotIdx + 1, end);
    }

    static int partition(int[] arr, int start, int end) {
        int pivotIdx = choosePivot(arr, start, end);
        int temp1 = arr[pivotIdx];
        arr[pivotIdx] = arr[end - 1];
        arr[end - 1] = temp1;
        pivotIdx = end;

        int startIdx = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] < arr[pivotIdx]) {
                int temp = arr[startIdx];
                arr[startIdx] = arr[i];
                arr[i] = temp;
                startIdx++;
            }
        }
        int temp = arr[pivotIdx];
        arr[pivotIdx] = arr[startIdx];
        arr[startIdx] = temp;
        return startIdx;
    }

    static int choosePivot(int[] arr, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += arr[i];
        }
        int medium = sum / (end - start + 1);
        int minDiffIdx = start;
        for (int i = start + 1; i <= end; i++) {
            if (Math.abs(medium - arr[minDiffIdx]) > Math.abs(medium - arr[i])) {
                minDiffIdx = i;
            }
        }
        return minDiffIdx;
    }
}
