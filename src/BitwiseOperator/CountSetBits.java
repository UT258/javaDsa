package BitwiseOperator;

public class CountSetBits {
    public static void main(String[] args) {
        System.out.println(countSetbit(5));
        System.out.println(Integer.bitCount(5));


    }
    public static int countSetbit(int n)

    {  int count =0;
        while( n!=0){
            //just find and remove the lsb in every iteration

            int ans =(n & 1);
            if (ans==1)
            {
             count++;
            }
            n=n>>1;

        }
        return count;
    }

}
