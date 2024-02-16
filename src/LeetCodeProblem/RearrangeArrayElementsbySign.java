package LeetCodeProblem;

import java.util.Arrays;

public class RearrangeArrayElementsbySign {
    public static void main(String[] args) {
        int arr[]={3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(arr)));

    }
    public static int[] rearrangeArray(int[] nums) {
        //just create two array for storing the positive and negative
        int []pos=new int [nums.length/2];
        int []neg=new int [nums.length/2];
        int j=0;
        int k=0;
        for (int i=0;i<nums.length;i++)
        {
            if (nums[i]<0)
            {
                neg[j]=nums[i];
                j++;
            }
            else{
                pos[k]=nums[i];
                k++;
            }

        }
        k=0;
        j=0;
        //here i will get the postive and negative
        int i=0;
        while(i<nums.length)
        {
            nums[i]=pos[k% pos.length];
            k++;
            nums[i+1]=neg[j% neg.length];
            j++;
            i+=2;
        }
        return nums;
    }
}
