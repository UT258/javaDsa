package contest;

public class p1 {
    public static void main(String[] args) {
        /*
        Alice and Bob are playing a game on a string.

You are given a string s, Alice and Bob will take turns playing the following game where Alice starts first:

On Alice's turn, she has to remove any non-empty
substring
 from s that contains an odd number of vowels.
On Bob's turn, he has to remove any non-empty
substring
 from s that contains an even number of vowels.
The first player who cannot make a move on their turn loses the game. We assume that both Alice and Bob play optimally.

Return true if Alice wins the game, and false otherwise.

The English vowels are: a, e, i, o, and u.
just traverse the remaining string and check if the number of vowels is even or odd 


         */
    }
    public boolean doesAliceWin(String s) {
        //using sliding window
        int i=0;
        int j=0;

        int c=0;
        while(j<s.length())
        {
            if(s.charAt(j)=='a' || s.charAt(j)=='e' || s.charAt(j)=='i' || s.charAt(j)=='o' || s.charAt(j)=='u')
            {
                c++;
            }
            if(c%2==0)
            {
             j=j+1;
            }
            else
            {
                i=j;
                c=0;
            }
            j++;


        }
        return false;

    }
}
