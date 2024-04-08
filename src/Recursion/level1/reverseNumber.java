package Recursion.level1;

public class reverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse2(12312));

    }
    static int rev=0;
    public static void reverse(int n)
    {
        if(n==0)
        {
            return ;
        }
        rev=rev*10+n%10;
        reverse(n/10);



    }
    //second method by using helper function
    public static int reverse2(int n)
    {
        int digits=(int)(Math.log10(n)+1);
        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        if(n==0)
        {
            return 0;
        }
        return n%10 *(int)Math.pow(10,digits-1) +helper(n/10,digits-1);
    }
}
