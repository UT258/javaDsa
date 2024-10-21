package LeetCodeProblem;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        System.out.println("a".contains("abc"));
        int a=5;
        int res=(~a);
//        System.out.println(res);
//        System.out.println(findTheLongestSubstring("eleetminicoworoep"));
        int arr[]={1,3,4,8};
        int q[][]={{0,1},{1,2},{0,3},{3,3}};
        System.out.println(xorQueries(arr,q));

    }
     public static String fractionAddition(String expr) {
        int nume = 0; // Numerator
        int deno = 1; // Denominator

        int i = 0;
        int n = expr.length();
        while (i < n) {
            int currNume = 0; // Current fraction numerator
            int currDeno = 0; // Current fraction denominator

            boolean isNeg = (expr.charAt(i) == '-');

            // Skip '+' or '-'
            if (expr.charAt(i) == '+' || expr.charAt(i) == '-') {
                i++;
            }

            // Build the current numerator
            while (i < n && Character.isDigit(expr.charAt(i))) {
                int val = expr.charAt(i) - '0';
                currNume = (currNume * 10) + val;
                i++;
            }

            i++; // Skip the division character '/'

            if (isNeg) {
                currNume *= -1; // Apply negative sign if needed
            }

            // Build the current denominator
            while (i < n && Character.isDigit(expr.charAt(i))) {
                int val = expr.charAt(i) - '0';
                currDeno = (currDeno * 10) + val;
                i++;
            }

            // Update the accumulated numerator and denominator
            nume = nume * currDeno + currNume * deno;
            deno = deno * currDeno;
        }

        // Simplify the fraction using the greatest common divisor (GCD)
        int gcd = gcd(Math.abs(nume), deno);

        nume /= gcd;
        deno /= gcd;

        // Return the result in the form "numerator/denominator"
        return nume + "/" + deno;
    }

    // Helper method to calculate the greatest common divisor (GCD) using Euclidean algorithm
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
     public int countConsistentStrings(String allowed, String[] words) {
        int count=0;

     for(String s:words)
     {
       if(s.contains(allowed))
       {
        count++;
       }
     }
     return count;
    }
   public static int  findTheLongestSubstring(String s) {
       String vowel="aeiou";
       int i=0;
       int j=0;
       int v=0;
       int max=Integer.MIN_VALUE;
       while(j<s.length()) {
           if(vowel.indexOf(s.charAt(j))!=-1)
           {
               v++;
           }


       }

      return max;
    }
    public static int[] xorQueries(int[] arr, int[][] queries) {
        //using prefix array
        int []pre=new int [arr.length];
        pre[0]=arr[0];
        int ans[]=new int [arr.length];
        for(int i=1;i<arr.length;i++)
        {
            pre[i]=pre[i-1] ^ arr[i];
        }
        System.out.println(Arrays.toString(pre));
        int k=0;
//        for(int temp[]:queries)
//        {
//
//        }
        return ans;

    }
     public String shortestPalindrome(String s) {
      //find the longest substring that is palindrome and then add the reverse of
      //remaining to the answer to make the shortest pallindrome
      String reverse=new StringBuilder(s).reverse().toString();
      //to calulate the pallindrome
      for(int i=0;i<s.length();i++)
      {
        if(s.substring(0,s.length()-i).equals(reverse.substring(i)))
        {
return  new StringBuilder(reverse.substring(0,i)).append(s).toString();
        }
      }
   return " ";
    }
        public boolean checkInclusion(String s1, String s2) {
        //create a hashmap
            HashMap<Character,Integer> map=new HashMap<>();
            for(char c:s1.toCharArray())
            {
                map.put(c,map.getOrDefault(c,0)+1);
            }

            HashMap<Character,Integer>map1=new HashMap<>();
            for(char c:s2.toCharArray())
            {
                map1.put(c,map.getOrDefault(c,0)+1);
            }
            for(char c:s1.toCharArray())
            {
                if(map.get(c)!=map1.get(c))
                {
                    return false;
                }

            }
            return true;

    }

    public String sort(String s) {
        char[] t = s.toCharArray();
        Arrays.sort(t);
        return new String(t);
    }
}
