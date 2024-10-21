package binaryTree;

import java.util.Scanner;

public class binaryTree {
    class Node {
        int val;
        Node left;
        Node right;
        //constructor for the same
        Node(int val,Node left, Node right)
        {
            this.val=val;
            this.right=right;
            this.left=left;
        }
        Node(int val){
            this.val=val;
        }
    }
    private Node root;
    //insert function
    public void insert(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of root node");
        int val=sc.nextInt();
        root=new Node(val);
        insert(root);
    }
    public void insert(Node root)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("do you want to enter the left Node"+root.val);
        boolean left=sc.nextBoolean();
        if(left)
        {
            System.out.println("enter the value of the left node");
            int val=sc.nextInt();
            root.left=new Node(val);
            insert(root.left);
        }
        System.out.println("do you want to enter the right Node"+root.val);
        boolean rigth=sc.nextBoolean();
        if(rigth)
        {
            System.out.println("enter the value of the right node");
            int val=sc.nextInt();
            root.right=new Node(val);
            insert(root.right);

        }
    }
    //traversal


    public  void inorder(Node root)
    {
        if(root==null)
        {
         return;
        }
        inorder(root.left);
        System.out.print(root.val+"->");
        inorder(root.right);

    }


    public static void main(String[] args) {
        binaryTree tree=new binaryTree();
        tree.insert();
        tree.inorder(tree.root);


    }
}
