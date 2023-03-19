package Graph;
import java.util.*;
public class Graph_Client {

    public static void main(String[] args) {
        Graph g=new Graph(7);
        g.addEdge(1,4,6);
        g.addEdge(1,2,10);
        g.addEdge(2,3,7);
        g.addEdge(3,4,5);
        g.addEdge(4,5,1);
        g.addEdge(5,6,4);
        g.addEdge(7,5,2);
        g.addEdge(6,7,3);
       // g.display();

//        1 {2=10, 4=6}
//        2 {1=10, 3=7}
//        3 {2=7, 4=5}
//        4 {1=6, 3=5, 5=1}
//        5 {4=1, 6=4, 7=2}
//        6 {5=4, 7=3}
//        7 {5=2, 6=3}
       // System.out.println(g.hasPath(1,6,new HashSet<Integer>())); //true

      //  g.printAllPath(1,6,new HashSet<Integer>(),"");

//        123456
//        1234576
//        1456
//        14576


        System.out.println(g.bfs(1,6)); //true

        System.out.println(g.dfs(1,6)); //true

        g.bft(); //1 2 4 3 5 6 7

        g.dft(); //1 4 5 7 6 3 2
    }
}
