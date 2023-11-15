package LinkedList;

import StacksAndQueue.LLstack;
import com.sun.source.tree.Tree;

import java.security.PublicKey;
import java.util.Stack;

public class LL {
    class TreeNode{
        int val;
        TreeNode next;
        public TreeNode(int val)
        {
            this.val=val;
        }

    }
    TreeNode head;
    public LL()
    {

    }
    //insert the node
    void insert(int value)
    {
        if (head==null)
        {
            head=new TreeNode(value);
            head.next=null;

        }
        TreeNode node =new TreeNode(value);

        node.next=head;

        head=node;

    }
      private  TreeNode get(int value)
   {
       TreeNode node =head;
       while(node.val!=value)
       {
           node=node.next;
       }
       return node;
   }

    void display()
    {
        TreeNode node =head;
        while (node.next!=null)
        {
            System.out.print(node.val+"->");
            node=node.next;

        }
    }
   public void reverse()
    {
        //just need to reverse the linked list

    }
    //we have to remove the node
   public int  removefirst()

    { int value = head.val;
        //remove the node
        while(head.next!=null) {


            head = head.next;
            return value;

        }
        System.out.println("you cannot remove from an empty list");
        return -1;

    }
    //remove the last node

public int removelast()
{
    TreeNode node =head;
    while (node.next.next!=null)
    {
        node=node.next;
    }
    int delete=node.next.val;
    node.next=null; //this will remove the last node
    return delete;
}
public int size()
{
    //function to calculate the size
    TreeNode node =head;
    int len=0;
    while (node.next!=null)
    {


        node=node.next;
        len++;

    }
    return  len;
}
public void insertFirst(int value)
{  TreeNode prev=head;
    if (head==null)
    {
        head=new TreeNode(value);
        head.next=null;
    }
    TreeNode node=new TreeNode(value);

    head.next=node;
}



// question we need to remove the node  from the last
    public  void RemoveFromLast(int n)

    {
     if (n==size())
     {
         head=head.next;
         return;
     }

    int size=size();
    TreeNode node =NodeAt(size-n);
        System.out.println("size -n" + (size-n));
    node.next=node.next.next;








    }
    public  TreeNode NodeAt(int index)
    {
        int i=0;
        TreeNode node =head;
        while(i!=index)
        {
            node=node.next;
            i++;

        }
        return node;
    }



    public static void main(String[] args) {
        LL list=new LL();
        Stack<TreeNode> node =new Stack<>();


        list.insert(36);
        list.insert(37);
//        list.insert(38);
//        list.insert(323);
//        list.insert(3653);
//        list.insert(347);
//        list.insert(3834);
        System.out.println("size :"+" "+list.size());
       // System.out.println(list.NodeAt(2).val);
        list.display();

        System.out.println();
       //remove
        list.display();






    }
}
