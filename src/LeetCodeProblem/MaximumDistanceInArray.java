package LeetCodeProblem;

import java.util.ArrayList;
import java.util.List;

public class MaximumDistanceInArray {
    public static void main(String[] args) {
        List<List<Integer>> list=new ArrayList<>();
        //[[1,2,3],[4,5],[1,2,3]]
        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        List<Integer> list2=new ArrayList<>();
        list2.add(4);
        list2.add(5);
        List<Integer> list3=new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list.add(list1);
        list.add(list2);
        list.add(list3);

        System.out.println(maxDistance(list));
    }
          public static int maxDistance(List<List<Integer>> arrays) {
        ArrayList<Integer> list=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i=0;i<arrays.size();i++)
        {  int len=arrays.get(i).size();
          max=Math.max(arrays.get(i).get(len-1),max);
          min=Math.min(arrays.get(i).get(0),min);

        }
        return (max-min);
    }

}
