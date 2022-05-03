/**
 * [1,3,6,9,10,23,46,57,68,100]
 * Key = 68
 * 
 * Low = 0
 * High = 9
 * 
 * Algo-
 * Step 1) find mid = (low + high)/2
 * Step 2) if ar[mid] = key then return found.
 * Step 3) if ar[mid] > key then high = mid - 1 and repeate from Step 1.
 * Step 4) if ar[mid] < key then low = mid + 1 and repeate from Step 1.
 * ----------------------------------------------------------------------
 * Exp-
 * Step 1:
 * a=[1,3,6,9,10,23,46,57,68,100]
 * 0,1,2,3,04,05,06,07,08,009
 * l=0 and h=9 k=68
 * mid = 0+9/2 = 4
 * --------------------------------- mid =5+9/2=7
 * ------------------------------------------------ mid = 8+9/2=8
 * 
 * Step 2:
 * if(a[4] = 10 == key =68)
 * --------------------------------- if(57==68)
 * ------------------------------------------------if(68==68): found
 * 
 * Step 3)
 * if(10>68)
 * --------------------------------- if(57>68)
 * 
 * Step 4)
 * if(10<68): l=5
 * --------------------------------- if(57<68) : l=8
 */

public class BinarySearchTree_Algo {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 6, 9, 10, 23, 46, 57, 68, 100 };
        int l = 0, h = arr.length - 1, k = 2;
        int result = searchKey(arr, l, h, k);
        if (result == -1)
            System.out.println("Element is not found!");
        else
            System.out.println("Element is found at index: " + result);
    }

    private static int searchKey(int[] arr, int l, int h, int k) {
        if (h >= l) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == k) {
                return mid;
            }
            if (arr[mid] < k) {
                return searchKey(arr, mid + 1, h, k);
            } else {
                return searchKey(arr, l, mid - 1, k);
            }
        }
        return -1;
    }
}
