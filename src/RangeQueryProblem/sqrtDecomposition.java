package RangeQueryProblem;

import com.sun.source.tree.InstanceOfTree;

import java.util.Arrays;

public class sqrtDecomposition {
    public static void main(String[] args) {
        //we need to find the sum of the given range
        //this algorithm is also known as MO's algorithm
        /*
        the steps for the algorithm are:
        1. divide the array into sqrt(n) blocks
        2. precompute the sum of each block
        3. query the sum of the given range
        4. update the value of the given index
        */
        //so these are the steps for this algorithm it is used when we need to find the sum or any
        //given range of index
        //now time complexity of the algorithm is O(sqrt(n)) for query and update
     int arr[]={1, 3, 5, 2, 7, 6, 3, 1, 4, 8};

       // System.out.println(query(arr,2,7));

    }
    public static int sqrtDecomposition(int arr[])
    {
        //square root decomposition
        int index=-1;//-1 so that in the condition where 0 is there element start adding in  0 th  index not on 1th index
        //one postion will be left by the array
        // it will give array out of bound exception
        int sqrt=(int) Math.sqrt(arr.length);
        //block array or the intermediate array for the calculation
        int block[]=new int [sqrt+1];

        //just divide the array in chunks of square root of the length of the array
        for(int i=0;i<arr.length;i++)
        {
            if (i % sqrt==0)
            {
                index++;

            }
            block[index]+=arr[i];
        }
        

    }


}
