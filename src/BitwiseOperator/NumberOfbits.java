package BitwiseOperator;

public class NumberOfbits {
    public static void main(String[] args) {
        //question is to find the number of bits in binary representation
        System.out.println(countBits(5));
        System.out.println(logCoundigit(5,10));

    }
    public static int countBits(int n)
    {   int count=0;
        while(n!=0)
        {   //remove bit and count the bit simple
            n=n>>1;
            count++;
        }
        return count;
    }
    //second method is to use log property
    public static int logCoundigit(int  n,int base)
    {

        return (int)(Math.log(n)/Math.log(base))+1;
    }
}
