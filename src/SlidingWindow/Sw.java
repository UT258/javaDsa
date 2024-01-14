package SlidingWindow;

public class Sw {
    public static void main(String[] args) {
        //sliding window problem
        int arr[]={1,8,8,4,5};
        //identify sliding window problem
        //you will be given an array and you have to find the max sum of k consecutive elements
        //or it can give you sum and you have to find the longest subarray with sum k
        System.out.println(SWindow(arr,2));

        ++

    }
    public static int SWindow(int arr[],int  k)
    {
        int start=0;
        int end=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        while(end<arr.length)
        {
            sum+=arr[end];
            if(end-start+1<k)
            {
                //start and end are the pointer representing the sliding window
                //start-end +1 will give the size of current window
                end++;
            }
            else if (end-start+1==k)
            {
                //if this is true means the current window size is equal to given size
                //here we will find the maximum
                //since i find the window now i have to slide the window
                // so remove the first and add the next one
                //delete the extra sum
                max=Math.max(sum,max);
                sum-=arr[start];
                start++;
                end++;
            }
        }
        return max;
    }

}
