package SlidingWindow;

import java.util.HashMap;

public class CountTheOccurenceofTheAnagram {
    public static void main(String[] args) {
        //we need to find the occurence of anaagram in a string
        String str = "aabaabbabbabaa";
        String ptr = "aaba";
        int sum = 0;
        int count = 0;
        int k = ptr.length();

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<ptr.length();i++){
            char ch = ptr.charAt(i);
            if(map.containsKey(ch)){
                int a = map.get(ch);
                map.put(ch,++a);
            } else{
                map.put(ch,1);
            }
        }

        count = map.size();
        int i=0,j=0;

        while(j<str.length()){
            char ch = str.charAt(j);
            if(map.containsKey(ch)){
                int a = map.get(ch);
                map.put(ch,--a);
                if(a==0){
                    count--;
                }
            }

            if(j-i+1 < k){
                j++;
                continue;
            }

            if(j-i+1 == k){
                if(count == 0){
                    sum++;
                }
                if(map.containsKey(str.charAt(i))){
                    int a = map.get(str.charAt(i));
                    if(a==0){
                        count++;
                    }
                    map.put(str.charAt(i), ++a);
                }
            }
            i++;
            j++;
        }

        System.out.println(sum); //3
    }
    public static int countAnagram(String s,String p)
    {
        int ans=0;
        int k=p.length();//k is window size
        int i=0,j=0;
        //we have to create a map First
        HashMap<Character,Integer>map =new HashMap<>();
        //here i need to enter the frequency of the pattern
        for (char a:s.toCharArray())
        {
            if (map.containsKey(a))
            {
                //if the key is present we need to increment
                int c=map.get(a);
                map.put(a,++c);
            }
            else{
                //if the key is not present then just add 0 in it
                map.put(a,0);
            }
        }
       int count =map.size();//count of distinct element in the map


        while(j<s.length())
        {
           char ch=s.charAt(j);

           if (map.containsKey(ch))
        {
            int t=map.get(ch);
            map.put(ch,--t);
            if (t==0)
            {
                count--;//if the t=0 means one distinct character is gone now
            }

        }

            //calculation
            if (j-i+1<k)
            {   //just need to increase the window size
                j++;
            }
            else if (j-i+1==k)
            {
             //now here window size is reached
                if (count==0)
                {
                    //means all the subarray is anagram
                    ans++;
                }
                if(map.containsKey(s.charAt(i))){
                    int a = map.get(s.charAt(i));
                    if(a==0){
                        count++;
                    }
                    map.put(s.charAt(i), ++a);
                }
            }
            i++;
            j++;
        }
        return ans;
    }


}
