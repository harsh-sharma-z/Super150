import java.lang.reflect.Array;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<>());
        for(int i=0;i<m;i++)
        {
            int u=sc.nextInt();
            int v=sc.nextInt();
            u--;
            v--;
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        if(a<=b)
        {
            System.out.println(a*n);
        }
        else {
            int ans=0;
            int[] vis=new int[n];
            for(int i=0;i<n;i++ )
            {
                if(vis[i]==0)
                {
                    int k=dfs(i,adj,vis,0);
                    ans=ans+((k-1)*b)+a;
                }
            }
            System.out.println(ans);
        }

        }
    }
    private static int dfs(int node , ArrayList<ArrayList<Integer>> adj, int[] vis, int road)
    {
        vis[node]=1;
        for(Integer i:adj.get(node))
        {
            if(vis[i]==0)
                road+=dfs(i,adj,vis,road+1);
        }
        return road;
    }
}
