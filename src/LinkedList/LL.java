package LinkedList;

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
    public void insertFist(int val)
    {

    }
    void display()
    {
        TreeNode node =head;
        while (node.next!=null)
        {
            System.out.println(node.val+"->");
            node=node.next;

        }
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

    public static void main(String[] args) {
        LL list=new LL();

        list.insert(35);
        list.insert(36);
        list.insert(37);
        list.insert(38);
        list.insert(323);
        list.insert(3653);
        list.insert(347);
        list.insert(3834);
        list.display();



    }
}
