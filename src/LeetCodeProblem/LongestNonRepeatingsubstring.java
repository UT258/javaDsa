package LeetCodeProblem;

import java.util.Arrays;
import java.util.HashMap;

public class LongestNonRepeatingsubstring {
    public static void main(String[] args) {
        String s= "au";
        System.out.println(lengthOfLongestSubstring1("takeuforward"));

    }
    //bruteforce o(n^2+
    public static int lengthOfLongestSubstring1(String s) {
        //using hashing
     if(s.length()==1)
        {
            return 1;
        }
        if(s.isEmpty())
        {
            return 0;
        }
        //using hashing
         int max=Integer.MIN_VALUE;
        int hash[]=new int[256];

        for(int i=0;i<s.length();i++)
        {  String ans="";
                    Arrays.fill(hash, 0); // Reset the hash array for each new substring

            for(int j=i;j<s.length();j++)
            {
                if (hash[s.charAt(j)]==1)
                {  max=Math.max(max,j-i);
                    break;
                }
                //just add it in the anwer
                //add in the hash array
                hash[s.charAt(j)]=1;
                ans+=s.charAt(j);
            }
            max=max<0?ans.length():max;
        }
        return max;



    }
    //second method using a set and two pointer approach
    public int maxSubarrayLength(int[] nums, int k) {
        int maxlength=Integer.MIN_VALUE;
        int i=0;
        int j=0;
        //create a hashmap
        HashMap<Integer,Integer>map =new HashMap<>();
        while(j<nums.length)
        {
            //put in the map
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            //if the frquency is more than k then trim down
            while(map.get(nums[j])>k)
            {
                i++;//move starting and remove this from the map
                 map.put(nums[i],map.get(nums[i])-1);

            }
            maxlength=Math.max(maxlength,j-i+1);
            j++;
        }
        return maxlength;
    }
}
