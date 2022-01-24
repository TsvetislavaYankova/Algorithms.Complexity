public class T03CountingSort {
    public static void main(String[] args) {
        int arr[] = {3000, 3009, 3002, 3001};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int[] helper = new int[max - min + 1];
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            helper[arr[i] - min]++;
        }
        for (int i = 0; i < helper.length; i++) {
            int counter = helper[i];
            for (int j = 0; j < counter; j++) {
                arr[start] = i + min;
                start++;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
