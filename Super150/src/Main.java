import java.util.*;
public class Main {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

       int n=sc.nextInt();
       int arr[]=new int[n];
         for (int i = 0; i < n; i++) {
             arr[i]=sc.nextInt();
         }
         int k=sc.nextInt();
         int[] ans=findIndices(arr,0,k);

         for(int i:ans)
             System.out.print(i+" ");

    }
    public static int[] findIndices(int []arr,int i,int k)
    {
        if(i==arr.length)
            return new int[0];

        int[] a=new int[0];
        if(arr[i]==k)
        {
            a=new int[1];
            a[0]=i;
        }

        int []b=findIndices(arr,i+1,k);
        int[] res=new int[a.length+b.length];
        int j=0;

        while(j<a.length)
            res[j]=a[j++];

        int p=0;
        while(p<b.length)
            res[j++]=b[p++];
        return res;
    }

}
