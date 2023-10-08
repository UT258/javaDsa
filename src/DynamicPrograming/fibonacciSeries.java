package DynamicPrograming;

import java.util.HashMap;

public class fibonacciSeries {
    public static void main(String[] args) {
        HashMap<Integer,Integer>map =new HashMap<>();
        //hashmap is a data structure that contains key value pair
        System.out.println(fibo(55));
        System.out.println(  );
    }
    public static int fibo(int n)
    {
        if (n<=1)
        {
            return n;
        }
        return fibo(n-1)+fibo(n-2);
        //just starting to code again after a while
    }
    public static int Dfibo(int n, HashMap<Integer,Integer>map )
    {
        if (n<=1)
        {
            return n;
        }
        if (map.containsKey(n))
        {
            return map.get(n);
        }
        int res=Dfibo(n-1,map)+Dfibo(n-2,map);
        map.put(n,res);
        return res;
    }

}
