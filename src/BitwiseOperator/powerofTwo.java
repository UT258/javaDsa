package BitwiseOperator;

public class powerofTwo {
    public static void main(String[] args) {
        System.out.println(isPoweroftwo(128));
        System.out.println(power2(1024));

    }
    public static boolean isPoweroftwo(int n)
    {
        if (n<1)
        {
            return false;

        }
        return Integer.bitCount(n)==1;
    }
    public static boolean power2(int n)

    {
        return ((n & n-1)==0);
    }

}
