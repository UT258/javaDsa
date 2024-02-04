package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class FirstNegativeNumber {
    public static void main(String[] args) {
        int arr[]={12 ,-1 ,-7 ,8 ,-15, 30, 16, 28};
        System.out.println(FirstNegative(arr,3));

    }
    //question is to find the first negative in the subarray of size k
    public static ArrayList<Integer> FirstNegative(int arr[],int k) { //we need to find the negative number in window of size
        int start = 0;
        int end = 0;
        Deque<Integer> Nq = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        while (end < arr.length) {
            //we need to find the first negatives in the array
            if (arr[end] < 0) {
                //if the number is negative just add in the queue
                Nq.addLast(arr[end]);
            }
            if (end - start + 1 < k) {
                end++;//increase till window size is reached
            }
            if (end - start + 1 == k) {
                //now here window size is reached
                //now we need to find the first negative in the window
                if (Nq.isEmpty()) {
                    //if the queue is empty means there is no negative number in the window
                    ans.add(0);
                } else {
                    //if the queue is not empty means there is negative number in the window
                    ans.add(Nq.peekFirst());
                    //now we need to slide the window
                    //so remove the first element of the window
                    if (arr[start] == Nq.peekFirst()) {
                        //if the first element of the window is negative then remove it
                        if(Nq.peekFirst()<0)
                        Nq.removeFirst();
                    }
                }
                start++;
                end++;


            }

        }
        return ans;
    }


}

