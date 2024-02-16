package LeetCodeProblem;

import java.util.Arrays;
import java.util.HashMap;

public class SortUsingfrequency {
    public static void main(String[] args) {


        String s="tree";
        int frq[]=new int [26];
        //we need to use the frequency
        for(char c:s.toCharArray())
        {
            frq[c-'a']++;
        }
        System.out.println(Arrays.toString(frq));
    }
}
