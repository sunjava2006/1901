package com.thzhima.oop;

public class Hunter {

	int liftValue = 100;
	
	public void eat(Food f) {
		this.liftValue += f.power/2;
		System.out.println("���������С���������");
	}
	
	public void hunt(Animal a) {
		a.lifevalue -= 30;
		System.out.println("�¸ҵ������ڴ��ԡ���");
	}
}
