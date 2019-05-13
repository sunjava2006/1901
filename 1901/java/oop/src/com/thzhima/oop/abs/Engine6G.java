package com.thzhima.oop.abs;

public abstract class Engine6G {

	public abstract void run();
	
	public void fire() {
		System.out.println("µã»ð");
	}
	
	public static void main(String[] args) {
		Engine6G e = new Engine6GImpl();
		e.fire();
		e.run();
	}
}
