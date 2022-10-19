package Practical;
public class PrimsAlgo{
    private static final int nVertices = 6;
    int minKey(int key[], Boolean MinSpanTreeSet[])
    {
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < nVertices; v++)
            if (MinSpanTreeSet[v] == false && key[v] < min) {
                min = key[v];
                min_index = v;
            }

        return min_index;
    }

    void print(int master[], int graph[][])
    {
        System.out.println("Edge \tWeight");
        for (int i = 1; i < nVertices; i++)
            System.out.println(master[i] + " - " + i + "\t" + graph[i][master[i]]);
    }

    void Prims(int graph[][])
    {

        int master[] = new int[nVertices];


        int key[] = new int[nVertices];


        Boolean MinSpanTreeSet[] = new Boolean[nVertices];

                for (int i = 0; i < nVertices; i++) {
            key[i] = Integer.MAX_VALUE;
            MinSpanTreeSet[i] = false;
        }


        key[0] = 0;
        master[0] = -1;

        for (int count = 0; count < nVertices - 1; count++) {
                    int u = minKey(key, MinSpanTreeSet);


            MinSpanTreeSet[u] = true;


            for (int v = 0; v < nVertices; v++)


                if (graph[u][v] != 0 && MinSpanTreeSet[v] == false && graph[u][v] < key[v]) {
                    master[v] = u;
                    key[v] = graph[u][v];
                }
        }


        print(master, graph);
    }

    public static void main(String[] args)
    {
        PrimsAlgo t = new PrimsAlgo();
        int graph[][] = new int[][] { { 0, 4, 0, 8, 0, 1 },
                { 10, 4, 2, 3, 8, 9},
                { 0, 6, 0, 0, 1, 3 },
                { 4, 10, 0, 0, 1, 3},
                { 4, 10, 20, 30, 13 ,17},
                { 0, 7, 9, 13, 0, 2 } };

        t.Prims(graph);
    }
}




