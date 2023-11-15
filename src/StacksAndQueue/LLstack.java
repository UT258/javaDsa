package StacksAndQueue;

public class LLstack {
    public  class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
        }


    }
    Node head;
    public LLstack()
    {
        head=null;
    }
    public void push(int val)
    {
        if (head==null)
        {
            //means this is the first element
            Node dummy=new Node(val);
            head=dummy;
            head.next=null;


        }
        //else its not the first element
        Node dummy=new Node(val);
        dummy.next=head;
        head=dummy;

    }
    public  int pop(){
        int val=head.data;
        head=head.next;
        return val;
    }
    public void display()
    {
        Node node =head;
        while (node.next!=null)
        {
            System.out.println(node.data);
            node=node.next;
        }
    }

  public int peek()
  {
      return  head.data;
  }
    public static void main(String[] args) {
     LLstack st=new LLstack();
     st.push(34);
     st.push(35);
     st.push(36);
     st.display();
        System.out.println(st.pop());
        //it working like a stack
        System.out.println(st.peek());

    }

}
