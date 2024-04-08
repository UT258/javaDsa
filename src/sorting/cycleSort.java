package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class cycleSort {
    public static void main(String[] args) {
        int[] nums ={0,1};
        sort(nums);
        System.out.println(Arrays.toString(nums));
        ArrayList<Integer> list=new ArrayList<>();
        //now run a for loop from 1 to n
        for(int j=0;j<nums.length;j++)
        {
            if (nums[j]!=j+1)
            {
                list.add(j+1);
            }
        }
        System.out.println(list);
 String a="you can run but you can't hide";
 

    }
    public static void sort (int[] arr)
    {
        //the approach is simple first check the element at correct index
        int i=0;
        while(i< arr.length)
        {
            int correct =arr[i]-1; //if the element is 1 then its correct index is 0 which is element -1
            if ( correct>0 && arr[correct]!=arr[i])
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
