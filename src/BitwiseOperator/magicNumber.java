package BitwiseOperator;

public class magicNumber {
    public static void main(String[] args) {
        //question is to  find the nth magic number
        //magic number is a number which is a power of 5 or sum of unique powers of 5
        //so the first magic number is 5    5^1
        System.out.println(magicN(3));

    }

    public static int magicN(int n) {
        //logic is simple we just need to convert the number into binary and then multiply it with 5
        int ans=0;
        int base=5;
        while (n != 0) {
            int last_digit = (n & 1);
            //now remove the last bit
            n= n >> 1; //by right shift the right most bit wil we removed
            ans+=last_digit*base;
           base*=base;
        }
        return ans;
    }
}
