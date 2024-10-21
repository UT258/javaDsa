package Recursion;

import java.util.Arrays;

public class Backtracking {
    public static void main(String[] args) {
        //maze problems
        int [][]arr={
                {1,1,1,1},
                {1,1,0,1},
                {1,1,1,1},
                {1,1,1,1}
        };
        allpath("",0,0,arr);
    }
    public static int path(int r ,int c)
    {  //if any of the r and c become 1 means it means you found one of the path
      if(r==1 || c==1)
      {
          return 1;
      }
      return  path(r-1,c)+path(r,c-1);

    }
    //printing the path as well
    public static void displaypath(String up,int r,int c)
    {
        if(r==1 && c==1)
        {
            System.out.println(up);
            return;
        }
        if(c>0) {
            displaypath(up + " R ", r, c - 1); //for moving right  decrease col
        }
         if(r>0)
         {
             displaypath(up+" D ",r-1,c);
         }

    }
    //now all the path when we are considering all the paths
   public static void  allpath(String path,int r,int c,int board[][])
   {
       if(r==board.length-1 && c==board[0].length-1)
       {
           System.out.println(path);
           return;
       }
       if(board[r][c]==0)
       {
           return;
       }
       board[r][c]=0;
       //check for the all the direction
       //check on the left
       if(c>0)
       {
        allpath(path+"L",r,c-1,board);
       }
       //right
       if(c<board.length)
       {
           allpath(path+"R",r,c+1,board);
       }
       //up
       if(r>0)
       {
           //while moving up col remain same
           allpath(path+"U",r-1,c,board);
       }
       //dowm
       if(r<board[0].length)
       {
           allpath(path+"D",r+1,c,board);
       }
       board[r][c]=1;

   }

  }






