package linkedlist_implementation;

public class MidElement {
	Node3 head;
	void insertLast(Node3 data)
	{
		if(head==null)
		{
			head = data;
		}
		else
		{
			Node3 current = head;
			while(current.next != null)
			{
				current = current.next; // last node
			}
			current.next = data;
		}
	}
	// 1	3	5	7	9
	Node3 midElement(Node3 head)
	{
		Node3 a = head;
		Node3 b = head;
		
		while(a !=null)
		{
			a = a.next;
			if(a !=null && a.next !=null)
			{
				b = b.next;
				a = a.next;
			}
		}
		return b;
	}
	void printList()
	{
		Node3 current = head;
		while(current != null)
		{
			System.out.print(current.data+"\t");
			current = current.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		MidElement me = new MidElement();
		me.insertLast(new Node3(1));
		me.insertLast(new Node3(3));
		me.insertLast(new Node3(5));
		me.insertLast(new Node3(7));
		me.insertLast(new Node3(9));
		me.printList();
		
		Node3 mid = me.midElement(me.head);
		System.out.println(mid.data);
	}

}
