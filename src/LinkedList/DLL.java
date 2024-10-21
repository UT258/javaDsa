package LinkedList;

import AMCAT.P1;

public class DLL {
    class Node {
        int data;

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        public Node(int data) {
            this.data = data;
        }

        Node next;
        Node prev;

    }
    Node head;
    public void addLast(int val)
    {//if this is the head
        if(head==null)
        {
            head=new Node(val);
            return;
        }
        //if head is not null you are adding the list after 2
        Node node =head;
        while (node.next!=null)
        {
         node=node.next;
        }
        Node current=new Node(val);
        node.next=current;
        current.prev=node;
        current.next=null;

    }
    public void display()
    {
        Node node =head;
        while (node!=null)
        {
            System.out.print(node.data+"-->");
            node=node.next;
        }

    }
    public void reverseDisplay()
    {
        Node node =head;
        while (node.next!=null)
        {
         node=node.next;
        }

        while(node!=null)
        {
            System.out.print(node.data+"-->");
         node=node.prev;

        }
    }


    public static void main(String[] args) {
        DLL l=new DLL();
        l.addLast(2);
        l.addLast(3);
        l.addLast(4);
        l.addLast(5);
       // l.display();
        l.reverseDisplay();
        DLL l2=new DLL();




    }
}
