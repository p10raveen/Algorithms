package stack_implementation;

public class StackImp {
	// declare
	int[] stack;
	int top;
	int capacity;

	StackImp(int size)
			{
			stack = new int[size];
			top = -1;
			capacity = size;
			}

	// check if the stack is full
	boolean isfull() {
		return top == capacity - 1;
	}

	// push operation
	void push(int value) {
		if (isfull()) {
			System.out.println("Stack is full");
			System.exit(1);
		} else {
			stack[++top] = value;
		}
	}

	// print stack
	void printStack() {
		for (int i = 0; i <= top; i++) {
			System.out.print(stack[i] + "\t");
		}
	}

	// check if the stack is empty
	boolean isEmpty() {
		return top == -1;
	}

	// pop operation
	int pop() {
		int a = 0;
		if (isEmpty()) {
			System.out.println("Stack is Empty");
		} else {
			a = stack[top--];
		}
		return a;
	}

	public static void main(String args[] ) {
		StackImp a = new StackImp(5);
		a.push(1);
		a.push(2);
		a.push(3);
		a.push(4);
		a.push(5);
		a.printStack();
		System.out.println();
		a.pop();
		a.printStack();

	}

}
