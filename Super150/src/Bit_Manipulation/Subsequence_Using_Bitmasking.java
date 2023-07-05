package Bit_Manipulation;

import java.util.*;
public class Subsequence_Using_Bitmasking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="abc";
        subsequence(str);
    }

    public static void subsequence(String str)
    {
        int n=str.length();
        for(int i=0;i<(1<<n);i++)
            pattern(i,str);
    }

    public static void pattern(int i, String str)
    {
        int pos=0;
        while(i>0) {
            if ((i & 1) != 0)
                System.out.print(str.charAt(pos));
            i >>= 1;
            pos++;
        }
        System.out.println();
    }

}
