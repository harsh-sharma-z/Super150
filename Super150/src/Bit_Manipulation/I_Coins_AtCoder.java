package Bit_Manipulation;
import java.util.*;
public class I_Coins_AtCoder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double arr[]=new double[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextDouble();
        double dp[][]=new double[(n+4)/2][n];
        for(double []i:dp)
            Arrays.fill(i,-1);
        System.out.println(answer(arr,0,(n+1)/2,dp));
    }

    public static double answer(double[] p, int i, int h ,double[][] dp)
    {
        if(h==0)
            return 1.0;
        if(i==p.length)
            return 0.0;
        if(dp[h][i]!=-1)
            return dp[h][i];
        double ans=p[i]* answer(p,i+1,h-1,dp) + (1-p[i])*answer(p,i+1,h,dp);
        return dp[h][i]=ans;
    }
}
