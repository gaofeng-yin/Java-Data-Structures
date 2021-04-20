package src.queue;

import src.stack.Override;

public class LinkedQueue<E> implements Queue<E> {
	private SinglyLinkedList<E> list = new SinglyLinkedList<>();
	
	@Override
	public int size() {
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public void enqueue(E element) {
		list.addLast(element);
	}
	
	@Override
	public E first() {
		return list.first();
	}
	
	@Override
	public E dequeue() {
		return list.removeFirst();
	}
}
