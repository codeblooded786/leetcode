import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

    private int v;
    private LinkedList<Integer> adj[];

    public Graph(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

//    private static void addEdge(ArrayList<ArrayList<Integer>> matrix, int u, int v) {
//        matrix.get(u).add(v);
//        matrix.get(v).add(u);
//    }

    private void addEdge(int u, int v) {
        adj[u].add(v);
    }

    private void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.println(v + " ");

        Iterator<Integer> i = adj[v].listIterator(v);

        while (i.hasNext()) {
            int n = i.next();

            if (!visited[n]) {
                DFSUtil(n, visited);
            }
        }
    }

    private void DFS(int v) {

        boolean visited[] = new boolean[v];
        DFSUtil(v, visited);
    }

    private void printGraph() {

        for (int i = 0; i < adj.length; i++) {
            for (int j = 0; j < adj[i].size(); j++) {
                System.out.print(adj[i].get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        int v = 5;
//
//        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>(v);
//
//        for (int i = 0; i < v; i++) {
//            matrix.add(new ArrayList<>());
//        }
//
//        addEdge(matrix, 0, 1);
//        addEdge(matrix, 0, 4);
//        addEdge(matrix, 1, 2);
//        addEdge(matrix, 1, 3);
//        addEdge(matrix, 1, 4);
//        addEdge(matrix, 2, 3);
//        addEdge(matrix, 3, 4);

        Graph graph = new Graph(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        //    graph.printGraph();
        graph.DFS(2);

    }
}
