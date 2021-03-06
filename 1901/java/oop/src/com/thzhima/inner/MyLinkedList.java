package com.thzhima.inner;

public class MyLinkedList {
	private int size = 0;
	private Node first = null;
	private Node last = null;
	
	public void add(Object o) {
		if(0 == size) {
			Node n = new Node(null, null, o);
			this.first = n;
			this.last = n;
		}else {
			Node n = new Node(this.last, null, o);
			this.last.next = n;
			this.last = n;
		}
		size++;
	}
	
	
	public boolean remove(int idx) {
		if(idx<0 || idx>=size) {
			return false;
		}else {
			if(0 == idx) {
				if(first.next!=null) {
					first.next.previous=null;
				}
				first.next = null;
				first = first.next;
			}else if(size-1 == idx){
				last = last.previous;
				last.next.previous = null;
				last.next = null;
		
			}else {
				
			}
			size--;
			return true;
		}
	}
	
	public Object get(int idx) {
		if(idx >= 0 && idx<size) {
			if(0 ==idx) {
				return this.first.value;
			}else if(idx == size-1) {
				return this.last.value;
			}else {
				Node curr = this.first;
				for(int i=0; i<idx; i++) {
					curr = curr.next;
				}
				return  curr.value;
			}
		}else {
			return null;
		}
	}
	
	public int size() {
		return this.size;
	}
	
	 class Node{
		Node previous;
		Node next;
		Object value;
		
		Node(Node previous, Node next, Object value){
			this.previous = previous;
			this.next = next;
			this.value = value;
		}
	}
	
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.add(100);
		//list.remove(0);
		list.add(200);
		list.add(300);
		list.remove(2);

		System.out.println(list.size());
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
//		for(int i=0; i<list.size(); i++) {
//			Object o = list.get(i);
//			System.out.println(o);
//		}
	
	}
}
