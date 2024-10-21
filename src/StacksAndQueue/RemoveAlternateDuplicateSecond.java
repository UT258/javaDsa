package StacksAndQueue;

import java.util.Stack;

public class RemoveAlternateDuplicateSecond {
     public static void main(String[] args) {
        String str="abbaca";
        System.out.println();
    }
    public String removeDuplicates(String s) {
    class Pair{
        char ch;
        int count;
        Pair(char ch,int count)
        {
            this.ch=ch;
            this.count=count;
        }
    }

        Stack<Pair> st=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(st.isEmpty())
            {
                st.push(new Pair(s.charAt(i),1));
            }
            else
            {
                if(st.peek().ch==s.charAt(i))
                {
                    Pair p=st.pop();
                    p.count++;
                    if(p.count%2==0)
                    {
                        continue;
                    }
                    else
                    {
                        st.push(p);
                    }
                }
                else
                {
                    st.push(new Pair(s.charAt(i),1));
                }
            }
        }
        return "";
    }
}
