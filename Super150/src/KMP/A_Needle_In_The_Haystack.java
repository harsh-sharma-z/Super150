package KMP;

import java.util.Scanner;

public class A_Needle_In_The_Haystack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt())
        {
            int n=sc.nextInt();
            String pattern=sc.next();
            String hay=sc.next();
            lps(hay,pattern);
        }
    }

    public static void lps(String hay, String pattern) {
        String s=pattern+"#"+hay;
        int[] dp=new int[s.length()];
        int len=0;
        for(int i=1;i<dp.length;)
        {
            if(s.charAt(len)==s.charAt(i))
            {
                len++;
                dp[i]=len;
                i++;
            }
            else
            {
                if(len>0)
                {
                    len=dp[len-1];
                }
                else
                {
                    dp[i]=0;
                    i++;
                }
            }
        }
        for(int i=pattern.length(); i<dp.length;i++)
        {
            if(dp[i]==pattern.length())
                System.out.println(i-(2*pattern.length()));
        }
    }
}
