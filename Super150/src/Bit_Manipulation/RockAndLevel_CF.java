package Bit_Manipulation;

// Link: https://codeforces.com/problemset/problem/1420/B

import java.util.*;

public class RockAndLevel_CF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            boolean[]  vis = new boolean[n];


            long ans = 0;
            for (int i = 31; i >= 0; i--) {
                long c = 0;
                for(int j = 0; j < n ; j++){
                   if(((arr[j]&(1 << i)) != 0) && !vis[j]){
                       c++;
                       vis[j]=true;
                   }
                }

                ans += ((c*(c-1))/2);
            }

            System.out.println(ans);
        }
    }
}

