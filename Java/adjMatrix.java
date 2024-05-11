// You are using Java
 
public class adjMatrix
{
    private int[][] adjMat;
    private int numOfVer;
    public adjMatrix(int numOfVer)
    {
        this.numOfVer=numOfVer;
        adjMat = new int[numOfVer][numOfVer];
    }
    public void addEdge(int src,int des)
    {
        adjMat[src][des]=1;
        adjMat[des][src]=1;
    }
    public void removeEdge(int src,int des)
    {
        adjMat[src][des]=0;
        adjMat[des][src]=0;
    }
    public void printMat()
    {
        for(int i=0;i<numOfVer;i++)
        {
            for(int j=0;j<numOfVer;j++)
            {
                System.out.print(adjMat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int num=5;
        adjMatrix m = new adjMatrix(num);
        m.addEdge(0,1);
        m.addEdge(0,4);
        m.addEdge(1,2);
        m.addEdge(1,3);
        m.addEdge(1,4);
        m.addEdge(2,3);
        m.addEdge(3,4);
        m.printMat();
        m.removeEdge(1,4);
        System.out.println("After removing...");
        m.printMat();
    }
}