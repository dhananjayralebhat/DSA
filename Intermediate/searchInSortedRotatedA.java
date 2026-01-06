import java.util.*;

public class searchInSortedRotatedA {
    public static int search(int arr[], int key, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        if (arr[mid] == key) {
            return mid;
        }
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= key && arr[mid] >= key) {
                return search(arr, key, si, mid-1);
            } else {
                return search(arr, key, mid + 1, ei);
            }
        } else {
            if (arr[mid] < key && arr[ei] > key) {
                return search(arr, key, mid + 1, ei);
            } else {
                return search(arr, key, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 3, 4, 0, 5, 7 };
        int key = 0;
        System.out.println(search(arr, key, 0, arr.length - 1));
    }
}