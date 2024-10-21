package Recursion.level1;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(countzero(5005));

    }
    public  static int sum(int n)
    {
        //base case
        if(n==0)
        {
            return 0;
        }
        return n%10 + sum(n/10);
    }
    public static int mul(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n%10*mul(n/10);
    }
    public static int countzero(int n)
    {
     if (n==0)
     {
         return 0;
     }
     if(n%10==0){
         return 1 + countzero(n/10);
     }
     else{
         return countzero(n/10);
     }


    }
}
