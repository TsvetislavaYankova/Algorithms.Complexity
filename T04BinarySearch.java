public class T04BinarySearch {
    public static void main(String[] args) {
        // logarithmic complexity
        // works only with sorted array
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int x = 9;
        int index = binarySearch(arr, x, 0, arr.length - 1);
        System.out.println(index);
    }

    private static int binarySearch(int[] arr, int x, int start, int end) {
        if (start > end) {
            return -1;
        }
        int midIdx = (start + end) / 2;
        if (arr[midIdx] == x) {
            return midIdx;
        } else {
            if (x > arr[midIdx]) {
                return binarySearch(arr, x, midIdx + 1, end);
            } else {
                return binarySearch(arr, x, start, midIdx - 1);
            }
        }

    }
}
