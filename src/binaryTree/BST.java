package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BST {
   class Node {
       int val;
       Node left;
       Node right;
       int height;
    public  Node(int val){
        this.val=val;
    }

   }
   private Node root;
   public  boolean isEmpty()
   {
       if(root==null)
       {
           return true;
       }
       return false;
   }
   public int heigth(Node node)
   {
       if(node==null)
       {
           return -1;
       }
       return node.height;
   }
   public void insert(int val){
       root=insert(val,root);
   }
   private Node insert(int val,Node node)
   {

       if(node==null){
           //when the node is null it here it can be inserted
           Node node1=new Node(val);
           return node1;

       }

       if(val<node.val){
           //if value is less than node then go for left;
           node.left=insert(val,node.left);

       }
       else{
           node.right=insert(val,node.right);
       }
      node.height=Math.max(node.left.height,node.right.height)+1;
       return node;


   }
   //traversal
    public void inorder(Node node){
       if(node==null){
           return;

       }
       inorder(node.left);
       System.out.print(node.val);
       inorder(node.right);


    }

    public static void main(String[] args) {
        BST tree=new BST();
        int arr[]={5,4,3,2,1};
        for(int i: arr)
        {
            tree.insert(i);
        }
        tree.inorder(tree.root);
        tree.dfs();
        System.out.println(tree.heigth(tree.root));
    }
    public void dfs()
    {
        ArrayList<Integer>list=new ArrayList<>();
        Queue<Node>q=new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty())

        {
            Node current =q.poll();
            list.add(current.val);
            if (current.left!=null)
            {
                q.offer(current.left);
            }
            if (current.right!=null)
            {
                q.offer(current.right);
            }

        }
        System.out.println(list);


    }




}
