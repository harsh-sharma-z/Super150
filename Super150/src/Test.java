import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=1,rem,num=0;
        while(n>0)
        {
            rem=n%10;
            num = num+(int) ((c * (Math.pow(10, rem-1))) );
            c++;
            n=n/10;
        }

        System.out.println(num);
    }
}
