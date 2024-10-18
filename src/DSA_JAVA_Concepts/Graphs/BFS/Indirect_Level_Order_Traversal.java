package DSA_JAVA_Concepts.Graphs.BFS;

import java.util.*;

//Algorithm to traverse the graph indirectly using level order traversal
//Algorithm:
//1. Create a graph using an adjacency list.
//2. Create a queue and add the source node to it.
//3. While the queue is not empty, dequeue a node and print it.
//4. Mark the node as visited.
//5. Add all the unvisited neighbours of the dequeued node to the queue.
//6. Repeat steps 3-5 until the queue is empty.
//7. Repeat steps 2-6 for all the nodes in the graph.
//8. Print the visited nodes in the order they were visited.

public class Indirect_Level_Order_Traversal {
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
        //       1 --- 3
        //      /      | \
        //    0        | 5 --- 6
        //     \       | /
        //      2 ---  4

        //Graph of 0th Index
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        //Graph of 1st Index
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));
        //Graph of 2nd Index
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));
        //Graph of 3rd Index
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));
        //Graph of 4th Index
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));
        //Graph of 5th Index
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));
        //Graph of 6th Index
        graph[6].add(new Edge(6, 5));
    }
    //BFS Function
    public static void bfs(ArrayList<Edge> graph[], int V){
        Queue<Integer> queue = new LinkedList<>();
        boolean visited[] = new boolean[V];
        queue.add(0);

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
        bfs(graph, V);
        System.out.println(" \n");
    }
}
