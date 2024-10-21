package Graph;

import java.util.ArrayList;
import java.util.*;

public class GraphTraversal {
private ArrayList<ArrayList<Integer>>adj;

private  int matrix[][];
private int E;

    public static void main(String[] args) {
   //ther are two method to represent a graph
        //matrix and adj list
        GraphTraversal g=new GraphTraversal();
        g.E=3;
        g.adj=new ArrayList<>(g.E);
        System.out.println(g.adj);
     //pass the adjoint for this
        //intialize the nodes
        for (int i = 0; i < g.E; i++) {
            g.adj.add(new ArrayList<>());
        }
        //now here create the adj
        g.createAdjDirected(g.adj);
        System.out.println(g.adj);



    }
    public void createAdjDirected(ArrayList<ArrayList<Integer>>list)
    {
     //now there is two directed and undirected
     Scanner sc= new Scanner(System.in);
     for(int i=0;i<E;i++)
     {

         System.out.printf("enter the neighbours of node %d ",i);
         int c= sc.nextInt();

         System.out.println("enter the values of neighbours");
         for (int j = 0; j <c ; j++) {

             int a= sc.nextInt();
             list.get(i).add(a);

         }
     }

    }
}
