package sorting;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
     int arr[]={5,4,3,5,6,7,8,2};

        int nums[]={1,3,4,5,0};
        for(int i=nums.length-2;i>=2;i--)
        {
            nums[i+1]=nums[i];
        }
        nums[2]=2;
        System.out.println(Arrays.toString(nums));


    }
    public static void BubbleSort(int arr[])
    {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1])

                {
                    //if this condition is true means we need to swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

}
