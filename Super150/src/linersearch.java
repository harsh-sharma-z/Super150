import java.util.Scanner;

public class linersearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();


        int a=sc.nextInt();
        int c=0;
        for (int i = 0; i <n ; i++) {
            if(a==arr[i])
            {
                c++;
                break;
            }

        }
        if(c==0)
            System.out.println("Not found");
        else
            System.out.println("Found ♥");
    }
}
