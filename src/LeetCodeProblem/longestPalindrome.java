package LeetCodeProblem;

import java.util.HashMap;

public class longestPalindrome {
    public static void main(String[] args) {
        //find the longest palindrome string in the substring
        //hashing if the length is even then

    }
    public  static int longestPalindrome(String s) {
        char a[]=s.toCharArray();
        int count=0;

        HashMap<Character,Integer> map =new HashMap<>();
        for(char c : a)
        {
            map.put(c,map.getOrDefault(c,0)+1);
            //if there is a key and then it will be incremented

        }
        System.out.println(map);
        return count;
    }
}
