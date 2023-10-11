package BitwiseOperator;

public class ithBit {
    public static void main(String[] args) {
        //question is to find the i the bit
        //find 5 bit
        //101011 find 5 the bit which is 1
         int a=43;
            int i=5;
        System.out.println(ithBit(a,i));

        setithbit(a,i);


    }
    public static int ithBit(int a,int i)
    {
        int mask=1<<i-1;
        int res=a&mask;
        return res;
    }
    public static void setithbit(int a,int i)
    {
        int mask=1<<i-1; //this will set the ith bit first a was 101011 when we do 1<<i-1 it will become 001000
        a= ( a | mask);//here a will become 101111 which in decimal is
        System.out.println(a);
    }
}
