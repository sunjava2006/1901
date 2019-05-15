package com.thzhima.o;

import com.thzhima.Flyable;
import com.thzhima.Swimable;

public class Test {

	public static void main(String[] args) {
		Flyable f = new Flyable(){

			@Override
			public void fly() {
				System.out.println("fly.....");
			}
			
			public void run(){
				
			}
			
		};
		
		f.fly();

		int power = Flyable.power;
		
		Flyable f2 = new Bird();
		Swimable f3 = new Bird();
	}
}
