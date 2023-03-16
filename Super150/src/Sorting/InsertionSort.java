package Sorting;
import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" integer elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        insSort(arr,n);
        System.out.println("Sorted array is:");
        for(int i:arr)
            System.out.print(i+" ");
    }
    private static void insSort(int arr[],int n)
    {
        for(int i=1;i<n;i++)
        {
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>arr[i])
            {   
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
}
