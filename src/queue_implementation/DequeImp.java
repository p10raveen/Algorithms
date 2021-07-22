package queue_implementation;

public class DequeImp {

	int[] queue;
	int front;
	int rear;
	int capacity;
	
	DequeImp(int size)
	{
		queue = new int[size];
		front=-1;
		rear=0;
		capacity = size;
	}
	// Check if the queue is Full
	boolean isFull()
	{
		if((front==0 && rear == capacity-1) || front == rear+1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// Check if the queue is Empty
	boolean isEmpty()
	{
		return front==-1;
	}
	
	// Insert element from Front
	void insertFront(int value)
	{
		if(isFull())
		{
			System.out.println("Queue is Full");
		}
		else
		{
			if(front==-1)
			{
				front=0;
				rear=0;
			}
			else if(front==0)
			{
				front = capacity-1;
			}
			else
			{
				front = front-1;
			}
			queue[front] = value;
		}
	}
	
	void insertRear(int value)
	{
		if(isFull())
		{
			System.out.println("Queue is Full");
		}
		else
		{
			if(front==-1)
			{
				front=0;
				rear=0;
			}
			else if(rear == capacity-1)
			{
				rear=0;
			}
			else
			{
				rear = rear+1;
			}
			queue[rear] = value;
		}
	}
	
	int getFront()
	{
		return queue[front];
	}
	
	int getRear()
	{
		return queue[rear];
	}
	
	void deleteFront()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			if(front==rear)
			{
				front=-1;
				rear=-1;
			}
			else if(front == capacity-1)
			{
				front=0;
			}
			else
			{
				front= front+1;
			}
		}
	}
	
	void deleteRear()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			if(front==rear)
			{
				front=-1;
				rear=-1;
			}
			else if(rear == 0)
			{
				rear = capacity-1;
			}
			else
			{
				rear= rear-1;
			}
		}
	}
	
	
	public static void main(String[] args) {
		DequeImp dq = new DequeImp(5);
		/*dq.insertRear(1);
		dq.insertRear(2);
		dq.insertRear(3);
		dq.insertRear(4);
		*/
		dq.insertFront(1);
		dq.insertFront(2);
		dq.insertFront(3);
		dq.insertFront(4);
		
		System.out.println("Front: "+ dq.getFront());
		System.out.println("Rear: "+ dq.getRear());
		
		dq.deleteRear();
		System.out.println("Front: "+ dq.getFront());
		System.out.println("Rear: "+ dq.getRear());
	}

}
