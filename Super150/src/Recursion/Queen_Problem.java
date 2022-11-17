//package Recursion;
//import java.awt.*;
//import java.util.*;
//public class Queen_Problem {
//    public static void main(String[] args) {
//        int n=4;
//        boolean[][] board=new boolean[][];
//        N_Queen(board,n,0);
//    }
//
//    public static void N_Queen(boolean [][] board, int tq,int row) {
//        if(tq==0){
//            Display(board);
//            return;
//        }
//        for(int col=0;col<board.length;col++)
//        {
//            if(issafe(board,row,col)==true){
//                board[row][col]=true;
//                N_Queen(board,tq-1,row+1);
//                board[row][col]=false;
//            }
//        }
//
//    }
//
//    public static boolean issafe(boolean[][] board,int row,int col){
//        int r=row;
//        int c;
//        while(r>=0){
//            if(board[r][col]==true){
//                return false;
//            }
//            r--;
//        }
//        r=row;
//        c=col;
//        while(r>0 && c< )
//
//        return false;
//    }
//
//
//    public static void Display(boolean[][] board)
//    {
//        for(int i=0;i<board.length;i++)
//        {
//            for(int j=0;j<board[0].length;j++)
//            {
//                System.out.print(board[i][j]+" ");
//            }
//            System.out.println("");
//        }
//    }
//}
