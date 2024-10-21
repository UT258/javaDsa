package StriverArray;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getSecondOrderElements(4,new int[]{3 ,4, 5, 2})));
    }
        public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int FLargest=0;

        int SLargest=0;


        for(int e:a)
        {
            if(e>FLargest)
            {
                SLargest=FLargest;
                FLargest=e;
            }

             else if (e<FLargest && e>SLargest)
        {
            SLargest=e;

        }

        }

int      Ssmallest=getSmallest(a);

    return new int[]{SLargest,Ssmallest};
    }
    public static int getSmallest(int arr[])
    {   int f=Integer.MAX_VALUE;
         int s=0;
        for(int n: arr)
        {
        if(n<f)
        {
            s=f;
            f=n;
        }
        else if(n>f &&  n<s)
        {
            s=n;
        }
        }
        return s;
    }
}
