package DP;

import java.util.Map;
import java.util.Scanner;

public class WineGlass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] wine={2,3,5,1,4};
        int dp[][]=new int[wine.length][wine.length];
        System.out.println("From top-down:"+maxProfit(wine,0,wine.length-1,1,dp));
        System.out.println("From bottom down:"+maxProfit(wine));
    }

    //TD Approach
    private static int maxProfit(int[] wine, int i , int j , int year, int[][]dp)
    {
        if(i>j)
            return 0;
        if(dp[i][j]!=0)
            return dp[i][j];
        int first=wine[i]*year + maxProfit(wine, i +1, j,year+1,dp);
        int second=wine[j]*year+ maxProfit(wine,i,j-1,year+1,dp);
        return dp[i][j]=Math.max(first,second);
    }


    //Buttom up
    private static int maxProfit(int[] wine)
    {
        int[][] dp=new int[wine.length][wine.length];

        for(int i=0;i<dp.length;i++)
        {
            dp[i][i]=wine[i]*wine.length;
        }
        int year =wine.length-1;


        for(int dia=1;dia<dp.length;dia++)
        {
            for(int j=dia;j<wine.length;j++)
            {
                int i=j-dia;
                int first=wine[i]*year+dp[i+1][j];
                int second=wine[j]*year+dp[i][j-1];
                dp[i][j]=Math.max(first,second);
            }
            year--;
        }
        return dp[0][dp.length-1];
    }
}
