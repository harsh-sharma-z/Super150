package Assignment.Assignment1;
import java.util.*;

//
//Take N (number of rows), print the following pattern (for N = 5).
//
//        * * * * *
//        * *   * *
//        *       *
//        * *   * *
//        * * * * *


public class Hollow_Diamond {
    public static void main(String args[]){
        int i,j;
        Scanner scan=new Scanner(System.in);

        int rows=scan.nextInt();//get input from user
        String s[] = new String[rows/2+1];
//print upper triangle
        for(i=0; i<=rows/2; i++){
            String s1 = "";
            for(j=0; j<=rows/2-i; j++){
                System.out.print("* ");//print space
                s1 += "* ";
            }  //print star
            if(i!=0){
                for(j=0; j<2*i-1; j++){
                    System.out.print("  ");
                    s1 += "  ";
                }
            }
            if(i!=rows/2)
                for(j=0;j<(rows-i)/2;j++){
                    System.out.print("* ");
                    s1 += "* ";
                }
            else{
                System.out.print("* ");
                s1 += "* ";
            }
            System.out.println();
            s[i] = s1;
        }
        //print lower triangle
        for(i=rows/2-1;i>=0;i--){
            System.out.println(s[i]);
        }
    }
}
