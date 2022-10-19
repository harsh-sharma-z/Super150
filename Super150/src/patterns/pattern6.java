package patterns;

import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
        {

            for(int j=0;j<i+n;j++)
            {
                if(j<i*2)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
