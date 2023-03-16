package Sorting;
import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" integer elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        selSort(arr,n);
        System.out.println("Sorted array is:");
        for(int i:arr)
            System.out.print(i+" ");
    }
    private static void selSort(int arr[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
