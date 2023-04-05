package DP;
import java.util.*;
public class Fibo {
    public static void main(String[] args) {
        int n=1000;
        long[] dp=new long[n+1];
        long a=(long)System.currentTimeMillis();
        System.out.println(fibTD(n,dp));
        long b=(long)System.currentTimeMillis();
        System.out.println(b-a);

        a=(long)System.currentTimeMillis();
        System.out.println(fibBU(n));
        b=(long)System.currentTimeMillis();
        System.out.println(b-a);
    }
    public static long fibTD(int n,long[] dp)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        if(dp[n]!=0)
            return dp[n];
        long f1=fibTD(n-1,dp);
        long f2=fibTD(n-2,dp);
        return dp[n]=f1+f2;
    }
    public static long fibBU(int n)
    {
        long dp[]=new long[n+1];

        dp[0]=0;
        dp[1]=1;

        for(int i=2;i<dp.length;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }

        return dp[n];
    }
}
