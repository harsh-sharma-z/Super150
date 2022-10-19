import java.util.Scanner;

public class base5to10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int least,maxi,inc;
        least=sc.nextInt();
        maxi= sc.nextInt();
        inc=sc.nextInt();

        for(int i=least;i<=maxi;i=i+inc)
        {
            int ans=((5/9)*(i-32));
            System.out.println(i+" "+ans );
        }
    }
}
