package Recursion;
import java.util.*;
public class queen_permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

    }

    public static void printPermutation(boolean[] board,int tq,int qnsf,String ans,int index)
    {
        if(qnsf==tq)
        {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < board.length ; i++) {
            if(board[i]==false)
            {
                board[i]=true;
                printPermutation(board,tq,qnsf+1,ans+"b"+i+"q"+qnsf,i+1);
            }
        }
    }
}
