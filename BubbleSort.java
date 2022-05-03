/**
 * Bubble Sort:
 * -------------
 * arr = [ 7, 8, 3, 1, 2 ]
 *         0  1  2  3  4
 * n = arr.lenght = 5
 * iteration n-1
 * Step 1:
 * [ 7, 8, 3, 1, 2 ] - 7 8/3 8/1 8/2 8
 *   0  1  2  3  4
 * Step 2:
 * [7, 3, 1, 2, 8] - 3 7/1 7/2 7 8
 * Step 3:
 * [3, 1, 2, 7, 8] - 1 3/2 3 7 8
 * Step 4:
 * [1 2 3 7 8]
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 7, 8, 3, 1, 2 };

        // bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                // swap element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
