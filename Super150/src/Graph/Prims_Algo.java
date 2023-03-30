package Graph;

import OOPs.Inheritance.P;

import java.util.*;

public class Prims_Algo {
    private static HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

    public Prims_Algo(int v) {
        for (int i = 1; i <= v; i++)
            map.put(i, new HashMap<>());
    }

    public void addEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public class PrimPair {
        int vtx;
        int acqvtx;
        int cost;

        public PrimPair(int vtx, int acqvtx, int cost) {
            this.vtx = vtx;
            this.acqvtx = acqvtx;
            this.cost = cost;
        }

        public String toString(){
            return this.vtx+" "+this.acqvtx+" "+" @ "+this.cost;
        }
    }

    private void PrimsAlgo() {
        PriorityQueue<PrimPair> pq = new PriorityQueue<>(new Comparator<PrimPair>() {
            @Override
            public int compare(PrimPair o1, PrimPair o2) {
                return o1.cost - o2.cost;
            }
        });
        pq.add(new PrimPair(1,1,0));

        HashSet<Integer> vis=new HashSet<>();
        int cst = 0;
        while(!pq.isEmpty())
        {
            PrimPair rp= pq.poll();
            if(vis.contains(rp.vtx))
                continue;

            vis.add(rp.vtx);
//            System.out.println(rp);
            cst += rp.cost;
            for(int nbrs: map.get(rp.vtx).keySet())
            {
                if(!vis.contains(nbrs))
                {
                    PrimPair np= new PrimPair(nbrs,rp.vtx,map.get(rp.vtx).get(nbrs));
                    pq.add(np);
                }
            }

        }

        System.out.println(cst);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        Prims_Algo p= new Prims_Algo(n);

        int m=sc.nextInt();

        for(int i=1;i<=m;i++)
        {
            int v1=sc.nextInt();
            int v2=sc.nextInt();
            int cost=sc.nextInt();
            p.addEdge(v1,v2,cost);
        }

        p.PrimsAlgo();
    }
}