package DP;
import java.util.*;
public class Fibo {
    public static void main(String[] args) {
        int n=150;
        long[] dp=new long[n+1];
        long a=(long)System.currentTimeMillis();
        System.out.println(fib(n,dp));
        long b=(long)System.currentTimeMillis();
        System.out.println(b-a);
        for(long k: dp)
            System.out.print(a+" ");
    }
    public static long fib(int n,long[] dp)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        if(dp[n]!=0)
            return dp[n]; // Dp agayi Dp
        long f1=fib(n-1,dp);
        long f2=fib(n-2,dp);
        return dp[n]=f1+f2; // Oo modifile kraya huya hai
    }
}
