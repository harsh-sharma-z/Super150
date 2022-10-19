package Recursion;
import java.util.*;
public class findSubsequenceOfString {
    public static void main(String[] args) {
        String s="AAABBC";
        String ans="";
       System.out.println("Number of terms:"+permutation(s,ans));
    }

    public static int permutation(String s,String ans)
    {
        if(s.length()==0)
        {
            System.out.println(ans);
            return 1;
        }
        char ch=s.charAt(0);

        return permutation(s.substring(1),ans)+permutation(s.substring(1),ans+ch);
    }
}
