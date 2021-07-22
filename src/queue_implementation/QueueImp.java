package queue_implementation;

public class QueueImp {
	int[] queue;
	int front,rear;
	int capacity;

	QueueImp(int size)
	{
	queue=new int[size];front=-1;rear=-1;capacity=size;
	}

	// check if the queue is full
	boolean isfull() {
		return front == 0 && rear == capacity - 1;
	}

	// Enqueue operation
	void enqueue(int value) {
		if (isfull()) {
			System.out.println("Queue is full");
			System.exit(1);
		} else {
			if (front == -1) {
				front = 0;
			}
			queue[++rear] = value;
		}
	}

	// print Queue
	void printQueue() {
		for (int i = front; i <= rear; i++) {
			System.out.print(queue[i] + "\t");
		}
	}

	// check if the queue is empty
	boolean isEmpty() {
		return front == -1;
	}

	// Dequeue operation
	int dequeue() {
		int a = 0;
		if (isEmpty()) {
			System.out.println("Queue is Empty");
		} else {
			a = queue[front];
			if (front >= rear) {
				front = -1;
				rear = -1;
			} else {
				front++;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		QueueImp a = new QueueImp(5);
		a.enqueue(1);
		a.enqueue(2);
		a.enqueue(3);
		a.enqueue(4);
		a.printQueue();
		System.out.println();
		a.dequeue();
		a.printQueue();

	}
}
