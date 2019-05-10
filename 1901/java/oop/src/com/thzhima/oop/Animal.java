package com.thzhima.oop;

public class Animal {

	public int lifevalue = 100;
	
	public void attack(Hunter h) {
		h.liftValue -= 60*lifevalue/100;
		System.out.println("----ÅØÏø");
	}
}
