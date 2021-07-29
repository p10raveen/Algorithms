package tree_implementation;

public class TreeImp {
	Node root;
	TreeImp()
	
	{
		root=null;
	}
	
	void inOrder(Node node)
	{
		if(node == null)
		{
			return;
		}
		inOrder(node.left);   // left
		System.out.print(node.data+"\t"); // root
		inOrder(node.right); // right
	}
	
	void preOrder(Node node)
	{
		if(node == null)
		{
			return;
		}
		System.out.print(node.data+"\t"); // root
		preOrder(node.left);   // left
		preOrder(node.right); // right
	}
	
	void postOrder(Node node)
	{
		if(node == null)
		{
			return;
		}
		
		postOrder(node.left);   // left
		postOrder(node.right); // right
		System.out.print(node.data+"\t"); // root
	}
	public static void main(String[] args) {
		TreeImp ti = new TreeImp();
		ti.root = new Node(1);
		ti.root.left = new Node(12);
		ti.root.right = new Node(2);
		ti.root.left.left = new Node(5);
		ti.root.left.right = new Node(6);
		ti.inOrder(ti.root);
		System.out.println();
		ti.preOrder(ti.root);
		System.out.println();
		ti.postOrder(ti.root);

	}

}
