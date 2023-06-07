import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            String a=sc.next();
            String b=sc.next();
            System.out.println(numDistinct(a,b));
        }
    }
    public static long numDistinct(String s, String t) {
        int n=s.length();
        int m=t.length();
        long dp[][]=new long[n+1][m+1];
        for(long r[]:dp)Arrays.fill(r,-1);
        return f(s,t,dp,0,0);
    }
    public static long f(String s,String t,long dp[][],int i,int j)
    {
        if(i==s.length() && j==t.length())
            return 1;
        if(j==t.length())
            return 1;
        if(i==s.length())
            return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s.charAt(i)==t.charAt(j))
        return f(s,t,dp,i+1,j+1)+f(s,t,dp,i+1,j);
        return dp[i][j]=f(s,t,dp,i+1,j);
    }
}


