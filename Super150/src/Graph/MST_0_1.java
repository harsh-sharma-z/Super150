package Graph;
import java.util.*;
public class MST_0_1 {
    private static HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();

    public MST_0_1(int v)
    {
        for(int i=1;i<=v;i++)
            map.put(i,new ArrayList<>());
    }

    public void addEdge(int v1, int v2)
    {
        map.get(v1).add(v2);
        map.get(v2).add(v1);
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

    private void PrimsAlgo(int n) {
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
            for(int nbrs=1;nbrs<=n;nbrs++)
            {
                if(!vis.contains(nbrs))
                {
                    int c=0;
                    if(map.get(rp.vtx).contains(nbrs))
                        c=1;
                    PrimPair np= new PrimPair(nbrs,rp.vtx,c);
                    pq.add(np);
                }
            }

        }

        System.out.println(cst);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        MST_0_1 graph= new MST_0_1(n);

        for(int i=0;i<m;i++)
        {
            int u=sc.nextInt();
            int v=sc.nextInt();
            graph.addEdge(u,v);
        }

        graph.PrimsAlgo(n);
    }
}
