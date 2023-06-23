import java.util.ArrayList;
import java.util.Stack;

public class GraphDepthSearch {
    int v;
    ArrayList <Integer> adj[];

    //creating the constructor
    GraphDepthSearch(int noOfVertices){
        v=noOfVertices;
        adj = new ArrayList[noOfVertices];
        for (int i=0;i<noOfVertices;i++){
            adj[i]= new ArrayList<>();
        }
    }

    //creating a method to add the edges to the graph
    void edge(int x,int y){
        adj[x].add(y);
    }

    //creating the depth first search method
    void depthfirstsearch(int source){
        boolean[] visited = new boolean[v];
        Stack<Integer> s1 = new Stack<>();

        s1.push(source);
        int node;
        while (!s1.empty()){ //keeps doing while the stack is not empty
            source = s1.peek();
            s1.pop();

            for(int i=0;i<adj[source].size();i++){
                node=adj[source].get(i);
                if(!visited[node]){
                    s1.push(node);
                }
            }
            if (visited[source]==false){
                System.out.print(source+" ");
                visited[source]=true;
            }
        }
    }

    public static void main(String[] args) {
        GraphDepthSearch g1 = new GraphDepthSearch(6);
        g1.edge(0,1);
        g1.edge(0,2);
        g1.edge(1,0);
        g1.edge(1,2);
        g1.edge(2,1);
        g1.edge(2,0);
        g1.edge(2,3);
        g1.edge(2,4);
        g1.edge(3,2);
        g1.edge(4,2);
        g1.edge(4,5);
        g1.edge(5,0);
        g1.edge(5,4);

        System.out.println("Result of DFS : ");
        g1.depthfirstsearch(0);
    }
}
