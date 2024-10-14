package Graphs.Adjacency_List.Un_Directed_Weight_UnWeight_Graph;

import java.util.ArrayList;

//UD_W_Graph --> Un-Directed & Weight Graph
public class UD_W_Graph {
    //Edge Function
    static class Edge{
        int src;
        int dest;
        int Wgt;

        public Edge(int src, int dest, int wgt){
            this.src = src;
            this.dest = dest;
            this.Wgt = wgt;

        }
    }
    //Graph Function
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        //Graph Structure--> int src, int dest, int wgt
            //       0     3
            //       2\-1/  \0
            //         2 -10- 1

        //Graph of 0th Index
        graph[0].add(new Edge(0, 2, 2));
        //Graph of 1st Index
        graph[1].add(new Edge(1, 2, 10));
        graph[1].add(new Edge(1, 3, 0));
        //Graph of 2nd Index
        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 1, 10));
        graph[2].add(new Edge(2, 3, -1));
        //Graph of 3rd Index
        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 2, -1));
    }
    //Main Function
    public static void main(String[] args) {
        int Vertex = 4;

        ArrayList<Edge> graph[] = new ArrayList[Vertex];
        createGraph(graph);

        for (int i = 0; i < graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.println(STR."\{e.src} --> \{e.dest} --> \{e.Wgt}");
        }
    }
}
