public class GraphAdjacencyMatrix {
    // Function to add an edge from vertex u to vertex v in the adjacency matrix
    public static void addEdge(int[][] adjMatrix, int u, int v) {
        adjMatrix[u][v] = 1; // Assuming the graph is unweighted and undirected
    }

    // Function to print the adjacency matrix
    public static void printMatrix(int[][] matrix) {
        int numVertices = matrix.length;
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Number of vertices in the graph
        int vertices = 4; // vertices are 0, 1, 2, 3

        // Create adjacency matrix
        int[][] adjMatrix = new int[vertices][vertices];

        // Add edges to the graph
        addEdge(adjMatrix, 0, 2); // Vertex 0 -> Vertex 2
        addEdge(adjMatrix, 2, 3); // Vertex 2 -> Vertex 3
        addEdge(adjMatrix, 2, 1); // Vertex 2 -> Vertex 1
        addEdge(adjMatrix, 3, 1); // Vertex 3 -> Vertex 1
        addEdge(adjMatrix, 3, 2); // Vertex 3 -> Vertex 2

        // Print the adjacency matrix
        System.out.println("Adjacency Matrix:");
        printMatrix(adjMatrix);
    }
}
