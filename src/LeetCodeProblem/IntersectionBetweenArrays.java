package LeetCodeProblem;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionBetweenArrays {
    public static void main(String[] args) {
        int nums1[]={1,2,2,1};
        int nums2[]={2,2};
        int arr[]=intersection(nums1,nums2);
        System.out.println(Arrays.toString(arr));
       //logic is simple you just need to create set two set to be precise one will store annd other will store intersection
        //set only allows unique elements so we can easily find intersection

    }
    public static  int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> intersection=new HashSet<>();
        for (int i:nums1)
        {
            set.add(i);
        }
        for (int i:nums2)
        {
            if (set.contains(i))
            {
                intersection.add(i);
            }
        }
       return  intersection.stream().mapToInt(i->i).toArray();


    }
}
