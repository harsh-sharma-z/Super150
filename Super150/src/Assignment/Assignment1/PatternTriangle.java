package Assignment.Assignment1;
import java.util.*;
//Take N (number of rows), print the following pattern (for N = 4).
//
//        1
//        2 3 2
//        3 4 5 4 3
//        4 5 6 7 6 5 4
public class PatternTriangle {


    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b,c;
        for(int i=1;i<=a;i++){
            for(int k=i;k<a;k++)
                System.out.print("\t");
            b=i;
            for(int j=1;j<=i*2-1;j++){
                System.out.print(b+"\t");
                if(j>=i)
                    b--;
                else
                    b++;
            }
            System.out.println("");
        }

    }


}
