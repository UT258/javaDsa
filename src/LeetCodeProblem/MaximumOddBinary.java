package LeetCodeProblem;

public class MaximumOddBinary {
    public static void main(String[] args) {
       //we have to return the maximum odd number that i can make from the given binary String
        String s="010";
        System.out.println(maximumBinaryString(s));
    }

    private static String maximumBinaryString(String s) {
        //we have to return the maximum odd number that i can make from the given binary String
        //count 0 and 1
        int c0=0;
        int c1=0;
        for(char c:s.toCharArray())
        {
            if(c=='0')
            {
                c0++;
            }
            else{
                c1++;
            }
        }
        StringBuilder sb=new StringBuilder();
        sb.append("1".repeat(c1-1));
        //now while i am adding the 1's in the front if there is only one1 then it should not be addeed
        //1 iss reserved for the lsb (last significant bit)
        sb.append("0".repeat(c0));//there is no such condtion for the zero
        //now add 1 here that we reserved for the lsb
        sb.append("1");
        return sb.toString();

    }
}
