import java.util.Arrays;

public class product {
    public static void main(String[] args) {
        int arr[]={43,345,20,987};
        System.out.println(Arrays.toString(prod(arr)));

    }
    public static int [ ] prod(int []prodid)
    {
        int answer[]=new int[prodid.length];
        for(int i=0;i<prodid.length;i++)
        {
            answer[i]=sumdigits(prodid[i]);
        }
        return answer;
    }
    public static int sumdigits(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n%10+sumdigits(n/10);
    }
}
