package Graph;
import java.util.*;
public class MST_0_1_Opti {
    static TreeSet<Integer>[] arr;
    static TreeSet<Integer> set;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        arr=new TreeSet[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=new TreeSet<>();
        }
        for( int i=0;i<m;i++)
        {
            int a=sc.nextInt()-1;
            int b=sc.nextInt()-1;
            arr[a].add(b);
            arr[b].add(a);
        }
//        for(TreeSet<Integer> a: arr)
//        {
//            System.out.println(a);
//        }
        set=new TreeSet<>();

        for(int i=0;i<n;i++)
        {
            set.add(i);
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            if(set.remove(i))
            {
                ans++;
                dfs(i);
            }
        }
        System.out.println(ans-1);
    }
    public static void dfs(int x)
    {
        List<Integer> l1= new ArrayList<>();
        for(int i: set) {
            if (!arr[x].contains(i)) {
                l1.add(i);
            }
        }
        for(int i:l1){
            set.remove(i);
        }

        for(int i:l1)
            dfs(i);
    }
}
