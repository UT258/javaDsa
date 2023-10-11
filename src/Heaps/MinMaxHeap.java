package Heaps;

import java.util.ArrayList;

//insertion and deletion is fast o(log N)
public class MinMaxHeap <T extends Comparable <T>> {
    //heap data structure
    //make it generics
    private final ArrayList <T>list;
    public MinMaxHeap()
    {
        list=new ArrayList<>();
    }

    private void swap(int f ,int s)
    {  //swaping number in the arraylist
        T temp=list.get(f);
        list.set(f,list.get(s));
        list.set(s,temp);

    }
    private int parent(int index)
    {
        return (index-1)/2;
    }
    private int left(int index)
    {
        return (index*2)+1;
    }
    private int right(int index)
    {
        return (index*2)+2;
    }
    //insert in the heap

    public void insert(T val)
    {
        list.add(val);
        upheap(list.size()-1);
    }

    private void upheap(int i) {
        if (i==0)
        {
            return;
        }
        int p=parent(i);
        if (list.get(i).compareTo(list.get(p))<0)
        {
            //if this is true means index is smaller than parent but according to condition it should be greater
            swap(p,i);
            upheap(p);//going up
        }
    }
    public T remove() throws Exception {
        if (list.isEmpty()) {
            throw new Exception("Removing from an empty heap!");
        }

        T temp = list.get(0);

        T last = list.remove(list.size() - 1);
        if (!list.isEmpty()) {
            list.set(0, last);
            downheap(0);
        }

        return temp;
    }
    private void downheap(int index) {
        int min = index;
        int left = left(index);
        int right = right(index);

        if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
            min = left;
        }

        if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
            min = right;
        }

        if(min != index) {
            swap(min, index);
            downheap(min);
        }
    }

    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> data = new ArrayList<>();
        while(!list.isEmpty()) {
            data.add(this.remove());
        }
        return data;
    }

    public static void main(String[] args) throws Exception{
        MinMaxHeap<Integer>heap=new MinMaxHeap<>();
        heap.insert(34);
        heap.insert(35);
        heap.insert(36);
        heap.insert(37);
        
        System.out.println(heap.remove());
        System.out.println();


    }
}
