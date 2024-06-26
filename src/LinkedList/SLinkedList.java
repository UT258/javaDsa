package LinkedList;

import java.util.LinkedList;

public class SLinkedList {
    //and it will contain a headTreeNode head;

    //create a head that is common to all so it will be in outer class
    TreeNode head;

    public static void main(String[] args)  {
        SLinkedList ll = new SLinkedList();
       ll.insertLast(1);
       ll.insertLast(2);
      ll.insertLast(2);
      ll.insertLast(4);
      ll.insertLast(5);
      ll.display();
       ll.display();


//        System.out.println();
//        System.out.println(ll.removeFirst());
//        System.out.println(ll.removeLast());
//        ll.display();
//
//        System.out.println(ll.size());
    }

    //we need to insert in the list
    public void insert(int value) {
        //first we need to check if the it is the first element
        TreeNode node = new TreeNode(value);
        if (head == null) {
            head = node;
            head.next = null;
        } else {
            //this is working like the insert first
            node.next = head;
            head = node;


        }

    }


    //insert from last
    public void insertLast(int value) {
        //add the element from last
        if (head == null) {
            head = new TreeNode(value);
            head.next = null;

        }
        TreeNode node = head;

        while (node.next != null) {
            //keep moving forward
            node = node.next;
        }
        node.next = new TreeNode(value);

    }

    //remove first
    public int removeFirst() {
        if (head == null) {
            System.out.println("you cannot remove from empty list");
            return -1;
        }
        int val = head.val;
        head = head.next;


        return val;
    }

    //remove last
    public int removeLast() {
        TreeNode node = head;
        while (node.next != null) {
            node = node.next;
        }
        //here  i will get the last node
        int val = node.val;
        node = null;
        return val;

    }
    //now finding the size of the linked list
    public int size()
    {
        TreeNode node=head;
        int count=0;
        while(node!=null)
        {
            count++;
            node=node.next;
        }
        return count;
    }
    //function to get the node at a certain
    public TreeNode getNode(int index)
    {
        int i=0;
        TreeNode node=head;
        while (node!=null)
        {
            if (i==index)
            {
                return node;
            }
            i++;
            node=node.next;

        }

        //if above statement does not work then return head
        return head;
    }
    //code for finding the middle of the the linked list using fast and slow pointer
    //in the floyd cycle detection algorithm the fast pointer moves 2 steps and slow pointer moves 1 step
    public TreeNode middle(TreeNode head)
    {
        TreeNode slow =head;
        TreeNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;

            fast=fast.next.next;
        }
        return slow;

    }

//recursive way to insert the element in the linked list
   public void addlastRec(int value,TreeNode head)
   {

       //recursively add the element in the linked list
       if(head.next==null)
       {
           TreeNode dummy =new TreeNode(value);
           head.next=dummy;
           dummy.next=null;

       }
       else {
           addlastRec(value, head.next);
       }

   }
   //remove duplicates from the sorted list
    public void deleteDuplicates()
    {
         TreeNode temp = head;
    while(temp != null && temp.next != null) {
        if(temp.val == temp.next.val) {
            temp.next = temp.next.next;
        } else {
            temp = temp.next;
        }
    }

    }
   public void addAtrec(int index,int value)
   {

      this.head=addAtrec(value,index,head);
   }
   private TreeNode addAtrec(int value,int index,TreeNode node)
   {
         if (node == null || index == 0) {
        TreeNode dummy = new TreeNode(value);
        dummy.next = node;
        return dummy;
    }
    node.next = addAtrec(value, index - 1, node.next);
    return node;


   }


    public void display() {
        TreeNode node = head;
        while (node != null) {
            System.out.print(node.val + " -->");
            node = node.next;
        }

    }

    //creating a singly linked list
    public static class TreeNode {
        int val;
        TreeNode next;

        //constructor for the linked list
        public TreeNode(int val) {
            this.val = val;

        }
    }


}
