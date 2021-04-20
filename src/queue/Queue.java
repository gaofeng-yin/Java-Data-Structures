package queue;

public interface Queue<E> {
	int size();
	
	boolean isEmpty();
	
	E first();
	
	void enqueue(E element);
	
	E dequeue();
}
