package com.thzhima.oop;

public class Game {

	public static void main(String[] args) {
		Hunter h = new Hunter();
		Animal a = new Animal();
		
		while(true) {
			int ran = (int)(10*Math.random());
			if(ran%2 == 0) {
				h.hunt(a);
			}else {
				a.attack(h);
			}
			if(ran <=5) {
				Food f = new Food();
				h.eat(f);
			}
			
			if(h.liftValue<=0 || a.lifevalue<=0) {
				break;
			}
		}
		System.out.println("ÁÔÈË£º"+h.liftValue);
		System.out.println("¶¯Îï£º"+a.lifevalue);
	}
}
