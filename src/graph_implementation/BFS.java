package graph_implementation;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS {

	LinkedList<Integer> list[];
	int vertex;
	
	BFS(int ver)
	{
		vertex = ver;
		list = new LinkedList[vertex];
		for(int i=0;i<vertex;i++)
		{
			list[i] = new LinkedList<Integer>();
		}
	}
	
	void addEdge(int src,int des)
	{
		list[src].add(des);
	}
	
	void printBFS(int ver)
	{
		boolean[] visited = new boolean[vertex];
		LinkedList<Integer> queue = new LinkedList<>();
		visited[ver] = true;
		queue.add(ver);
		while(queue.size()!=0)
		{
			ver = queue.poll();
			System.out.print(ver+"\t");
			
			Iterator<Integer> itr = list[ver].listIterator();
			while(itr.hasNext())
			{
				int a = itr.next();
				if(!visited[a])
				{
					visited[a] = true;
					queue.add(a);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		BFS bfs = new BFS(5);
		bfs.addEdge(0, 1);
		bfs.addEdge(0, 2);
		bfs.addEdge(0, 3);
		bfs.addEdge(1, 2);
		bfs.addEdge(2, 4);
		
		bfs.printBFS(1);
	}

}
