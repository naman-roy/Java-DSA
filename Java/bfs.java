// You are using Java
import java.util.*;
class Main
{
    private int node;
    private LinkedList<Integer> adj[];
    private Queue<Integer> que;
    Main(int v)
    {
        node = v;
        adj = new LinkedList[node];
        for(int i=0;i<v;i++)
        {
            adj[i] = new LinkedList<>();
        }
        que = new LinkedList<Integer>();
    }
    void insertEdge(int v,int w)
    {
        adj[v].add(w);
    }
    void BFS(int r)
    {
        boolean nodes[] = new boolean[node];
        int a = 0;
        nodes[r] = true;
        que.add(r);
        while(que.size()!=0)
        {
            r=que.poll();
            System.out.println(r+" ");
            for(int i=0;i<adj[r].size();i++)
            {
                a=adj[r].get(i);
                if(!nodes[a])
                {
                    nodes[a]=true;
                    que.add(a);
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Main bfs = new Main(8);
        bfs.insertEdge(0,1);
        bfs.insertEdge(0,2);
        bfs.insertEdge(0,3);
        bfs.insertEdge(1,2);
        bfs.insertEdge(1,5);
        bfs.insertEdge(1,6);
        bfs.insertEdge(4,6);
        bfs.insertEdge(4,7);
        bfs.insertEdge(5,6);
        bfs.insertEdge(5,7);
        bfs.BFS(0);
          bfs.insertEdge(0,3);
    }
}