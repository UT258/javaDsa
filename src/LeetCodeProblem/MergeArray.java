package LeetCodeProblem;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {

        int[] arr2 = {1};
        int[] arr = new int[arr2.length];
        merge(arr, 0, arr2, 1);
        System.out.println(Arrays.toString(arr));

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        //two pointer
        int i = m - 1;//this will point at last of nums1
        int j = n - 1;//this will point at last of nums3
        int k = m + n - 1;//at the last indx
        while (j >= 0 && i >= 0) {
            if (nums2[j] > nums1[i]) {
                //shift all the greater element
                nums1[k] = nums2[j];
                k--;
                j--;
            } else {
                //this means the nums1 is greater
                nums1[k] = nums1[i];
                k--;
                i--;
            }

        }
        //check if any element is missing in numa2
        while (j >= 0) {
            nums1[k] = nums2[j];
            k--;
            j--;
        }
        //check if any element is missing in nums1
        while (i >= 0) {
            nums1[k] = nums1[i];
            k--;
            i--;
        }
    }

    public static void SMerge(int[] nums1, int m, int[] nums2, int n) {

        //brute force solution


        //add and sort
        int j = 0;
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
        System.out.print(Arrays.toString(nums1));
    }
}
