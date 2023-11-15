package LeetCodeProblem;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr ={1,2,0};
        System.out.println(firstMissingPositive(arr));
        Arrays.binarySearch(arr,0);
        System.out.println(Arrays.binarySearch(arr,1));
    }
    public static  int firstMissingPositive(int[] nums) {
        //Arrays.sort(nums);
        //use cycle sort
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=i+1 )
            {
                return i+1;
            }
        }
        return -1;

    }
    public static void sort(int[] arr)
    {
        //the approach is simple first check the element at correct index
        int i=0;
        while(i< arr.length)
        { int correct=0;

                correct = arr[i] - 1;
            //if the element is 1 then its correct index is 0 which is element -1
            if ( arr[i]>0 && arr[correct]!=arr[i])
            {
                int temp =arr[correct];
                arr[correct]=arr[i];
                arr[i]=temp;
            }

            else {
                //if the element that is swapped this time is also not at the same place then we should check
                i++;

            }

        }
    }
}
