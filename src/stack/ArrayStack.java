package stack;

public class ArrayStack<E> implements Stack<E> {
	//default capacity
	private static final int CAPACITY = 500;
	//generic array used for storage
	private E[] data;
	//index of the top element in stack
	private int t = -1;
	
	//constructor for default capacity
	public ArrayStack() {
		this(CAPACITY);
	}
	//constructor for given capacity
	public ArrayStack(int capacity) {
		data = (E[]) new Object[capacity];
	}
	
	@Override
	public int size() {
		return (t + 1);
	}

	@Override
	public boolean isEmpty() {
		return (t == -1);
	}

	@Override
	public E top() {
		if(isEmpty()) {
			return null;
		}
		return data[t];
	}

	@Override
	public void push(E element)throws IllegalStateException {
		if(size() == data.length) {
			throw new IllegalStateException("Stack is full!");
		}
		//increment t before storing new element
		data[++t] = element;
	}

	@Override
	public E pop() {
		if(isEmpty()) {
			return null;
		}
		E answer = data[t];
		//dereference to help garbage collection
		data[t] = null;
		t--;
		return answer;
	}

}
