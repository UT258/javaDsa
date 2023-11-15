package BitwiseOperator;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ThreeBit {
    public static void main(String[] args) {
        //question in array every number is apearing thrice except one number find that number
        int[] arr ={2,2,3,2,7,7,8,7,8,8};
        System.out.println(threeBit(arr));
        //it was working when number are appearing  thrice are one after another it is not working when they are not one after another
        //{2,2,3,2,7,7,8,7,8,8}; this is not working but {2,2,2,3,7,7,7,8,8,8}; this is working
        //reason that the xor operator is not associative means a^b^c is not equal to a^c^b so we have to use some other method  so to solve this problem
        //we will use the concept of mod 3 means if we add all the number and then take mod 3 then the number which is appearing once will be the answer
        //internally how it is working is that we are adding all the bits of the number and then taking mod 3 so the number which is appearing once will be the answer
        Arrays.sort(arr);
    }
    public static int threeBit(int[] arr)
    {
        int n=arr.length;
        int res=0;
        for (int i=0;i<n;i++)
        {
            res=res^arr[i];
        }
        return res;
    }
    //Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
    public static int [] Countbits(int n)
    {
        int[] arr =new int[n+1];
        for (int i=0;i<=n;i++)
        {
            arr[i]=count(i);
        }
        return arr;
    }

    private static int count(int i) {
        int res=0;
        while (i>0)
        {
            if ((i&1)==1)
            {
                res++;
            }
            i=i>>1;
        }
        return res;
    }

}
