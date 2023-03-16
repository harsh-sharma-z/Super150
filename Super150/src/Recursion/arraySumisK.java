package Recursion;
import java.util.ArrayList;
public class arraySumisK {
    public static boolean subseq(int ind, int n, int k,int sum,int[] arr, ArrayList<Integer> uwu)
    {
        if(ind==n)
        {
            if(sum==k)
            {
                System.out.print(uwu);
                System.out.println("");
                return true;
            }
            else
            return false;
        }
        sum+=arr[ind];
        uwu.add(arr[ind]);
        if(subseq(ind+1,n,k,sum,arr,uwu)) return true;
        sum-=arr[ind];
        uwu.remove(uwu.size()-1);
        if(subseq(ind+1,n,k,sum,arr,uwu)) return true;
        return false;



    }
    public static void main(String[] args) {
        int arr[]={1,3,1,2,4};
        int k=4;
        int n=arr.length;
        subseq(0,n,k,0,arr,new ArrayList<>());
    }
}
