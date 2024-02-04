package Graph;

import java.util.ArrayList;
//method is to create the graph using Array of Arraylist

public class graph {
      class Edge{
          int src;
          int des;
          Edge(int src ,int dest)
          {
            //constructor for the graph
              this.src=src;
              this.des=dest;
          }
      }
      public void insert(ArrayList<Edge> graph[])
      {
       //first we need to change the value at the list from null to empty ArrayList
          for(int i=0;i<graph.length;i++)
          {
              graph[i]=new ArrayList<Edge>();

          }
          //now here it is intialized with empty array List
          graph[0].add(new Edge(0,2));
          graph[1].add(new Edge(1,3));
          graph[1].add(new Edge(1,2));
          graph[2].add(new Edge(2,0));
          graph[2].add(new Edge(2,1));
          graph[2].add(new Edge(2,3));
          graph[3].add(new Edge(3,1));
          graph[3].add(new Edge(3,2));


      }
      //find the neighbours of the vertex
      public  void FindNeighbour(int v,ArrayList<Edge> graph[])
      {
          //just loop through the list in the
          System.out.println("neighbour of the vertex "+ v +" are");
          for (Edge a :graph[v])
          {

              System.out.println(a.des);
          }
      }






    public static void main(String[] args) {
          //vertices for the same
        int v=4;
        ArrayList<Edge> graph[]=new ArrayList[v];
        graph a =new graph();
        a.insert(graph);
         a.FindNeighbour(2,graph);

    }
}
