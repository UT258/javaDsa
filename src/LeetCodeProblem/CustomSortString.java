package LeetCodeProblem;

import java.util.HashMap;

public class CustomSortString {
    public static void main(String[] args) {
        System.out.println(customSortString("cba","abcd")
        );


    }
    public static String customSortString(String order, String s) {
        //use hashMap and two pointer
        char a[]=order.toCharArray();
        char b[]=s.toCharArray();
        //put the order in the map
        HashMap<Character,Integer> map =new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            map.put(a[i],i+1);
        }
        //take two pointer i and j
        for (int i = 0; i < b.length ; i++) {
            for (int j = 0; j < b.length-1-i; j++) {
                if (map.containsKey(b[j]) && map.containsKey(b[j+1]) && map.get(b[j])>map.get(b[j+1]))

                {
                    //if this condition is true means we need to swap
                    char temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                }
            }
        }
     return new String(b);
    }
}
