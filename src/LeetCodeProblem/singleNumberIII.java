package LeetCodeProblem;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class singleNumberIII {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(singleNumber(new int[]{1,2,1,3,2,5})));

    }
     public static int[] singleNumber(int[] nums) {
        int ans[]=new int [2];
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int n: nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);


        }
         System.out.println(map);
        int k=0;
        for(int n:nums)
        {
            if(map.get(n)==1 ){
                ans[k]=n;
                k++;
            }
        }
        return ans;
    }
}
