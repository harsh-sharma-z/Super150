package Rabin_Karp;

import java.lang.reflect.Array;
import java.util.*;

public class Pattern_Find {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            String s=sc.next();
            String p=sc.next();
            RabinCarp(s,p);
        }
    }

    public static void RabinCarp(String s, String p)
    {
        long mod=1000000007;
        long pow=1;
        long hv=0;
        int pr=31;

        for(int i=0;i<p.length();i++)
        {
            char ch=p.charAt(i);
            hv= (hv + ((ch-'a'+1)*pow)%mod)%mod;
            hv=(hv+mod)%mod;
            pow=(pow*pr)%mod;
        }


        //yaha  se Rabin Karp chalu hai
        long  []dp=new long[s.length()];
        long  []pa=new long[s.length()];
        dp[0]=s.charAt(0)-'a'+1;
        pa[0]=1;
        pow=pr;


        for(int i=1;i<pa.length;i++)
        {
            char ch=s.charAt(i);
            dp[i]=(dp[i-1]+((ch-'a'+1)*pow)%mod)%mod;
            pa[i]=pow;
            pow=(pow*pr)%mod;
        }

        ArrayList<Integer> ll=new ArrayList<>();
        if(dp[p.length()-1]==hv)
        {
            ll.add(1);
        }

        for(int ei=p.length(),si=1;ei<pa.length;ei++,si++){
            long hvvalue=dp[ei]-dp[si-1];
            if(hvvalue == hv*pa[si]%mod)
            {
                ll.add(si+1);
            }
        }


        if(ll.size()==0)
        {
            System.out.println("Not Found");
        }
        else{
            System.out.println(ll.size());
            for(int k:ll)
                System.out.print(k+" ");
        }
    }
}
