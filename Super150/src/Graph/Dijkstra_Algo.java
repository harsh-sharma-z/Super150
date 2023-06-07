package Graph;

import java.util.*;

public class Dijkstra_Algo {
    private static  HashMap<Integer, HashMap<Integer,Integer>> map=new HashMap<>();
    public Dijkstra_Algo(int v)
    {
        for(int i=1;i<=v;i++)
        {
            map.put(i,new HashMap<>());
        }
    }

    public static void addEdge(int v1,int v2,int cost)
    {
        map.get(v1).put(v2,cost); //v1-->v2
        map.get(v2).put(v1,cost); //v2-->v1
    }

    private static class DijsktraPair {
        int vtx;
        String acq_path;
        int cost;

        public DijsktraPair(int vtx, String acq_path , int cost)
        {
            this.vtx=vtx;
            this.acq_path=acq_path;
            this.cost=cost;
        }

        @Override
        public String toString()
        {
            return this.vtx+" val:"+this.acq_path+" @ "+this.cost;
        }

        public static void cost()
        {
            PriorityQueue<DijsktraPair> pq=new PriorityQueue<>(
                    new Comparator<DijsktraPair>() {
                        @Override
                        public int compare(DijsktraPair o1, DijsktraPair o2) {
                            return o1.cost-o2.cost;
                        }
                    });


                    Set<Integer> vis=new HashSet<>();
                    pq.add(new DijsktraPair(1,"1",0));
                    while(!pq.isEmpty())
                    {
                        DijsktraPair rp=pq.remove();

                        if(vis.contains(rp.vtx))
                            continue;

                        vis.add(rp.vtx);

                        System.out.println(rp);

                        for(int nbrs: map.get(rp.vtx).keySet())
                            if(!vis.contains(nbrs))
                            {
                                int cost= rp.cost+ map.get(rp.vtx).get(nbrs);
                                pq.add(new DijsktraPair(nbrs,rp.acq_path + nbrs, cost));
                            }
                    }

        }

        public static void main(String[] args) {
            Dijkstra_Algo g=new Dijkstra_Algo(7);
            g.addEdge(1,4,6);
            g.addEdge(1,2,10);
            g.addEdge(2,3,7);
            g.addEdge(3,4,5);
            g.addEdge(4,5,1);
            g.addEdge(5,6,4);
            g.addEdge(7,5,2);
            g.addEdge(6,7,3);

            cost();
        }
    }
}













