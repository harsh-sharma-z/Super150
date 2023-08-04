package Miscellaneous;
import java.util.*;
public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(isPrime(n));
    }

    private static boolean isPrime(int n){
        if(n == 1 || n == 2 || n==3)
            return true;

        for(int i = 2 ; i < Math.sqrt(n) ;  i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
