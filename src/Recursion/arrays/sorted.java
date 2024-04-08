package Recursion.arrays;

public class sorted {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(issorted(arr));
    }
    public static boolean issorted(int arr[])
    {
        return helper(arr,0);
    }

    private static boolean helper(int[] arr, int i) {
        //base case
        if(i== arr.length-1)
        {
            return true;//if it reaches the ene no matter what you return it will not affect both should be true


        }
        //intition is if current one is greater
        return  arr[i]<arr[i+1] && helper(arr,i+1);
    }
}
