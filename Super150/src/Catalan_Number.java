import java.util.*;
public class Catalan_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        Arrays.fill(dp , -1);
        System.out.println(CatalanNumber(n , dp));
    }
    private static int CatalanNumber(int n , int[] dp){
        if(n == 0 || n == 1)
                return 1;
        if(dp[n] != -1)
            return dp[n];
        int ans = 0;
        for(int i = 1 ; i <= n ; i++)
            ans += (CatalanNumber(i-1 , dp) * CatalanNumber(n-i , dp));
        return dp[n] = ans;
    }
}
