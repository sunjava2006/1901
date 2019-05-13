package com.thzhima.oop.sta;

public class A {

	public static void work() {
		System.out.println("work A");
	}
	
	public static void main(String[] args) {
		A a = new B();
		a.work();
	}

}

class B extends A{
	public static void work() {
		System.out.println("work B");
	}
}