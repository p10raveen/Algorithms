package linkedlist_implementation;

public class DoublyLL {

	Node1 head;
	Node1 tail;
	
	void insertFirst(int data)
	{
		Node1 newNode1 = new Node1();
		newNode1.data = data;
		newNode1.next = head;
		newNode1.prev = null;
		
		if(head != null)
		{
			head.prev = newNode1;
		}
		head = newNode1;
		
		if(tail == null)
		{
			tail = newNode1;
		}
	}
	
	void insertLast(int data)
	{
		Node1 newNode1 = new Node1();
		newNode1.data = data;
		newNode1.next = null;
		newNode1.prev = tail;
		
		if(tail != null)
		{
			tail.next = newNode1;
		}
		tail = newNode1;
		
		if(head == null)
		{
			head = newNode1;
		}
	}
	
	void displayList()
	{
		Node1 current = head;
		while(current !=null)
		{
			current.displayNode();
			current = current.next;
		}
	}
	
	
	public static void main(String[] args) {
		DoublyLL ll = new DoublyLL();
		ll.insertLast(1);
		ll.insertLast(3);
		ll.insertLast(4);
		ll.insertLast(7);
		ll.displayList();

	}

}
