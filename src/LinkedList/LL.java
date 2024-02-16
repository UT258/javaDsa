package LinkedList;

import StacksAndQueue.LLstack;
import com.sun.source.tree.Tree;


import java.util.Stack;

public class LL {
    class TreeNode {
        int val;
        TreeNode next;

        public TreeNode(int val) {
            this.val = val;
        }


    }

    TreeNode head;

    public LL() {

    }

    //insert the node
    void insert(int value) {
        if (head == null) {
            head = new TreeNode(value);
            head.next = null;

        }
        TreeNode node = new TreeNode(value);

        node.next = head;

        head = node;

    }

    private TreeNode get(int value) {
        TreeNode node = head;
        while (node.val != value) {
            node = node.next;
        }
        return node;
    }

    void display() {
        TreeNode node = head;
        while (node.next != null) {
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
        TreeNode current = head;
        TreeNode prev = null;
        TreeNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;


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
        TreeNode node = head;
        while (node.next.next != null) {
            node = node.next;
        }
        int delete = node.next.val;
        node.next = null; //this will remove the last node
        return delete;
    }

    public int size() {
        //function to calculate the size
        TreeNode node = head;
        int len = 0;
        while (node.next != null) {


            node = node.next;
            len++;

        }
        return len;
    }

    public void insertFirst(int value) {
        TreeNode prev = head;
        if (head == null) {
            head = new TreeNode(value);
            head.next = null;
        }
        TreeNode node = new TreeNode(value);

        head.next = node;
    }
//the second method to remove the node in a linked list
    //now what you have to do is to find the no


    public void RemoveFromLast(int n) {
        if (n == size()) {
            head = head.next;
            return;
        }

        int size = size();
        TreeNode node = NodeAt(size - n);
        System.out.println("size -n" + (size - n));
        node.next = node.next.next;

    }

    public static void removeNthFromEnd(LL list, int n) {
        //we need to remove the nth node from the end
        //we need to find the size of the linked list
        //we need to find the node at size-n
        //we need to remove the node
        //we need to remove the
        int size = list.size();
        if (n == size) {
            list.head = list.head.next;
            return;
        }
        TreeNode node = list.NodeAt(size - n);
        node.next = node.next.next;


    }

    //add two number LinkedList


    public TreeNode NodeAt(int index) {
        int i = 0;
        TreeNode node = head;
        while (i != index) {
            node = node.next;
            i++;

        }
        return node;
    }


    public static void main(String[] args) {

        }
    }

