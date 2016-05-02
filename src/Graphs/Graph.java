package Graphs;

/**
 * Created by 61310444 on 5/2/2016.
 */
public class Graph {
// Space Utilization O(v2)

    private boolean adjMatrix[][];
    private int vertexCount;



    public Graph(int vertexCount){
        this.vertexCount=vertexCount;
        adjMatrix =new boolean[vertexCount][vertexCount];
    }

    //add new edge

    public void addEdge(int i,int j)
    {
        if (i>=0 && i<vertexCount && j>0 && j<vertexCount)
        {
            adjMatrix[i][j]=true;
            adjMatrix[j][i]=true;
        }


    }



    public void removeEdge(int i,int j)
    {
        if (i>=0 && i<vertexCount && j>0 && j> vertexCount)
        {
            adjMatrix[i][j]=false;
            adjMatrix[i][j]= false;
        }


    }

    public boolean isEdge(int i,int j)
    {
        if (i>=0 && i<vertexCount && j>0 && j> vertexCount )

            return adjMatrix[i][j];
        else
            return false;


    }


}

