package StriverArray;

import java.util.Arrays;

public class RotateTheArray {
    public static void main(String[] args) {
        //we have to rotate the array
        int arr[]={1,2,3,4,5,6,7};
        //we have to rotate the array
        //first method is to use another array  and second without using array
        //without using array
        rotateby1(arr);
        System.out.println(Arrays.toString(arr));




    }
    public static void rotateby1(int arr[])
    {
        //we need to find the last element of the array and then we need to put it in the first position
        //store the last element in the temp variable
        int temp=arr[0];
        for (int i = 0; i <arr.length-1; i++) {
          arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;//this will put the last element in the first position


    }

}
