package Recursion.string;

public class reverse {
    public static void main(String[] args) {
        reverseString("olleh","");
        reverseString2("olleh","");
        reverseString3("hello");

    }

    private static void reverseString3(String s) {
        if(s.isEmpty())
        {
            return;
        }
        reverseString3(s.substring(1));
        System.out.print(s);
    }


    private static void reverseString2(String s, String temp) {
        if(s.isEmpty())
        {
            System.out.println(temp);
        return;
        }
        char c=s.charAt(0);
        reverseString2(s.substring(1),c+temp);
    }


    public static void reverseString(String s,String temp)
    {
        //base case use the logic of taking something and removing something
        if(s.isEmpty())
        {
            System.out.println(temp);
            return;
        }
        char c=s.charAt(s.length()-1);

        reverseString(s.substring(0,s.length()-1),temp+c);

    }
    //now using forward indexing
}


