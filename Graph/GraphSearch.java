import java.util.ArrayList;
import java.util.Iterator;

public class GraphSearch{

    int v;
    //declaring an array of arraylist objects
    ArrayList <Integer> adjacency[];
    //constructor
    GraphSearch(int noOfVertices){
        v = noOfVertices;
        adjacency = new ArrayList[noOfVertices];

        for (int i=0;i<noOfVertices;i++){
            adjacency[i]=new ArrayList<>();
        }
    }

    void edge(int x,int y){
        adjacency[x].add(y);
    }

    void bfs(int source_vertex){
        boolean[] visited = new boolean[v];
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        visited[source_vertex]=true;
        a1.add(source_vertex);
        while(!a1.isEmpty()){
            source_vertex = a1.remove(0);
            System.out.print(source_vertex+" ");
            Iterator i = adjacency[source_vertex].iterator();
            while(i.hasNext()){
                int n = (int)i.next();
                if(!visited[n]){
                    visited[n]=true;
                    a1.add(n);
                }
            }
        }
    }
    public static void main(String[] args) {
        GraphSearch g1 = new GraphSearch(6);
        
        g1.edge(0, 1);
        g1.edge(0, 2);
        g1.edge(0, 5);
        g1.edge(1, 0);
        g1.edge(1, 2);
        g1.edge(2, 0);
        g1.edge(2, 1);
        g1.edge(2, 3);
        g1.edge(2, 4);
        g1.edge(3, 2); 
        g1.edge(4, 2);
        g1.edge(4, 5);
        g1.edge(5, 0);
        g1.edge(5, 4);

        g1.bfs(0);
    }
}