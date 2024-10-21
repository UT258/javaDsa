package StriverArray;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,7};
        reverse2(arr);

    }
    public static void reverse(int arr[])
    {
        for (int i = 0; i < arr.length/2; i++) {
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse2(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<arr.length/2)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }

}
