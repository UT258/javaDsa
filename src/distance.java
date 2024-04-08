import LeetCodeProblem.IntersectionBetweenArrays;

import java.util.ArrayList;

public class distance {
    public static void main(String[] args) {


    }
    public int []finddistance(int []inputDist,int start,int end)
    {
        ArrayList<Integer>list=new ArrayList<>();
        int k=0;
        for(int n:inputDist)
        {
            if(n>=start && n<=end)
            {
                list.add(n);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}
