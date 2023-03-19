package Searching;
import com.sun.security.jgss.GSSUtil;

import java.util.*;
public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        System.out.println("Enter " +n+" elements of array:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter number to be searched:");
        int key=sc.nextInt();

        boolean found=false;

        for(int i=0;i<n;i++)
        {
            if(arr[i]==key)
            {
                System.out.println(
                        "The number "+key+" is present at index "+i+" of the array."
                );
                found=true;
                break;
            }
        }

        if(!found)
            System.out.println("Not found");



    }
}
