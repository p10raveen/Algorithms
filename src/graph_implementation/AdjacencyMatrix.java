package graph_implementation;

public class AdjacencyMatrix {

	boolean adjMatrix[][];
	int numVertex;
	
	AdjacencyMatrix(int vertex)
	{
		numVertex=vertex;
		adjMatrix = new boolean[numVertex][numVertex];
	}
	
	void addEdge(int i,int j)
	{
		adjMatrix[i][j] = true;
		adjMatrix[j][i] = true;
	}
	
	void printMatrix()
	{
		String s = "";
		for(int i=0;i<numVertex;i++)
		{
			s = s+i+":";
			for(boolean j:adjMatrix[i])
			{
				int k = j?1:0;
				s = s + k+" ";
			}
			System.out.println(s);
			s="";
		}
	}
	public static void main(String[] args) {
		AdjacencyMatrix am = new AdjacencyMatrix(4);
		am.addEdge(0, 1);
		am.addEdge(0, 2);
		am.addEdge(0, 3);
		am.addEdge(1, 2);
		am.printMatrix();
		
	}

}





