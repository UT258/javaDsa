package StriverArray;

import java.util.Arrays;

public class RotateTheArray {
    public static void main(String[] args) {
        //we have to rotate the array
        int arr[]={1,2,3,4,5,6,7};
        //we have to rotate the array
        //first method is to use another array  and second without using array
        //without using array
       // rotateby1(arr);
        rotatebyd(arr,3);
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
    public static void rotatebyd(int arr[],int d)
    {
        //now the question is to rotate the array by d places
        //we will use the same method
        d=d%arr.length;//this is to if the rotation is more than length of the array to handle that case

        //first we need to store the element in the array
        int temp[]=new int[d];
        //for loop for doing it
        for(int i=0;i<d;i++)
        {
            temp[i]=arr[i];
        }
        if (temp.length==0)
        {
            System.out.println("no need to rotate");
            return;
        }
        //now shifting the elements
        for(int i=0;i< arr.length-d;i++)
        {
            arr[i]=arr[d+i];
        }
        System.out.println(Arrays.toString(temp));
        //putting it back that we stored in the temp
        int j=0;
        for(int i= arr.length-d;i< arr.length;i++)
        {
            arr[i]=temp[j];
            j++;

        }



}
}
