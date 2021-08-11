package graph_implementation;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS {

	LinkedList<Integer> list[];
	boolean[] visited;
	
	DFS(int ver)
	{
		list = new LinkedList[ver];
		visited = new boolean[ver];
		
		for(int i=0;i<ver;i++)
		{
			list[i] = new LinkedList<Integer>();
		}
	}
	
	void addEdge(int src,int des)
	{
		list[src].add(des);
	}
	
	void printDFS(int ver)
	{
		visited[ver] = true;
		System.out.println(ver+"\t");
		Iterator<Integer> itr = list[ver].listIterator();
		while(itr.hasNext())
		{
			int a = itr.next();
			if(!visited[a])
			{
				printDFS(a);
			}
		}
	}
	
	public static void main(String[] args) {
		DFS dfs = new DFS(4);
		dfs.addEdge(0, 1);
		dfs.addEdge(0, 2);
		dfs.addEdge(0, 3);
		dfs.addEdge(1, 2);
		
		dfs.printDFS(0);
	}
}
