public class maximumSumOfWindow {

    public static void main(String[] args) {
        int[] arr={2,3,7,1,4,11,3,8,15,17,2};
        System.out.println(maxSum(arr,3));
    }

    private static int maxSum(int[] arr,int k)
    {
        int sum=0;
        int max=0;

        for (int i = 0; i < k; i++) {
            sum+=arr[i];

        }
        max=sum;
        for(int i=0,j=i+k;j<arr.length;i++,j++)
        {
            sum=sum+arr[j]-arr[i];
            max=Math.max(sum,max);
        }
        return max;
    }
}
