package LeetCodeProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class DisappearedFromArray {
    public static void main(String[] args) {
        int[] arr ={3,4,-1,1};


        sorting .cycleSort.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(findDisappearedNumbers(arr));
    }

    private static ArrayList<Integer> findDisappearedNumbers(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        //now run a for loop from 1 to n
        for(int j=0;j<arr.length;j++)
        {
            if (arr[j]!=j+1)
            {
                list.add(j+1);
            }
        }
        return list;
    }
}
