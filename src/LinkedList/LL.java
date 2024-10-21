package LinkedList;



  class LL {
      static class ListNode {
        int val;
        ListNode next;
















































































































































        public ListNode(int val) {
            this.val = val;
        }
        public ListNode()
        {

        }


    }

    ListNode head;

    public LL() {

    }

    //insert the node
   public void insert(int value) {
        if (head == null) {
            head = new ListNode(value);
            head.next = null;

        }
        ListNode node = new ListNode(value);

        node.next = head;

        head = node;

    }

    public ListNode get(int value) {
        ListNode node = head;
        while (node.val != value) {
            node = node.next;
        }
        return node;
    }

    void display() {
        ListNode node = head;
        while (node != null) {
            System.out.print(node.val + "->");
            node = node.next;

        }
    }

    public void reverse() {
        //just need to reverse the linked list
        //reverse the linked list
        //we need to take three pointer
        //one will point at the current node
        //one will point at the previous node
        //one will point at the next node
      ListNode prev=null;
      ListNode pres=head;
      ListNode next=pres.next;
      while(pres!=null)
      {
          pres.next=prev;

          prev=pres;
          pres=next;
          if(next!=null)
          {
              next=next.next;
          }
      }
      head=prev;


    }

    //we have to remove the node
    public int removefirst() {
        int value = head.val;
        //remove the node
        while (head.next != null) {


            head = head.next;
            return value;

        }
        System.out.println("you cannot remove from an empty list");
        return -1;

    }
    //remove the last node

    public int removelast() {
        ListNode node = head;
        while (node.next.next != null) {
            node = node.next;
        }
        int delete = node.next.val;
        node.next = null; //this will remove the last node
        return delete;
    }

    public int size() {
        //function to calculate the size
        ListNode node = head;
        int len = 0;
        while (node!= null) {

            len++;
            node = node.next;


        }
        return len;
    }

    public void insertFirst(int value) {
        ListNode prev = head;
        if (head == null) {
            head = new ListNode(value);
            head.next = null;
        }
        ListNode node = new ListNode(value);

        head.next = node;
    }
//the second method to remove the node in a linked list
    //now what you have to do is to find the no
    public void insertLast(int value) {
        if(head==null)
        {
            head=new ListNode(value);
            head.next=null;
            return;
        }
        ListNode node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new ListNode(value);
    }


    public void RemoveFromLast(int n) {
        if (n == size()) {
            head = head.next;
            return;
        }

        int size = size();
        ListNode node = NodeAt(size - n);
        System.out.println("size -n" + (size - n));
        node.next = node.next.next;

    }
    //merge sort in linked list


    private static LL   merge(LL left, LL right) {
        ListNode h1=left.head;
        ListNode h2=right.head;
        LL ans=new LL();
        while (h1!=null && h2!=null)
        {
            if(h1.val<h2.val)
            {
                ans.insertLast(h1.val);
                h1=h1.next;
            }
            else{
                ans.insertLast(h2.val);
                h2=h2.next;
            }


        }
        if(h1!=null)
        {
            ans.insertLast(h1.val);
            h1=h1.next;

        }
        if(h2!=null)
        {
            ans.insertLast(h2.val);
            h2=h2.next;

        }
        return ans;

    }


   public ListNode sortList(ListNode head) {

        if(head==null && head.next==null)
        {
            return head;
        }
        ListNode mid=middle();
        //divide in two parts
       ListNode left=sortList(head);
       ListNode right=sortList(mid);
       return merge(left,right);

   }


    private ListNode merge(ListNode left, ListNode right) {
        ListNode dummy=new ListNode();
        ListNode temp=dummy.next;
        while(left!=null && right!=null)
        {
            if(left.val<right.val)
            {
                //add the left value
                temp.next=left;
                left=left.next;


            }
            else{
                temp.next=right;
            }
            temp=temp.next;

        }
        return dummy.next;

    }


    public ListNode NodeAt(int index) {
        int i = 0;
        ListNode node = head;
        while (i != index) {
            node = node.next;
            i++;

        }
        return node;
    }
    //middle of the linked list
    public ListNode middle()
    {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;


    }
    //cycle detection
    public  boolean iscycle()
    {
        ListNode fast=head;
        ListNode slow=head;
        while (fast!=null && fast.next!=null)
        {
         fast=fast.next.next;
         slow=slow.next;
         if(slow==fast)
         {
          //if both are equal then cycle is present
          return true;
         }
        }
        return false;
    }
    //length of cycle
    public int LengthCycle()
    {
        ListNode fast=head;
        ListNode slow=head;
        int length=0;
        while (fast!=null && fast.next!=null)
        {
         fast=fast.next.next;
         slow=slow.next;
         if(slow==fast)
         {
          //if both are equal then cycle is present
             //use any pointer go to another pointer one by one
             do{
                 slow=slow.next;
                 length++;
             }while (slow!=fast);
             return length;
         }
        }
        return 0;

    }
public void createCycle() {
    ListNode node = head;
    while (node.next != null) {
        node = node.next;
    }
    node.next = head; // Create cycle
}

    public static void main(String[] args) {
        LL l=new LL();
        l.insertLast(1);
      l.insertLast(2);
      l.insertLast(1);
//        l.insertLast(2);
//        l.insertLast(1);

//


        l.display();
        System.out.println();
        System.out.println("is palindrome:"+isPalindrome(l));
       l.display();




        }
        //question print linked list in zig zag order
     public static void  zigzag(LL list)
     {
         //find middle of the linked list

         ListNode head1= list.head;
         ListNode mid=list.middle().next;
         list.middle().next=null;
          ListNode head2=reverseFrom(mid,list);
         list.middle().next=null;


         while(head2!=null && head1!=null)
         {
          ListNode tem1=head1.next;
           ListNode temp2=head2.next;

             head1.next=head2;
             head2.next=tem1;
             //move the head;
             head1=tem1;
             head2=temp2;
         }




     }
     public static ListNode reverseFrom(ListNode head,LL list)
     {
            //one will point at the next node
         if(list.size()<2)
         {
             return head;
         }

      ListNode prev=null;
      ListNode pres=head;
      ListNode next=pres.next;
      while(pres!=null)
      {
          pres.next=prev;

          prev=pres;
          pres=next;
          if(next!=null)
          {
              next=next.next;
          }
      }
      return prev;
     }
     //pallindrome in a linked list
      public static boolean isPalindrome(LL list)
      {

       ListNode head1= list.head;
       if(head1.next==null)
       {
           return true;
       }
       if(list.size()==2)
       {
           if(head1.val!=head1.next.val)
           {
               return false;
           }
           else {
               return true;
           }
       }
         ListNode mid=list.middle().next;
         list.middle().next=null;
          ListNode head2=reverseFrom(mid,list);
         list.middle().next=null;
         //if there are only two nodes just check if they are equal or not

       //same Zigzag order //first reverse the linked list and check head 1 and 2 if they are equal then palindrome
          while (head2!=null && head1!=null)
          {
              if(head2.val!= head1.val)
              {
                  return false;
              }
              head2=head2.next;
              head1=head1.next;
          }
          return true;

      }




    }

