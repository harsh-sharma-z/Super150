package Recursion;
import java.util.ArrayList;
public class ArraySubSeq {
    public static void subseq(int ind, int n, int[] arr, ArrayList<Integer> uwu)
    {
        if(ind==n)
        {

                System.out.print(uwu);
            System.out.println("");
            return;
        }
        subseq(ind+1,n,arr,uwu);
        uwu.add(arr[ind]);
        subseq(ind+1,n,arr,uwu);
        uwu.remove(uwu.size()-1);


    }
    public static void main(String[] args) {
        int arr[]={3,1,2};
        int n=arr.length;
        subseq(0,n,arr,new ArrayList<>());
    }
}
