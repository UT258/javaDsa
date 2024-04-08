package Greedy;

import java.util.*;

public class IndianCoins {
    public static void main(String[] args) {
        //question is to find tha coins change we have to return minimum number of notes we can form
     Integer coin[]={1,2,5,10,20,50,100,500,200};
     //so idea can be to start from the largest note and keep on subtracting the note from the amount
        //and keep on adding the number of notes we have used
        ArrayList<Integer>list=new ArrayList<>();

        System.out.println(MinChange(coin,45,list));
        System.out.println(list);

    }
    public static int MinChange(Integer coin[], int Amount, ArrayList<Integer>list)
    {    int count=0;
        Arrays.sort(coin, Comparator.reverseOrder());
         int i=0;
         while(i<coin.length)
         {
          if(coin[i]<=Amount)
          {
            count++;
            list.add(coin[i]);
            Amount-=coin[i];
          }
          else{
              i++;//only increase the i when coins[i] is not less than amount can same coin can be used again

          }
         }
         return count;
    }
}
