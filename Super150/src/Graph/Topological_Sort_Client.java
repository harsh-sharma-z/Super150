package Graph;

import java.util.Arrays;

public class Topological_Sort_Client {
    public static void main(String[] args) {
        Topological_Sort ts = new Topological_Sort(7);
        ts.addEdge(1, 2,0);
        ts.addEdge(1, 4,0);
        ts.addEdge(4, 3,0);
        ts.addEdge(3, 2,0);
        ts.addEdge(4, 5,0);
        ts.addEdge(5, 7,0);
        ts.addEdge(6, 3,0);
        ts.addEdge(6, 7,0);

        System.out.println(Arrays.toString(ts.indegree())); //[0, 0, 2, 2, 1, 1, 0, 2]
        //ts.addedge(3, 1,0);
        ts.TopoSort();  //1 6 4 3 5 2 7

        System.out.println("\nIs there a cycle?:"+ts.isCycle());
    }
}
