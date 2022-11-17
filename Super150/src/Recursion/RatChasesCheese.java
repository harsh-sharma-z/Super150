package Recursion;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.*;
public class RatChasesCheese {
    static boolean f=false;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char[][] maze=new char[n][m];
        int[][] ans=new int[n][m];
        for(int i=0;i<maze.length;i++)
        {
            String s=sc.next();
            for(int j=0;j<s.length();j++)
                maze[i][j]=s.charAt(j);
        }
        HasPath(maze,0,0,ans);
        if(f==false)
            System.out.println("NO PATH FOUND");
    }

    public static void HasPath(char[][] maze,int cc,int cr,int[][] ans) {

        if(cr==maze.length-1 && cc==maze[0].length-1 && maze[cr][cc]!='X'){
            ans[cr][cc]=1;
            Display(ans);
            f=true;
            return;
        }

        if(cr<0||cc<0||cr>=maze.length||cc>=maze[0].length||maze[cr][cc]=='X'){
            return;
        }

        maze[cr][cc]='X';
        ans[cr][cc]=1;
        HasPath(maze,cc,cr-1,ans);
        HasPath(maze,cc,cr+1,ans);
        HasPath(maze,cc-1,cr,ans);
        HasPath(maze,cc+1,cr,ans);
        maze[cr][cc]='O';
        ans[cr][cc]=0;
    }

    public static void Display(int[][] ans){
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
