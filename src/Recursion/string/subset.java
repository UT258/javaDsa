package Recursion.string;

import java.util.ArrayList;

public class subset {
    public static void main(String[] args) {
        //subset question
        //in this pattern is followed of taking something and ignoring something
  subset1("abc","");
        System.out.println(subsetret("abc",""));
    }
    public static  void subset1(String up,String p)
    {
        if (up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        //take the first character then decide either take it or ignore it
        char c=up.charAt(0);
        //now take one and reject another
        subset1(up.substring(1),p+c);
        subset1(up.substring(1),p);


    }
    public static ArrayList<String> subsetret(String up,String p)
    {
        //in this we will return the array list cuz return type
        if (up.isEmpty())
        {
            //then create the array list and add the answer in the array
            ArrayList <String>  list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        //now create two arraylist and for the local answer
        ArrayList<String>left=subsetret(up.substring(1),p+ch);
        ArrayList<String>right=subsetret(up.substring(1),p);
        left.addAll(right);
        return left;


    }



}
