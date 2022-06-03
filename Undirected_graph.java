import java.util.*;

public class Undirected_graph
{
    
    private static void addEdge(ArrayList<ArrayList<Integer>> arr, int v1, int v2){
        arr.get(v1).add(v2);
        arr.get(v2).add(v1);
    }
    private static void displayGraph(ArrayList<ArrayList<Integer>> arr){
        int v = 0;
        for(ArrayList<Integer> a: arr){
            System.out.println("For the vertex -> " + v++);
            for(int connectedEdges: a){
                System.out.print(connectedEdges + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
    
        int V = 5;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>(V);
        
        for (int i=0; i<V; i++)
            arr.add(new ArrayList<Integer>());
        
        addEdge(arr, 0, 1);
        addEdge(arr, 0, 2);
        addEdge(arr, 0, 3);
        addEdge(arr, 1, 2);
        
        displayGraph(arr);
    }

}
