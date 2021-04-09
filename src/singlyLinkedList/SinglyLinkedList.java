package singlyLinkedList;

public class SinglyLinkedList<E> {
	
	//nested Node class
	private static class Node<E>{
		
		//element stored in this node
		private E element;
		
		//subsequent node in the list
		private Node<E> next;
		
		public Node(E e, Node<E> n) {
			element = e;
			next = n;
		}
		
		public E getElement() {
			return element;
		}
		
		public Node<E> getNext(){
			return next;
		}
		
		public void setNext(Node<E> n) {
			next = n;
		}
	}
	
	//head node 
	private Node<E> head = null;
	
	//last node
	private Node<E> tail = null;
	
	//number of nodes in the list
	private int size = 0;
	
	//empty constructor
	public SinglyLinkedList() {}
	
	//return size of the list
	public int size() {
		return size;
	}
	
	//is list empty?
	public boolean isEmpty() {
		return size == 0;
	}
	
	//get first element of the list or null if empty
	public E first() {
		if(isEmpty()) {
			return null;
		}
		return head.getElement();
	}
	
	//get last element of the list or null if empty
	public E last() {
		if(isEmpty()) {
			return null;
		}
		return tail.getElement();
	}
	
	//add element to the front of the list
	public void addFirst(E e) {
		head = new Node<>(e,head);
		
		//if list is empty, new node becomes tail also
		if(size == 0) {
			tail = head;
		}
		
		size++;
	}
	
	//add element to the end of the list
	public void addLast(E e) {
		Node<E> newest = new Node<>(e,null);
		
		//if list is empty, new node becomes
		if(isEmpty()) {
			head = newest; 
		}else {
			tail.setNext(newest);
		}
		
		//new node becomes tail
		tail = newest;
		size++;
	}
	
	//remove first and return first element in the list
	public E removeFirst() {
		//if list is empty, return null
		if(isEmpty()) {
			return null;
		}
		
		E answer = head.getElement();
		head = head.getNext();
		size--;
		
		if(size == 0) {
			tail = null;
		}
		
		return answer;
	}
	
}
