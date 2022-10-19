import java.util.*;
public class search_root {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        System.out.println("Answer:"+root(n,k));
    }

    public static int root(int n,int k)
    {
        int low=1;
        int high=n;
        int ans=0;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(Math.pow(mid,k)<=n)
            {
                ans=mid;
                low=mid+1;
            }
            else
                high=mid-1;

        }
        return ans;
    }
}
