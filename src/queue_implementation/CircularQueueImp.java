package queue_implementation;

public class CircularQueueImp {

	int[] queue;
	int front;
	int rear;
	int capacity;
	
	CircularQueueImp(int size)
	{
		queue = new int[size];
		front = -1;
		rear = -1;
		capacity = size;
	}
	
	//Check if the queue is full
	boolean isFull()
	{
		if(front==0 && rear== capacity-1)
			return true;
		if(front == rear+1)
			return true;
		return false;
	}
	
	// enqueue operation: Adding an element
	void enQueue(int value)
	{
		if(isFull())
		{
			System.out.println("Queue is Full");
		}
		else
		{
			if(front==-1)
			{
				front = 0;
			}
			rear = (rear+1)%capacity;
			queue[rear] = value;
			System.out.println("Inserted: "+value);
		}
	}
	
	// print circular queue
	void printQueue()
	{
		int i;
		for(i=front; i!=rear;i = (i+1)%capacity)
		{
			System.out.print(queue[i]+"\t");
		}
		System.out.print(queue[i]+"\t");
	}
	
	// Check if the queue is empty
	boolean isEmpty()
	{
		return front==-1;
	}
	
	// dequeue: removing an element
	int deQueue()
	{
		int value=0;
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			value = queue[front]; // value=1
			if(front==rear)
			{
				front=-1;
				rear=-1;
			}
			else
			{
				front = (front+1)%capacity; // front=1
			}
		}
		return value;
	}
	
	public static void main(String[] args) {
		
		CircularQueueImp cq = new CircularQueueImp(5);
		cq.enQueue(1);
		cq.enQueue(2);
		cq.enQueue(3);
		cq.enQueue(4);
		cq.enQueue(5);
		cq.printQueue();
		System.out.println();
		cq.deQueue();
		cq.printQueue();
		
	}

}
