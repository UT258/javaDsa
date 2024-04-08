package pod;

import javax.print.DocFlavor;
import java.util.Stack;

public class MinimumRemoveToMakeParenthesisValid {
    public static void main(String[] args) {
        //6 april 2024
        System.out.println(minRemoveToMakeValid("))(("));
    }
    public static String minRemoveToMakeValid(String s) {
        //just put it in the stack if there is something left in the stack after removing then that is needed to be removed
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<s.length();i++)

        {
            if (Character.isLowerCase(s.charAt(i)))
                continue;
         if(s.charAt(i)=='(')
         {
             st.push(i);
         }
         else if(s.charAt(i)==')')
         {
             if (!st.isEmpty() && s.charAt(st.peek())=='(')
             {
                 st.pop();
             }
             else
             {
                 st.push(i);
             }
         }

        }
         StringBuilder ans=new StringBuilder(s);
        if (st.isEmpty())
        {
            return s;
        }
        else{

            while(!st.isEmpty())
            {
                ans.deleteCharAt(st.pop());
            }
        }
        return ans.toString();


    }
}
