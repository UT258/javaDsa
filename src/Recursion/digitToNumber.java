package Recursion;

public class digitToNumber {
    public static void main(String[] args) {

    }
    public static String convert(int n)
    {
        String[] arr={"zero","one","two","three","four","five","six","seven","eight","nine"};
        if (n==0)
        {
            return "";
        }
        int digit=n%10;
        return convert(n/10)+arr[digit]+" ";
    }
}
