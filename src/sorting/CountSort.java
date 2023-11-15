package sorting;

import java.util.Arrays;
import java.util.HashMap;

public class CountSort {
    public static void main(String[] args) {
        //count sort is a sorting algorithm that sort the array in O(n) time complexity
        //it is a stable sorting algorithm
        //according to algorithm
        //first create a frequency array of size max element +1 then store the frequency
        System.out.println(Arrays.toString(CountSort(new int[]{2,5,3,0,2,3,0,3})));


    }
    public  static int [] CountSort(int arr[])
    {
        int max= Arrays.stream(arr).max().getAsInt();//it will give you the max element

        int frq[]=new int [max+1];
        for (int N:arr)
        {
            frq[N]++;
            //it will increase the store the frequency of the element

        }
        //now using frq array create the sorted array
        int index=0;
        int output[]=new int[arr.length];
        for(int i=0;i< frq.length;i++)
        {
            while(frq[i]>0)
            {
               output[index]=i;
               index++;
               frq[i]--;
            }
        }

        return output;
    }
    //now using hashMap



}
