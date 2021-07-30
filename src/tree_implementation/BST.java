package tree_implementation;

public class BST {

	Node root = null;
	
	void insert(int value)
	{
		root = insertValue(root,value); // 8,3
	}
	
	Node insertValue(Node root, int value) // 8,3
	{
		if(root==null)
		{
			root = new Node(value);
		}
		else if(value<root.data)
		{
			root.left = insertValue(root.left,value);
		}
		else
		{
			root.right = insertValue(root.right,value);
		}
		return root;
	}
	
	void printTree()
	{
		printInorder(root);
	}
	
	void printInorder(Node root) {
		if (root == null) {
			return;
		}
		printInorder(root.left); // left
		System.out.print(root.data + "\t"); // root
		printInorder(root.right); // right

	}
	
	void delete(int value)
	{
		root = deleteNode(root,value);
	}
	
	Node deleteNode(Node root, int value)
	{
		if(root==null)
		{
			return root;
		}
		
		if(value<root.data)
		{
			root.left = deleteNode(root.left,value);
		}
		else if(value>root.data)
		{
			root.right = deleteNode(root.right,value);
		}
		else
		{
			if(root.left==null)
			{
				return root.right;
			}
			else
			{
				return root.left;
			}
		}
		return root;
	}
	
	public static void main(String[] args) {
		BST b = new BST();
		// 8,3,10,1,6,4
		b.insert(8);
		b.insert(3);
		b.insert(10);
		b.insert(1);
		b.insert(6);
		b.insert(4);
		b.printTree(); // 1 3 4 6 8 10
		b.delete(6);
		System.out.println();
		b.printTree();
	}

}
