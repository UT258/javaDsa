package LeetCodeProblem;

import java.util.ArrayList;
import java.util.Arrays;

public class subarrayproduct {
    public static void main(String[] args) {
        int arr[]={10,5,2,6};
        int k=100;
        System.out.println(countsubarray(arr,k));
    }
    public static int countsubarray(int nums[],int k)
    {
        //generate the subarray
        int count=0;
        for(int i=0;i<nums.length;i++)
        {   int product=1;
            for(int j=i;j<nums.length;j++)
            {

                product*=nums[j];
                if(product<k)
                {
                    count++;

                }
            }


        }
        return count;

    }
}
