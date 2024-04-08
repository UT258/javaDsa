package pod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class numberofStudentUnabletoEat {
    public static void main(String[] args) {
        //we need to find the number of student that are able to eat
        int student[]={1,1,1,0,0,1};
        int sandwiches[]={1,0,0,0,1,1};
        System.out.println(countStudents(student,sandwiches));

    }
     public static int countStudents(int[] students, int[] sandwiches) {
         Deque<Integer>st=new LinkedList<>();
         for(int n:students)
         {
             st.add(n);
         }
         int i=0;
         while (i<students.length)
             if(st.getFirst()==sandwiches[i])
             {
                 st.removeFirst();
                 i++;
             }
             else{
                 int temp=st.removeFirst();
                 st.addLast(temp);
             }


         return st.size();
    }
}
