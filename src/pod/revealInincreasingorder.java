package pod;

import java.util.ArrayList;
import java.util.Arrays;

public class revealInincreasingorder {
    public static void main(String[] args) {
        int[] deck = {1,100};
        System.out.println(Arrays.toString(deckRevealedIncreasing(deck)));

    }

    public static int[] deckRevealedIncreasing(int[] deck) {

        //sort the array and put it alternatively
        Arrays.sort(deck);
        //take two pointer one for the answer array and one for traversing
        int i = 0;
        int j = 0;
        boolean isalternate = false;
        int ans[] = new int[deck.length];
        while (i < deck.length) {


                if(!isalternate && ans[j]==0)
                {
                    ans[j]=deck[i];
                    i++;

                }
                if(ans[j]>=deck.length && ans[j+1]==0)
                {
                    isalternate=!isalternate;
                }
            j++;
            j=j%deck.length;

        }
        return ans;
    }
}
