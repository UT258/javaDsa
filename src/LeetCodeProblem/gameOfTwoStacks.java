package LeetCodeProblem;

import java.util.ArrayList;
import java.util.List;

public class gameOfTwoStacks {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        int maxsum=10;
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        b.add(6);
        b.add(7);
        b.add(8);
        b.add(9);
        System.out.print(twoStacks(maxsum,a,b));



    }
    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        return selection(maxSum, a, b,0,0)-1;


    }
    public static int selection(int x, List<Integer> a, List<Integer> b, int sum, int count)
    {
        if (sum>x)
        {
            return count;
        }


        int first =selection(x,a.subList(1,a.size()), b, sum+a.get(0), count+1);

        int second=selection(x, a, b.subList(1,b.size()), sum+b.get(0), count+1);
        return Math.max(first, second);
    }

}
