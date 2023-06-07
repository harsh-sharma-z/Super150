import java.util.*;
public class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,-1,-6,4,-3,12,34,-2,9};
        int n=arr.length;
        int k=3;
        printNegative(arr,k,n);


    }

    private static void printNegative(int arr[], int k, int n)
    {
        int negIndex=0;
        int negEle;

        for(int i=k-1;i<n;i++)
        {
            while((negIndex<=i-k || arr[negIndex]>=0) && negIndex<i)
                negIndex++;

            if(arr[negIndex]<0)
                negEle=arr[negIndex];
            else
                negEle=0;

            System.out.print(negEle+" ");
        }
    }
}

