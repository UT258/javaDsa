package LeetCodeProblem;

import java.util.Arrays;

public class findfirstandLastOccurence {
    public static void main(String[] args) {
        int ans[]={1,2,3,4,5,5,5,5,5,6,7,8,9};
        System.out.println(search(ans,5));

    }

    public static int search(int[] arr, int target) {

      int start=0;
      int end=arr.length-1;
      while (start<=end)
      {
          int mid =start+(end-start)/2;
          if(arr[mid]>target)
          {
                end=mid-1;
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
            }
            else
            {

               return mid;
            }
      }

      return -1;

    }
}






