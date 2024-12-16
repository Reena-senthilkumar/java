import java.util.ArrayList;
import  java.util.List;
import java.util.Stack;
public class Graph
{
    int nodes;
    List<List<Integer>> adjList = new ArrayList<>();
    public Graph(int n){
        nodes=n;
        adjList=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }
    }
    public void addEdge(int i,int j){
        adjList.get(i).add(i);
    }
    private void topologicalsortusing(int i,boolean [] visited,Stack<Integer> stack)
    {
    visited[i]=true;
        for(Integer neighbor:adjList.get(i)){
            if(visited[neighbor])
            {
        topologicalsortusing(neighbor, visited,stack);
            }
        }stack.push(i);
    }
public void topologicalsort()
{
Stack<Integer>stack=new Stack<>();
boolean[] visited=new boolean[nodes];
for(int i=0;i<nodes;i++){
    if(!visited[i]){
    topologicalsortusing(i, visited, stack);
}
}
}
    public static void main(String[] args) 
    {
        Graph graph=new Graph(11);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,5);
        graph.addEdge(3,4);
        graph.addEdge(3,2);
        graph.addEdge(3,8);
        graph.addEdge(4,5);
        graph.addEdge(6,7);
        graph.addEdge(7,8);
        graph.addEdge(8,10);
        graph.addEdge(9,10);
        graph.addEdge(10,5);
        System.out.println(graph.adjList);
        graph.topologicalsort();
    }
}
