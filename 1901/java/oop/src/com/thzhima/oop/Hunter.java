package com.thzhima.oop;

public class Hunter {

	int liftValue = 100;
	
	public void eat(Food f) {
		this.liftValue += f.power/2;
		System.out.println("能量补充中。。。。。");
	}
	
	public void hunt(Animal a) {
		a.lifevalue -= 30;
		System.out.println("勇敢的猎人在打猎。。");
	}
}
