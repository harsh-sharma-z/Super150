package Graph;
import javax.swing.*;
import java.util.*;
public class Topological_Sort {
    private HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();

    public Topological_Sort(int v)
    {
        for(int i=1;i<=v;i++)
            map.put(i,new HashMap<>());
    }

    public void addEdge ( int v1, int v2, int cost)
    {
        map.get(v1).put(v2,cost);
    }

    public int[] indegree(){
        int[] in=new int[map.size()+1];
        for(int key:map.keySet())
        {
            for(int nbrs:map.get(key).keySet())
                in[nbrs]++;
        }
        return in;
    }
    public void TopoSort()
    {
        int in[]=indegree();
        Queue<Integer> q=new LinkedList<>();

        for(int i=1;i<in.length;i++)
            if(in[i]==0)
                q.add(i);

        while(!q.isEmpty())
        {
            int key=q.peek();
            q.remove();
            System.out.print(key+" ");
            for(int nbrs: map.get(key).keySet())
            {
                in[nbrs]--;
                if(in[nbrs]==0)
                    q.add(nbrs);

            }
        }
    }

    public boolean isCycle()
    {
        Queue<Integer> qq=new LinkedList<>();
        int[] ind=indegree();
        for (int i = 1; i < ind.length; i++) {
            if (ind[i] == 0) {
                qq.add(i);
            }

        }

        int c=0;

        while(!qq.isEmpty())
        {
            int key=qq.poll();
            c++;
            for(int nbrs:map.get(key).keySet())
            {
                ind[nbrs]--;
                if(ind[nbrs]==0)
                    qq.add(nbrs);
            }
        }

        return c== map.size()?true:false;

    }
}
