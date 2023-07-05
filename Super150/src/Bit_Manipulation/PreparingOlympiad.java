package Bit_Manipulation;

import java.util.*;
public class PreparingOlympiad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=sc.nextInt();
        int r=sc.nextInt();
        int x=sc.nextInt();
        int c[]=new int[n];
        for(int i=0;i<n;i++)
            c[i]=sc.nextInt();
        System.out.println(countContest(c,l,r,x,n));
    }

    public static int countContest(int[] c , int l, int r, int x, int n)
    {
        int ans=0;
        for(int i=3;i<(1<<n);i++)
        {
            if(countSetBit(i)>=2)
            {
                if(isItPossible(c,l,r,x, n,i))
                    ans++;
            }
        }
        return ans;
    }

    public static boolean isItPossible(int[] c, int l , int r, int x, int n, int i) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int sum=0;
        int pos=0;
        while(i>0)
        {
            if((i&1)!=0)
            {
                sum+=c[pos];
                min=Math.min(min, c[pos]);
                max=Math.max(max, c[pos]);
            }
            i>>=1;
            pos++;
        }

        if(sum>=l && sum<=r && (max-min)>=x)
            return true;

        return false;
    }

    public static int countSetBit(int n)
    {
        int c=0;
        while(n>0)
        {
            n=n&(n-1);
            c++;
        }
        return c;
    }
}
