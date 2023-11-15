package StacksAndQueue;

public class ArrayStack {
    //now implement the stack using array
   static int[] data;
   static int capacity =10;
   static int top;
   public ArrayStack(int size)
   {
       if (size!=0)
       {
           data=new int[capacity];

       }
       else{
           data=new int[size];
       }
       top=-1;
   }
   public void Push(int value)
   {
       data[++top]=value;


   }
   public  boolean isEmpty()
   {
       return top==-1;
   }
   public int pop()
   {
       if (top==-1)
       {
           System.out.println("stack is empty");
           return 0;
       }
       int x=data[top];
       top--;
       return x;

   }
   public void display(){
       for (int i = top; i >0 ; i--) {
           System.out.println(data[i]);
       }
    }
    //now the peek method just similar to pop it will give the top of the stack but does not delete it
    public int peek()
    {
        if (isEmpty())
        {
            return -1;
        }
        return data[top];

    }


    public static void main(String[] args) {
        ArrayStack st=new ArrayStack(5);
        System.out.println(st.isEmpty());
        st.Push(1);
        st.Push(2);
        st.Push(3);
        st.Push(4);
        st.Push(5);
        st.display();
        System.out.println("peak   " +st.peek() );
        System.out.println(st.pop());



    }

}
