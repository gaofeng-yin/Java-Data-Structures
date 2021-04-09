package doublyLinkedList;

public class DoublyLinkedList<E> {
	
	//nested Node class
	private static class Node<E>{
		
		//element stored in this node
		private E element;
		//previous node in the list
		private Node<E> prev;
		//subsequent node in the list
		private Node<E> next;
	
		public Node(E e, Node<E> p, Node<E> n) {
			element = e;
			prev = p;
			next = n;
		}
		
		public E getElement() {
			return element;
		}
		
		public Node<E> getPrev(){
			return prev;
		}
		
		public Node<E> getNext(){
			return next;
		}
		
		public void setPrev(Node<E> p) {
			prev = p;
		}
		
		public void setNext(Node<E> n) {
			next = n;
		}
		
	}
	
	//header sentinel
	private Node<E> header;
	//tailer sentinel
	private Node<E> tailer;
	//number of nodes in the list
	private int size = 0;
	
	//constructor: create header, create tailer prev point to header and then header set next to tailer
	public DoublyLinkedList() {
		header = new Node<>(null,null,null);
		tailer = new Node<>(null,header,null);
		header.setNext(tailer);
	}
	
	//return size of the list
	public int size() {
		return size;
	}
	
	//is list empty?
	public boolean isEmpty() {
		return size == 0;
	}
	
	//get first element of the list
	public E first() {
		return header.getNext().getElement();
	}
	
	//get last element of the list
	public E last() {
		return tailer.getPrev().getElement();
	}
	
	//Add element to the linked list in between the given node
	private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
		Node<E> newest = new Node<>(e,predecessor,successor);
		predecessor.setNext(newest);
		successor.setPrev(newest);
		size++;
	}
	
	//removes the given node from the list and returns it's element
	private E remove(Node<E> node) {
		Node<E> predecessor = node.getPrev();
		Node<E> successor = node.getNext();
		predecessor.setNext(successor);
		successor.setPrev(predecessor);
		size--;
		return node.getElement();
	}
	
	//add element to the front of the list
	public void addFirst(E e) {
		addBetween(e, header, header.getNext());
	}
	
	//add element to the end of the list 
	public void addLast(E e) {
		addBetween(e, tailer.getPrev(), tailer);
	}
	
	//remove and returns the first element of the list
	public E removeFirst() {
		if(isEmpty()) {
			return null;
		}
		return remove(header.getNext());
	}
	
	//remove and returns the last element of the list
	public E removeLast() {
		if(isEmpty()) {
			return null;
		}
		return remove(tailer.getPrev());
	}
	
}
