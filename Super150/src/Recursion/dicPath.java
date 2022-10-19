package Recursion;
import java.util.*;
public class dicPath {
    public static void PrintPath(int curr,int end,String ans)
    {
        if(curr==end)
        {
            System.out.println(ans);
            return;
        }
        if(curr>end)
        {
            return;
        }

        for(int dice=1;dice<=3;dice++)
        {
            PrintPath(curr+dice,end,ans+dice);
        }

    }


    public static void main(String[] args) {
        int n=3;
        String ans="";
        PrintPath(0,3,ans);
    }
}
