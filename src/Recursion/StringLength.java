package Recursion;

public class StringLength {
    public static void main(String[] args) {
        System.out.println(length("Lucifer"));
    }
    public static int length(String s)
    {
        if (s.isEmpty())
        {
            return 0;
        }
        return 1+length(s.substring(1));
    }
}
