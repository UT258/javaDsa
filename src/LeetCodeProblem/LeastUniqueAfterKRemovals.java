package LeetCodeProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class LeastUniqueAfterKRemovals {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(Removals(arr,3));
    }
    public static int Removals(int nums[],int k)
    {
        HashMap<Integer,Integer>map =new HashMap<>();
        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);//it will fill the frequency
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int n:map.values())
        {
            list.add(n);
        }
        Collections.sort(list);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++)
        {
            if(k>=list.get(i))
            {
                k-=list.get(i);
                list.remove(i);
                i--;
            }
        }
        return list.size();
    }

}
