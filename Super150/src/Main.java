import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=1000000000;
        for(long i=0;i<n;i++)
            for(long j=0;j<n;j++)
                System.out.println(i*j);
    }
}