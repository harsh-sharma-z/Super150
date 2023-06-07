package MCM;

public class MatrixChainMultiplication {
    public static void main(String[] args) {
        int arr[]={4,2,3,5,1};
        System.out.println(mcm(arr,0,arr.length-1));
    }
    private static int mcm (int[] arr, int si, int ei)
    {
        if(si+1==ei)
            return 0;
        int ans=Integer.MAX_VALUE;
        for(int k=si+1;k<ei;k++)
        {
            int fs=mcm(arr,si,k);
            int ss=mcm(arr,k,ei);
            int rs=arr[si]*arr[k]*arr[ei];
            ans=Math.min(ans,fs+ss+rs);
        }
        return ans;
    }
}
