package Miscellaneous;
import java.util.*;
public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        int len = inp.length();
        int n = Integer.parseInt(inp);

        System.out.println(isArmstrong(n , len));
    }

    private static boolean isArmstrong(int n  , int len){
        int num = n;
        int sum = 0;
        while(num>0){
            int rem = num%10;
            sum+=Math.pow(rem , len);
            num/=10;
        }
        return n==sum;
    }
}
