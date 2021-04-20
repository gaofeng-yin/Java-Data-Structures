package queue;

public class ArrayQueue<E> implements Queue<E> {
	//default array capacity
	private static final int CAPACITY = 1000;
	//generic array used for storage
	private E[] data;
	//index of the front element
	private int front = 0;
	//current number of elements
	private int size = 0;
	//constructor for default capacity
	public ArrayQueue() {
		this(CAPACITY);
	}
	//constructor for given capacity
	public ArrayQueue(int capacity) {
		data = (E[]) new Object[capacity];
	}
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return (size == 0);
	}

	@Override
	public E first() {
		if(isEmpty()) {
			return null;
		}
		return data[front];
	}

	@Override
	public void enqueue(E element)throws IllegalStateException {
		if(size == data.length) {
			throw new IllegalStateException("Queue is full!");
		}
		//modular arithmetic
		int avail = (front + size)%data.length;
		data[avail] = element;
		size++;
	}

	@Override
	public E dequeue() {
		if(isEmpty()) {
			return null;
		}
		E answer = data[front];
		//dereference to help garbage collection
		data[front] = null;
		front = (front + 1)%data.length;
		size--;
		return answer;
	}

}
