import java.util.*;

class GraphwithLinklist {
    int vertices; //vertices
    LinkedList<Integer> []adj; //list

    GraphwithLinklist(int v) {
        this.vertices = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList<>();
    }

    //edge
    void addEdge(int source, int destination) {
        adj[source].add(destination);
        adj[destination].add(source);
    }

    public static void main(String args[]) {
        GraphwithLinklist graph = new GraphwithLinklist(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(2, 4);
        graph.addEdge(1, 3);
        graph.addEdge(3, 4);


        for (int i = 0; i < graph.vertices; ++i) {
            System.out.print("Adjacency list of vertex " + i + ": ");
            for (int j = 0; j < graph.adj[i].size(); j++) {
                System.out.print(graph.adj[i].get(j) + " ");
            }
            System.out.println();
        }
    }
}
