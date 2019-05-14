package com.thzhima.inner;

public class A {

	int value = 90;
	
	private class B{
		int value = A.this.value;
		int foo = 1;
		
		public void todo() {
			System.out.println(B.this.value);
			System.out.println(A.this.value);
		}
	}
	
	private void createB() {
		B b = new B();
		System.out.println(b.value);
		
		Sta.B  stab = new Sta.B();
		
		MyLinkedList.Node n =
		new MyLinkedList().new Node(null, null, null);
	}
}
