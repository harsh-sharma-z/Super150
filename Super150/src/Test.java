import java.util.*;
import java.io.*;
public class Test
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"leet" , "code" , "leetcode"};
        System.out.println(minExtraChar("leetscode" , arr));
    }
    private static int n;
    private static HashSet<String> dict;
    public static int minExtraChar(String s, String[] dictionary) {
        n = s.length();
        dict = new HashSet<>(); // for quick access
        for(String a : dictionary)
            dict.add(a);
        return solve(0 , s);
    }
    private static int solve(int idx , String s){
        if(idx >= n)
            return 0; // no extra character required

        String currString = "";
        int minExtra = n;

        for(int i = idx ; i < n ; i++){
            currString = currString + s.charAt(i);
            int currExtra = 0;
            if(dict.contains(currString))
                currExtra = currString.length();

            int nextExtra = solve(i + 1 , s);

            int totalExtra = currExtra + nextExtra;

            minExtra = Math.min(minExtra , totalExtra);
        }

        return minExtra;
    }
}

