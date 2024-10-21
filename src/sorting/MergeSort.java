package sorting;



import java.util.Arrays;

import java.util.HashSet;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {6,5, 4, 3, 2, 1};
        MergeSortInplace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));



    }

    public static int[] Msort(int[] arr) {
        //merge sort work on the principle of divide and conquer
        //first base case will be if there is only one element in the array then return the array
        //if there are more than one element then divide the array into two parts and then call the merge sort on both the parts
        //if there is only one element then it means that array is already sorted
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        //now divide that array till 0 to mid and mid to end
        //then merge the sorted array
        int[] left = Msort(Arrays.copyOfRange(arr, 0, mid));
        System.out.println(Arrays.toString(left));
        int[] right = Msort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] ans = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        //run loop till one of the array elements are completely filled means there counter reach the end of the array

        while (i < left.length && j < right.length) {   //only move i when the element is added in array
            if (left[i] < right[j]) {
                //if left is less then add it
                ans[k] = left[i];
                i++;
            } else {
                //means the right array element is smaller then add it
                ans[k] = right[j];
                j++;
            }
            //here increase the k
            k++;
        }//k is increased  only once cuz above only one condition will be executed
        //after loop is over add the remaining element in the answer array
        while (i < left.length) {
            ans[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            ans[k] = right[j];
            j++;
            k++;
        }
        return ans;
        }
    public static void MergeSortInplace(int[] arr,int start,int end) {
        //merge sort work on the principle of divide and conquer
        //first base case will be if there is only one element in the array then return the array
        //if there are more than one element then divide the array into two parts and then call the merge sort on both the parts
        //if there is only one element then it means that array is already sorted
        if (end-start==1) {
            return;
        }
        int mid = (start+end)/2;
        //now divide that array till 0 to mid and mid to end
        //then merge the sorted array
        MergeSortInplace(arr,0,mid);
        MergeSortInplace(arr,mid,end);
        mergeInplace(arr,start,mid,end);




    }

    private static void  mergeInplace(int[] arr, int start, int mid , int end) {
        int[] ans = new int[end-start];
        int i =start;
        int j = mid;
        int k = 0;
        //run loop till one of the array elements are completely filled means there counter reach the end of the array

        while (i < mid && j < end) {   //only move i when the element is added in array
            if (arr[i] < arr[j]) {
                //if left is less then add it
                ans[k] = arr[i];
                i++;
            } else {
                //means the right array element is smaller then add it
                ans[k] = arr[j];
                j++;
            }
            //here increase the k
            k++;
        }//k is increased  only once cuz above only one condition will be executed
        //after loop is over add the remaining element in the answer array
        while (i < mid) {
            ans[k] = arr[i];
            i++;
            k++;
        }
        while (j < end) {
            ans[k] = arr[j];
            j++;
            k++;
        }
        System.arraycopy(ans, 0, arr, start + 0, ans.length);

    }

    }


