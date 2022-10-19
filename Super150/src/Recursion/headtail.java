package Recursion;

import java.util.Scanner;

public class headtail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    String s="HT";
    String ans="";
        System.out.println("Enter number of coins:");
    int n=sc.nextInt();
        System.out.println("Possible Outcomes are:");
    recurse(s,ans,n);
    }
    public static void recurse(String s,String ans,int n)
    {
        if(n==0) {
            System.out.println(ans);
            return;
        }
        char c=s.charAt(0);
        char ch=s.charAt(1);
        if(ans.length()>0 && ans.charAt(ans.length()-1)=='H') {
            recurse(s,ans+ch,n-1);
        }
        else {
            recurse(s, ans + c, n - 1);
            recurse(s, ans + ch, n - 1);
        }
    }
}
