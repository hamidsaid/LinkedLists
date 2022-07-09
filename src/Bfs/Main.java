package Bfs;

public class Main {

    // Driver method to
    public static void main(String args[])
    {
        Graph graph = new Graph(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(0, 4);
        graph.addEdge(4, 5);
        graph.addEdge(3, 5);
        graph.addEdge(1, 2);
        //graph.addEdge(1, 0);
       // graph.addEdge(2, 1);
       // graph.addEdge(4, 1);
        //graph.addEdge(3, 1);
        graph.addEdge(5, 4);
        graph.addEdge(5, 3);

        System.out.println("The Breadth First Traversal of the graph is as follows :");

        graph.BFS(0);
    }
}
