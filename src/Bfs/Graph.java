package Bfs;
// Java program to print BFS traversal from a given source vertex.
// BFS(int s) traverses vertices reachable from s.
import java.util.*;

// This class represents a directed graph using adjacency list
// representation
class Graph
{
    private int V;                              //number of nodes in the graph
    private LinkedList<Integer> adj[];              //adjacency list
    private Queue<Integer> queue;                   //maintaining a queue

    Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; i++)
        {
            adj[i] = new LinkedList<>();
        }
        queue = new LinkedList<Integer>();
    }


    void addEdge(int v,int w)
    {
        adj[v].add(w);                          //adding an edge to the adjacency list (edges are bidirectional in this example)
    }

    void BFS(int n)
    {

        boolean nodes[] = new boolean[V];       //initialize boolean array for holding the data
        int a = 0;

        nodes[n]=true;
        queue.add(n);                   //root node is added to the top of the queue

        while (queue.size() != 0)
        {
            n = queue.poll();             //remove the top element of the queue
            System.out.print(n+" ");           //print the top element of the queue

            for (int i = 0; i < adj[n].size(); i++)  //iterate through the linked list and push all neighbors into queue
            {
                a = adj[n].get(i);
                if (!nodes[a])                    //only insert nodes into queue if they have not been explored already
                {
                    nodes[a] = true;
                    queue.add(a);
                }
            }
        }
    }


}

