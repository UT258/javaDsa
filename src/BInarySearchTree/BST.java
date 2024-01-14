package BInarySearchTree;

public class BST {

    //properties of binary search tree
    //left child is always smaller and right child is always bigger
    public class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
        //now the constructor
        TreeNode (int val)
        {
            this.val=val;
        }


    }
    private TreeNode root;
    public void insert(int val)
    {

       root= insert(root,val);
    }
    public TreeNode insert(TreeNode node,int val)
    {
        if (node==null)
        {
            return new TreeNode(val);
        }
        if (val<node.val)
        {
            node.left=insert(node.left,val);
        }
        else
        {
            node.right=insert(node.right,val);
        }
        return node;

        

    }
    public void preorder()
    {
        preorder(root);
    }
    public void preorder(TreeNode node)
    {
        if (node==null)
        {
            return;
        }
        System.out.println(node.val);
        preorder(node.left);
        preorder(node.right);
    }


    public static void main(String[] args) {
        BST bst=new BST();
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(3);
        bst.insert(7);
        bst.insert(18);
        bst.preorder();
    }
}
