package tree_implementation;

public class AVL {

	Node1 root;
	int height(Node1 N)
	{
		if(N==null)
			return 0;
		else
			return N.height;
	}
	
	int getBalanceFactor(Node1 n)
	{
		if(n==null)
			return 0;
		else
			return height(n.left)-height(n.right);
	}
	int max(int a,int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
	
	Node1 leftRotate(Node1 a)
	{
		Node1 b = a.right;
		Node1 c = b.left;
		b.left = a;
		a.right = c;
		a.height = max(height(a.left),height(a.right))+1;
		b.height = max(height(b.left),height(b.right))+1;
		
		return b;
	}
	
	Node1 rightRotate(Node1 b)
	{
		Node1 a = b.left;
		Node1 c = a.right;
		a.right = b;
		b.left = c;
		b.height= max(height(b.left),height(b.right))+1;
		a.height= max(height(a.left),height(a.right))+1;
		return a;
	}
	
	
	Node1 insertNode(Node1 node, int value)
	{
		if(node==null)
			return new Node1(value);
		if(value<node.data)
			node.left = insertNode(node.left,value);
		else if(value>node.data)
			node.right = insertNode(node.right,value);
		else
			return node;
		
		node.height = max(height(node.left),height(node.right))+1;
		int balancefactor = getBalanceFactor(node);
		if(balancefactor>1)
		{
			// RR
			if(value<node.left.data)
				return rightRotate(node);
			// RL
			else if(value>node.left.data)
				node.left = leftRotate(node.left);
				return rightRotate(node);
		}
		if(balancefactor<-1)
		{
			//LL
			if(value>node.right.data)
				return leftRotate(node);
			// LR = RR + LL
			else if(value<node.right.data)
				node.right = rightRotate(node.right);
				return leftRotate(node);
		}
		return node;
	}
	
	void inOrder(Node1 node)
	{
		if(node != null)
		{
			inOrder(node.left);
			System.out.println((node.data)+"\t");
			inOrder(node.right);
		}
	}
	
	
	public static void main(String[] args) {
		AVL a = new AVL();
		// H	I	J	B	A	E	C	F	D	G	K	L 
		//---------------------------
		// 8	9	10	2	1	5	3	6	4	7	11	12
		a.root = a.insertNode(a.root,8);
		a.root = a.insertNode(a.root,9);
		a.root = a.insertNode(a.root,10);
		a.root = a.insertNode(a.root,2);
		a.root = a.insertNode(a.root,1);
		a.root = a.insertNode(a.root,5);
		a.root = a.insertNode(a.root,3);
		a.root = a.insertNode(a.root,6);
		a.root = a.insertNode(a.root,4);
		a.root = a.insertNode(a.root,7);
		a.root = a.insertNode(a.root,11);
		a.root = a.insertNode(a.root,12);
		
		a.inOrder(a.root);
	
	}

}
