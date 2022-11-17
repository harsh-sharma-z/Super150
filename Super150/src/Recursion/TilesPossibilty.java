package Recursion;
import java.util.*;
public class TilesPossibilty {

    public static void main(String[] args) {
        String tiles="AAABBC";

        int[] freq=new int[24];

        for(int i=0;i<tiles.length();i++)
        {
            freq[tiles.charAt(i)-'A']++;
        }
        System.out.println(subsPermutation("",freq));
    }
   // List<List> uwu=new ArrayList<ArrayList<>>();
    private static int subsPermutation(String res,int[] freq)
    {
        int c=0;
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]>=1)
            {
                char ch=(char) ('A'+i);
                freq[i]--;
                c+=subsPermutation(res+ch,freq)+1;
                freq[i]++;
            }
        }
        return c;
    }

}
