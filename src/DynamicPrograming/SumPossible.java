package DynamicPrograming;

import java.util.ArrayList;
import java.util.List;

public class SumPossible {
    public static void main(String[] args) {
        ArrayList <Integer>list=new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        System.out.println(ispossible(4,list));

    }
    public static boolean ispossible(int n, List<Integer>list)
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
        for(int e:list)
        {
            int current =n-e;
            if (ispossible(current,list))
            {
                return true;
            }
        }

        return false;
    }
}
