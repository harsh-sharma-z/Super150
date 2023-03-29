import java.util.*;
import java.io.*;

class Main {

     static class Pair{

        int distance;
        int node;

        public Pair(int distance, int node){
            this.distance=distance;
            this.node=node;
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

            for(int i=0;i<n;i++)
            {
                adj.add(new ArrayList<>());
            }

            int edge=sc.nextInt();
            while(edge-->0)
            {
                int u=sc.nextInt();
                int v=sc.nextInt();
                u--;
                v--;
                adj.get(u).add(v);
            }

            int src=sc.nextInt();
            src--;

            int dist[]=new int[n];
            Arrays.fill(dist,1000000007);


            dijkstra(n,adj,src,dist);

            for(int i=0;i<n;i++)
            {
                if(i==src)
                    continue;
                if(dist[i]==1000000007)
                    System.out.print("-1 ");
                else
                    System.out.print(dist[i]+" ");
            }
            System.out.println("");
        }
    }

    public static void dijkstra(int V, ArrayList<ArrayList<Integer>> adj, int S, int[] dist)
    {
        // Write your code here
        PriorityQueue<Pair> uwu=new PriorityQueue<Pair>((x,y) -> x.distance - y.distance);

//        int[] dist=new int[V];
//        Arrays.fill(dist,1000000007);

        dist[S]=0;

        uwu.add(new Pair(0,S));


        while(!uwu.isEmpty())
        {
            int dis=uwu.peek().distance;
            int node=uwu.peek().node;

            uwu.poll();

            for(int i:adj.get(node))
            {
                int edgew=6;
                int adjNode=i;

                if(dis+edgew< dist[adjNode])
                {
                    dist[adjNode]=dis+edgew;
                    uwu.add(new Pair(dist[adjNode],adjNode));
                }
            }
        }

       return;
    }

}
