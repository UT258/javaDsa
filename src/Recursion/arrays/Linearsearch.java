package Recursion.arrays;

public class Linearsearch {
    public static void main(String[] args) {
        int arr[]={1,23,4,43,5};
        System.out.println(search(arr,443,0));

    }
    public static boolean search(int arr[] ,int target,int i)
    {
        //base case if reached the end then element does not exist return -1;
        if(i==arr.length)
        {
            return false;
        }
        return arr[i]==target || search(arr,target,i+1);//or is used cuz element cannot be present at both the time

    }
}
