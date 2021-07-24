package linkedlist_implementation;

public class SingleLL {
	Node head;
	
	void insertFirst(int data)
	{
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}
	
	void insertLast(int data)
	{
		if(head==null)
		{
			insertFirst(data);
		}
		else
		{
			Node current = head;
			while(current.next != null)
			{
				current = current.next; // last node
			}
			Node newNode = new Node();
			newNode.data = data;
			current.next = newNode;
		}
		
	}
	
	void deleteFirst()
	{
		head = head.next;
	}
	
	void deleteLast()
	{
		Node temp = head;
		Node t = head;
		while(temp.next!=null)
		{
			t=temp;
			temp=temp.next;
		}
		t.next = null;
	}
	 void printList()
	 {
		 Node current = head;
		 while(current !=null)
		 {
			 current.displayNode();
			 current = current.next;
		 }
	 }
	
	public static void main(String[] args) {
		SingleLL ll = new SingleLL();
		ll.insertFirst(1);
		ll.insertFirst(3);
		ll.insertFirst(5);
		ll.insertFirst(7);
		ll.printList();
		System.out.println();
		ll.deleteLast();
		ll.printList();
		
	}

}
