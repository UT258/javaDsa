package LeetCodeProblem;

import java.util.Arrays;

public class nextgreaterelement {
    public static void main(String[] args) {
        int []nums1={4,1,2};
        int []nums2={1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));

    }
    public static  int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //we need to find the next greater element in the stack
        int[] ans =new int[nums1.length];
        for (int i=0;i<nums1.length;i++)
        {
            int index=search(nums2,nums1[i]);
            System.out.println(index);

            int count=0;
            for (int j=index+1;j<nums2.length;j++)
            {
                if (nums2[j]>nums1[i])
                {
                    count++;
                }
            }
            if (count!=0 && index!=-1)
            {
            ans[i]=count;
            }
            else
            {
                ans[i]=-1;
            }
        }
        return ans;

    }
    public static int search(int[] arr, int target)
    {
        //binary search
        int start=0;
        int end=arr.length-1;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if (arr[mid]==target)
            {
                return mid;
            }
            else if (arr[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return -1;
    }
}
