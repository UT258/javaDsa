package DynamicPrograming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SumPossible {
    public static void main(String[] args) {
        ArrayList <Integer>list=new ArrayList<>();
       // list.add(1);
        //list.add(2);
        list.add(3);
        System.out.println(ispossible(25,list,new HashMap<Integer,Boolean>()));

    }
    public static boolean ispossible(int n, List<Integer>list, HashMap<Integer,Boolean> map)
    {
        //base case
        if(n==0)
        {
            return true;
        }
        if (n<0)
        {
            return false;
        }
        if (map.containsKey(n))
        {
            return map.get(n);
        }
        for(int e:list)
        {
            int current =n-e;
            if (ispossible(current,list,map))
            {   map.put(n,true);
                return true;
            }
        }
      map.put(n,false);
        return false;
    }
}
