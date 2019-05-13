package com.thzhima.oop.extend;

public class Bird extends Animal {

	@Override
	private void move() {
		super.move();
		this.run();
	}
	
	public void run() {
		System.out.println("Ð¡ÄñÌø×Å×ß¡£");
	}
	
	public void fly() {
		
	}
	
	public static void main(String[] args) {
		Bird b = new Bird();
		b.move();
	}
}
