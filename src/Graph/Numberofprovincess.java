package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Numberofprovincess {
     public static void main(String args[]) {


        }


     private static void numsprovincesearch(ArrayList<ArrayList<Integer>>list,int vis[],int current)
    {
       //mark it visited
       vis[current]=1;
       for(Integer edge:list.get(current))
       {
           if(vis[edge]==0)
           {
               numsprovincesearch(list,vis,edge);
           }
       }
    }
    int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        //apply normal dfs
        int count=0;
        //convert adjacency list to adjacency matrix
        ArrayList<ArrayList<Integer>> list =new ArrayList<ArrayList<Integer>>();
        //insert the empty arraylist
        for(int i=0;i<V;i++)
        {
         list.add(new ArrayList<>());
        }
        for(int i=0;i<V;i++)
        {
            for(int j=0;j<V;j++)
            {
                if(adj.get(i).get(j)==1 && i!=j)
                {
                 list.get(i).add(j);
                 list.get(j).add(i);

                }
            }
        }
        //now code for visting all the nodes
        int vis[]=new int[V];
        for(int i=0;i<V;i++)
        {
            if(vis[i]==0)
            {   count++;
                numsprovincesearch(list,vis,i);
            }
        }
        return count;

    }
}
