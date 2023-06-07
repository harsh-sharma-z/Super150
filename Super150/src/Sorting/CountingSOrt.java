package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSOrt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={2,1,1,0,1,2,5,4,0,2,8,7,9,2,6,1,9};
        arr=countSort(arr);
        for (int i:arr)
            System.out.print(i+" ");
    }

    private static int[] countSort(int[] arr)
    {
        int max= Arrays.stream(arr).max().getAsInt();
        int[] freq=new int[max+1];

        for(int i:arr)
            freq[i]++;

        for(int i=1;i<freq.length;i++)
        {
            freq[i]+=freq[i-1];
        }

        int ans[]=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--)
        {
            int pos=freq[arr[i]];
            ans[pos-1]=arr[i];
            freq[arr[i]]--;
        }
        return ans;
    }
}














