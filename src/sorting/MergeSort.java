package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the length :");
        // Input number of elements (n)
        int n = scanner.nextInt();

        // Input elements of the array
        System.out.println("input the element in the array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input number of queries (q)
        System.out.println("input the number of queries");
        int q = scanner.nextInt();

        // Process each query
        for (int i = 0; i < q; i++) {
            int left = scanner.nextInt() - 1; // Adjust for 0-based indexing
            int right = scanner.nextInt() - 1; // Adjust for 0-based indexing

            // Calculate and print inversions for the query range
            int[] inversionCount = {0}; // Array to store inversion count
            MSort(Arrays.copyOfRange(arr, left, right + 1), inversionCount);
            System.out.println("Inversion count is " + inversionCount[0]);
        }

        scanner.close();
    }

    public static int[] MSort(int arr[], int[] inversionCount) {
        if (arr.length <= 1) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = MSort(Arrays.copyOfRange(arr, 0, mid), inversionCount);
        int[] right = MSort(Arrays.copyOfRange(arr, mid, arr.length), inversionCount);

        return merge(left, right, inversionCount);
    }

    private static int[] merge(int[] left, int[] right, int[] inversionCount) {
        int[] ans = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                ans[k] = left[i];
                i++;
            } else {
                ans[k] = right[j];
                j++;
                inversionCount[0] += (left.length - i); // Count inversions
            }
            k++;
        }

        // Copy remaining elements of left, if any
        while (i < left.length) {
            ans[k] = left[i];
            i++;
            k++;
        }

        // Copy remaining elements of right, if any
        while (j < right.length) {
            ans[k] = right[j];
            j++;
            k++;
        }

        return ans;
    }
}