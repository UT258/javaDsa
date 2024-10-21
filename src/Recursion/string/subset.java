package Recursion.string;

import java.util.ArrayList;
import java.util.Collections;

public class subset {
     static  ArrayList<ArrayList<Integer> >list1=new ArrayList<>();
      static  ArrayList<String >list=new ArrayList<>();
    public static void main(String[] args) {
        //subset question
        //in this pattern is followed of taking something and ignoring something
  //subset1("abc","");
       //System.out.println(subsetret("abc",""));
        target(new int[]{1,2,3},3 );
        System.out.println(list);
        System.out.println(list1);
    }
    public static  void subset1(String up,String p)
    {
        //it follows the principle of taking something and ignoring something
        if(up.isEmpty())
        {
            if(p.isEmpty())
        {
         list.add("[]");
            return;
        }
             list.add(p) ;
            return;
        }
        char ch=up.charAt(0);
          subset1(up.substring(1),p);
        subset1(up.substring(1),p+ch);
        //and not taking



    }
    public static  void subsetret(int arr[],int i,ArrayList<Integer>innerlist)
    {
        //in this we will return the array list cuz return type
        if (i==arr.length)
        {
            //then create the array list and add the answer in the array

            list1.add(new ArrayList<>(innerlist));
            return;
        }
        //take the element

            innerlist.add(arr[i]);
            subsetret(arr, i + 1, innerlist);

        innerlist.remove(innerlist.size()-1);
        //not taking the element
        subsetret(arr,i+1,innerlist);


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
    private static ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
    public static  void target(int arr[],int target)
    {
        solve(arr,0,target,new ArrayList<Integer >());

    }
    public static void solve(int arr[],int i,int target,ArrayList<Integer>list)
    { if(target<0)
    {
        return;
    }
        if(target==0)
        {
            ans.addAll(Collections.singleton(list));
            return;
        }

        for (int j = 0; j < arr.length; j++) {
             list.add(arr[i]);
             solve(arr,i,target-arr[i],list);
             list.remove(list.size()-1);//backtrack
        }
    }



}
