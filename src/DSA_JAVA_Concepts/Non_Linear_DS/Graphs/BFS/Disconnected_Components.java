package DSA_JAVA_Concepts.Non_Linear_DS.Graphs.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//This is the implementation of BFS to find the disconnected components in a graph using Adjacency List representation.
//The algorithm starts from a given vertex and visits all the unvisited neighbours of the vertex.
//If a neighbour is visited, it means that the vertex is part of a different connected component.
//The algorithm continues until all the vertices are visited.

public class Disconnected_Components {
    //Edge Function
    static class Edge{
        int src;
        int dest;

        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;

        }
    }
    //Graph Function
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        //Graph Structure--> int src, int dest
        //      0 --- 1 --- 2
        //         3 ---  4
        //            5 --- 6

        //Graph of 0th Index
        graph[0].add(new Edge(0, 1));
        //Graph of 1st Index
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        //Graph of 2nd Index
        graph[2].add(new Edge(2, 1));
        //Graph of 3rd Index
        graph[3].add(new Edge(3, 4));
        //Graph of 4th Index
        graph[4].add(new Edge(4, 3));
        //Graph of 5th Index
        graph[5].add(new Edge(5, 6));
        //Graph of 6th Index
        graph[6].add(new Edge(6, 5));
    }
    //BFS Function
    public static void bfs(ArrayList<Edge> graph[], int V, boolean visited[], int start){
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);

        while(!queue.isEmpty()){
            int curr = queue.remove();
            if(visited[curr] == false){
                System.out.print(curr+" ");
                visited[curr] = true;
                //Add all the unvisited neighbours to the queue
                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    queue.add(e.dest);
                }
            }
        }
    }
    //Main Function
    public static void main(String args[]) {
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        boolean visited[] = new boolean[V];
        for(int i=0; i<V; i++) {
            if (visited[i] == false) {
                bfs(graph, V, visited, i);
            }
        }

        System.out.println(" \n");
    }
}
