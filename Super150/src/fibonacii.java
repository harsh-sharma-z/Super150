import java.util.Scanner;

public class fibonacii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int f=0,s=1,c=1;

        if(n==0)
        {
            System.out.println("0");
        }
        else

            System.out.print(f+" "+s+" ");
            while(c<n)
            {
                System.out.print(f+s+" ");
                int temp=f+s;
                f=s;
                s=temp;
                c++;

            }

    }
}
