import java.io.*;
import java.util.*;

class Graph {
    private int V; // Number of vertices
    private LinkedList<Integer> adj[]; // Adjacency list

    // Constructor
    public Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList<>();
        }
    }

    // Method to add an edge
    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // Iterative DFS function
    public void DFS(int startVertex) {
        // Initialize a visited array
        boolean[] visited = new boolean[V];

        // Create a stack for DFS
        Stack<Integer> stack = new Stack<>();

        // Push the starting vertex onto the stack
        stack.push(startVertex);

        // Perform DFS
        while (!stack.isEmpty()) {
            // Pop a vertex from the stack
            int vertex = stack.pop();

            // If the vertex is not visited
            if (!visited[vertex]) {
                // Mark it as visited and print it
                visited[vertex] = true;
                System.out.print(vertex + " ");
            }

            // Get all adjacent vertices of the popped vertex
            // Push unvisited adjacent vertices onto the stack
            for (int neighbor : adj[vertex]) {
                if (!visited[neighbor]) {
                    stack.push(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(6);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 5);

        System.out.println("DFS (Iterative) starting from vertex 0:");
        g.DFS(0);
    }
}
