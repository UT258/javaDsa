package SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;

public class Duplicate_II {
    public static void main(String[] args) {
        //leetcode question
        //Given an integer array nums and an integer k, return true
        // if there are two distinct indices i and j in the array
        // such that nums[i] == nums[j] and abs(i - j) <= k.


    }
    public static boolean solution1(int nums[],int k)

    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if (Math.abs(j-i)<=k && nums[i]==nums[j])
                {

                        return true;

                }
            }
        }
        return false;
    }
    //now second solution is to use hashmap
    public static boolean solution2(int nums[],int k)
    {  //map record the previous occurences
        //time complexity will be if o(n)
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if (map.containsKey(nums[i]))
            {
                if (i- map.get(nums[i])<=k)
                {
                    //if this is equal means there is (i-J)<=k
                    return true;

                }
            }
            map.put(nums[i],i);
        }
        return false;
    }
}
