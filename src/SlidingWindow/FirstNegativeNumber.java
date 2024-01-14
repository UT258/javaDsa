package SlidingWindow;

import java.util.ArrayList;

public class FirstNegativeNumber {
    public static void main(String[] args) {

    }
    //question is to find the first negative in the subarray of size k
    public static ArrayList<Integer> FirstNegative(int arr[],int k)
    {   //we need to find the negative number in window of size k
        int start=0;
        int end=0;
        //first we create  a ans array so we will store the negative element in the temp list and remove
        ArrayList<Integer> list =new ArrayList<>();
        while (end <arr.length)
        {   //add the negative in the array
            list.add(arr[])
            if (end-start+1<k)
            {
                //increase the window size
                end++;
            }
            if (end-start+1==k)
            {

            }
        }
    }


}
