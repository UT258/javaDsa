package LeetCodeProblem;

import java.lang.reflect.Array;
import java.util.Arrays;

public class productArrayExceptItself {
    public static void main(String[] args) {
        int nums[]={1,2,3,4};

        System.out.println(Arrays.toString(productExcept(nums)));
    }
    public static int[] productExceptSelf(int[] nums) {
      int iszero=1;
      int product=1;
      for(int n:nums)
      {
          if(n!=0)
          {
              product*=n;
          }
          if(n==0)
          {
           iszero=0;
          }
      }
      int ans[]=new int[nums.length];
      for(int i=0;i<nums.length;i++)
      {
       if(nums[i]==0)
       {
           ans[i]=product;
           break;
       }
       else{
           //the array does not contain any zero
           if(iszero==1) {
               ans[i] = product / nums[i];
           }
       }
      }
      return ans;
}
 public static int[] productExcept(int[] nums) {

    // Array to store all left multiplication
    int[] left = new int[nums.length];

    // Array to store all right multiplication
    int[] right = new int[nums.length];

    left[0] = 1;
    for (int i = 1; i < nums.length; i++) {
      left[i] = left[i - 1] * nums[i - 1];
    }

    right[nums.length - 1] = 1;
    for (int i = nums.length - 2; i > -1; i--) {
      right[i] = right[i + 1] * nums[i + 1];
    }

    int[] ans = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      ans[i] = left[i] * right[i];
    }

    return ans;
  }
}
