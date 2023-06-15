package Rabin_Karp;

public class Hashing {
    public static void main(String[] args) {
        String s="apple";
        System.out.println(hasCode(s));
    }

    public static int hasCode(String s)
    {
        long mod=1000000007;
        long pow=1;
        long ans=0;
        int pr=31;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            ans=(ans+((ch-'a'+1)*pow)%mod)%mod;
            ans=(ans+mod)%mod;
            pow=(pow*pr)%mod;
        }
        return  (int)ans;
    }
}
