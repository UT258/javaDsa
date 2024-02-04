package Recursion.string;

public class skip {
    public static void main(String[] args) {
        String s="abcafafgac";
        System.out.println(remove(s,'a'));
        //we need to remove a charcaters from the string using recursion
    }
    public static void remove(String p,String up,char r)
    {
        if (up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if (ch==r)
        {
            //if this is the one we need not to enter in the answer
            remove(p,up.substring(1),r);
        }
        else{
            //add it in the answer
            remove(p+ch,up.substring(1),r);
        }
    }
    //now the same thing while returning the string
    public static String remove(String p,char r)
    {
        if (p.isEmpty())
        {
            return " ";
        }
        char c=p.charAt(0);
        if (c==r)
        {
            //we dont need to add
            return remove(p.substring(1),r);
        }
        else{
            return c+remove(p.substring(1),r);
        }
    }
}
