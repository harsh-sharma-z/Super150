package Graph;
import java.util.*;
import java.util.HashSet;
import java.util.LinkedList;

//FOR UNDIRECTED WEIGHTED
public class Graph {
    private HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
    public Graph(int v)
    {
        for(int i=1;i<=v;i++)
        {
            map.put(i,new HashMap<>());
        }
    }

    public void addEdge(int v1,int v2,int cost)
    {
        map.get(v1).put(v2,cost); //v1-->v2
        map.get(v2).put(v1,cost); //v2-->v1
    }

    public boolean ContainsEdge(int v1,int v2)
    {
       return map.get(v1).containsKey(v2);
    }

    public boolean ContainsVertex(int v1)
    {
        return map.containsKey(v1);
    }

    public int noOfEdges(){
        int sum=0;
        for(int key:map.keySet())
            sum+=map.get(key).size();
        return sum/2;
    }


    public void removeEdge(int v1,int v2)
    {
        map.get(v1).remove(v2);
        map.get(v2).remove(v1);
    }

    public void removeVertex(int v1)
    {

        for(int key:map.keySet())
            map.get(key).remove(v1);

        map.remove(v1);

    }

    public void display()
    {
        for(int key:map.keySet())
        {
            System.out.println(key+" "+map.get(key));
        }
    }

    public boolean hasPath(int src, int des, HashSet<Integer> vis)
    {
        if(src==des) return true;
        vis.add(src);
        for(int nbrs:map.get(src).keySet())
        {
            if(vis.contains(nbrs))
                continue;
            boolean ans=hasPath(nbrs,des,vis);
            if(ans)
                return ans;
        }
        vis.remove(src);
        return false;
    }

    public void printAllPath(int src, int des, HashSet<Integer> vis,String ans)
    {
        if(src==des)
        {
            System.out.println(ans+src);
            return;
        }
        vis.add(src);
        for(int nbrs:map.get(src).keySet())
        {
            if(!vis.contains(nbrs))
            {
                printAllPath(nbrs,des,vis,ans+src);
            }
        }

        vis.remove(src);
    }


    public boolean bfs(int src,int des)
    {
        HashSet<Integer> vis=new HashSet<>();
        Queue<Integer> q=new LinkedList<>();
        q.add(src);
        while(!q.isEmpty()) {
            int curr = q.poll();
            if (vis.contains(curr))
                continue;

            vis.add(curr);

            if (curr == des)
                return true;

            for (int nbrs : map.get(curr).keySet())
                if (!vis.contains(nbrs))
                    q.add(nbrs);
        }
            return false;

    }

    public boolean dfs(int src, int des)
    {
        HashSet<Integer> vis=new HashSet<>();
        Stack<Integer> st=new Stack<>();

        st.push(src);

        while(!st.isEmpty())
        {
            int curr=st.pop();


            if(vis.contains(curr))
                continue;

            vis.add(curr);

            if(curr==des)
                return true;

            for(int nbrs:map.get(curr).keySet())
                if(!vis.contains(nbrs))
                    st.push(nbrs);
        }
        return false;
    }



    public void bft()
    {
        HashSet<Integer> vis=new HashSet<>();
        Queue<Integer> q=new LinkedList<>();


        for(int src:map.keySet())
        {
            if(vis.contains(src))
                continue;

            q.add(src);

            while(!q.isEmpty())
            {
                int curr=q.poll();
                if(vis.contains(curr))
                    continue;

                vis.add(curr);

                System.out.print(curr+" ");

                for(int nbrs:map.get(curr).keySet())
                    if(!vis.contains(nbrs))
                        q.add(nbrs);
            }
        }

        System.out.println();
    }


    public void dft()
    {
        HashSet<Integer> vis=new HashSet<>();
        Stack<Integer> st=new Stack<>();

        for(int src:map.keySet())
        {
            if(vis.contains(src))
                continue;

            st.push(src);

            while(!st.isEmpty())
            {
                int curr=st.pop();
                if(vis.contains(curr))
                    continue;

                vis.add(curr);

                System.out.print(curr+" ");

                for(int nbrs:map.get(curr).keySet())
                    if(!vis.contains(nbrs))
                        st.push(nbrs);
            }
        }
        System.out.println("");
    }
}
