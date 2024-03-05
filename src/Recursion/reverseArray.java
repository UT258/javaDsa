package Recursion;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
     int arr[]={1,2,3,4,5};
     reverse(arr,0);
        System.out.println(Arrays.toString(arr));
    }
    public  static void reverse(int i,int j,int arr[])
    {
        if (i>=j)
        {
            return;
        }
        //swap and check for the remaining tree
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        reverse(i+1,j-1,arr);
    }
    //we can use only one i to revese since we know that we only need to reverse the array when we will reach the middle
    //so we can change the base case

    public static void reverse(int arr[],int i)
    {   int n=arr.length;
        //here only single pointer is enough
        if (i>=n/2)
        {
            return;
        }
        //swap
        int temp=arr[i];
        arr[i]=arr[n-1-i];
        arr[n-1-i]=temp;
        reverse(arr,i+1);
    }


}
