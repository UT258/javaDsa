package LeetCodeProblem;

import java.util.Scanner;

public class SherlockInversions {
    public static long merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        long inversions = 0;

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                inversions += n1 - i; // elements in leftArr remaining are inversions
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }

        return inversions;
    }

    public static long mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            long leftInversions = mergeSort(arr, left, mid);
            long rightInversions = mergeSort(arr, mid + 1, right);
            long mergeInversions = merge(arr, left, mid, right);
            return leftInversions + rightInversions + mergeInversions;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of elements (n)
        int n = scanner.nextInt();

        // Input elements of the array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input number of queries (q)
        int q = scanner.nextInt();

        // Process each query
        for (int i = 0; i < q; i++) {
            int left = scanner.nextInt() - 1; // Adjust for 0-based indexing
            int right = scanner.nextInt() - 1; // Adjust for 0-based indexing

            // Calculate and print inversions for the query range
            long inversions = mergeSort(arr.clone(), left, right);
            System.out.println(inversions);
        }

        scanner.close();
    }
}
