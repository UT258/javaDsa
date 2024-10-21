package Graph;

import java.lang.reflect.Array;
import java.security.interfaces.EdECKey;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
//method is to create the graph using Array of Arraylist

public class graph {
      static class Edge{
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
        //a.FindNeighbour(2,graph);
        
        System.out.println("dfs");
        a.dfs(graph, 0, new boolean[graph.length]);
        System.out.println(a.hasPath(graph,0,5,new boolean[v]));
    }

    //now traversal in the graph
    public void bfsHelper(ArrayList<Edge>[]graph )
    {
        boolean isvisited[]=new boolean[graph.length];
        for (int i = 0; i <graph.length ; i++) {
            if(!isvisited[i])
            {
                bfs(graph,isvisited);
            }
        }

    }
    public void bfs(ArrayList<Edge>[] graph,boolean []isvisited) {
        //breadth first search means level by level
        //just go to nearest neighbour
        Queue<Integer> q = new LinkedList<>();
        boolean[] isVistited = new boolean[graph.length];
        q.offer(graph[0].get(0).src);
        while (!q.isEmpty()) {

            int current = q.remove();
            if (!isVistited[current]) {
                System.out.println(current);
                //mark it true
                isVistited[current] = true;
                //add all the neighbour of the removed edge
                for (int i = 0; i < graph[current].size(); i++) {
                    Edge e = graph[current].get(i);
                    q.offer(e.des);
                }
            }
        }
        //depth first search


    }
    public  void dfsHelper(ArrayList<Edge>[]graph)
    {
      boolean isvisited[]=new boolean[graph.length];
        for (int i = 0; i <graph.length ; i++) {
            if(!isvisited[i])
            {
                dfs(graph,i,isvisited);
            }
        }
    }

    public void dfs(ArrayList<Edge>[] graph, int current, boolean[] isvisited) {
        //depth first search we need to visit the neighbour node
        System.out.println(current);
        //mark it true
        isvisited[current]=true;
        //check all the neighbour
        for(int i=0;i<graph[current].size();i++)
        {    Edge e=graph[current].get(i);
            if(!isvisited[e.des])
            {
                dfs(graph,e.des,isvisited);
            }
        }

        }
    //question has path given src and des check if the path exist or not
    public  boolean hasPath(ArrayList<Edge>[]graph ,int src ,int des,boolean isvisited[])
    {
        if(src==des)
        {
            return true;
        }
        isvisited[src]=true;
        for (int i=0;i<graph[src].size();i++)
        {
            Edge e=graph[src].get(i);
            if(!isvisited[e.des]&& hasPath(graph,e.des,des,isvisited))
            {
                return true;
            }
        }
        return false;
    }
    //cycle in graph
    public static  boolean isCycle(ArrayList<Edge>[]graph)
    {
        boolean visited[]=new boolean[graph.length];
        for (int i=0;i<graph.length;i++)
        {
         if(!visited[i])
         {
             if(isCycleutil(graph,visited,i,-1))
             {
                 return true;
             }
         }
        }
        return false;

    }

    private static boolean isCycleutil(ArrayList<Edge>[] graph, boolean[] visited, int current, int parent) {
          visited[current]=true;
        for (int i = 0; i <graph.length ; i++) {
            Edge e=graph[i].get(i);
            if(!visited[e.des] && isCycleutil(graph,visited,e.des,current))
            {
                return true;
            }
            if(visited[e.des] && e.des!=parent)
            {
             return true;
            }
        }
        return false;

    }
    //bipartite graph
public static int NumberofIsland(char grid[][])
{
    int count=0;
    int r=grid.length;
    int c=grid[0].length;
    //here 1 represent land and 0 represent water
    int vis[][]=new int[r][c];
    for (int i = 0; i <grid.length ; i++) {
        for (int j = 0; j < grid[0].length; j++) {
            if(grid[i][j]==1 && vis[r][c]==0)
            {   count++;
                //means it is not visted and it is land
                bfs(grid,vis,i,j);
            }


        }

    }
    return count;
}

    private static void bfs(char[][] grid, int[][] vis, int r, int c) {
          Queue<Edge>q=new LinkedList<>();
          vis[r][c]=1;
          //add the fist one queue
        q.add(new Edge(r,c));
        while(!q.isEmpty())
        {
            int row=q.peek().src;
            int col=q.peek().des;
            q.remove();
            //now traverse the neighbour
            for (int i = -1; i <=1 ; i++) {
                for (int j = -1; j <=1 ; j++) {
                    int nrow=row+i;
                    int ncol=col+j;
                    if(nrow>=0 && nrow< grid.length && ncol>=0 && ncol<grid[0].length && grid[nrow][ncol]==1 && vis[nrow][ncol]==0)
                    {
                        vis[nrow][ncol]=1;
                        q.add(new Edge(nrow,ncol));
                    }

                }

            }
        }
        //number of island 
    }

}
