package tree_implementation;

public class FullBT {

	Node root;
	
	boolean isFullBT(Node node)
	{
		boolean status = false;
		
		if(node==null)
		{
			status = true;
		}
		
		if(node.left==null && node.right==null)
		{
			status = true;
		}
		
		if((node.left !=null) && (node.right!=null))
		{
			if(isFullBT(node.left) && isFullBT(node.right))
			{
				status = true;
			}
		}
		return status;
	}
	
	
	public static void main(String[] args) {
		FullBT fbt = new FullBT();
		fbt.root = new Node(1);
		fbt.root.left = new Node(2);
		fbt.root.right = new Node(3);
		fbt.root.left.left = new Node(4);
		fbt.root.left.right = new Node(5);
		fbt.root.right.left = new Node(6);
		fbt.root.right.right = new Node(7);
		
		System.out.println(fbt.isFullBT(fbt.root));
	}

}
