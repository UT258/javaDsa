package Graph;

import java.util.ArrayList;

public class DisjointSet {

    ArrayList<Integer>rank=new ArrayList<>();
    ArrayList<Integer>parent=new ArrayList<>();
    ArrayList<Integer>size=new ArrayList<>();


    public DisjointSet(int n) {
        //mark all the parent with itself when there is no addtion
        for (int i = 0; i <=n ; i++) {
            rank.add(0);
            parent.add(i);//cuz they are the super parent of each other
            size.add(1);//size is one for all the nodes

        }
    }
    public int ultimateParent(int node)
    {
     //we will use path compression using recursion
        if(parent.get(node)==node)
        {
            //if the parent is equal to itself we found the node that is common ultimate parent
            return node;
        }
        //now here path compression takes place
        int ult=ultimateParent(parent.get(node));//find the parent for all the nodes
        parent.set(node,ult);//when return the node will be the parent for all the nodes
        return parent.get(node);

    }
    public void UnionByRank(int u,int v){
        int ultimateU=ultimateParent(u);
        int ultimateV=ultimateParent(v);
        if(rank.get(ultimateU)< rank.get(ultimateV))
        {
            //if u is lesser then connect the smaller to greater
            //so there will be no  change in the rank
            parent.set(ultimateU,ultimateV);
        }
        else if(rank.get(ultimateV)<rank.get(ultimateU))
        {   //smaller guy connected to greater guy
            parent.set(ultimateV,ultimateU);
        }
        else{
            //means both are equal
            parent.set(ultimateV,ultimateU);
            rank.set(ultimateU,rank.get(ultimateU)+1 );
            //increase the rank
        }

    }
    //find union by size
    public void unionBysize(int u,int v){
        int ult_u=ultimateParent(u);
        int ult_v=ultimateParent(v);
        if (ult_v==ult_u)
        {
            return;

        }
        if(size.get(ult_v)<size.get(ult_u))
        {
            parent.set(ult_v,ult_u);
            size.set(ult_v, size.get(u)+size.get(v) );
        }
        if(size.get(ult_u)<size.get(ult_v))
        {
            parent.set(ult_u,ult_v);
             size.set(ult_u, size.get(v)+size.get(u) );
        }
        else{
            parent.set(ult_u,ult_v);
            size.set(ult_u, size.get(u)+size.get(v) );
        }
    }



    public static void main(String[] args) {
     DisjointSet ds=new DisjointSet(7);
     ds.UnionByRank(1, 2);
        ds.unionBysize(2, 3);
        ds.unionBysize(4, 5);
        ds.unionBysize(6, 7);
        ds.unionBysize(5, 6);

        // if 3 and 7 same or not
        if (ds.ultimateParent(3) == ds.ultimateParent(7)) {
            System.out.println("Same");
        } else
            System.out.println("Not Same");

        ds.unionBysize(3, 7);
        if (ds.ultimateParent(3) == ds.ultimateParent(7)) {
            System.out.println("Same");
        } else
        {
            System.out.println("not same");
        }

    }
}
