package com.thzhima.oop.factory;

public class CarFactory {
    static int no = 1;
    
	public static Car create() {
		no++;
		return new Car();
	}
	
	public static void main(String[] args) {
		//CarFactory f = new CarFactory();
	
		
		for(int i=0;i<1000000;i++) {
			Car c = CarFactory.create();
		}
		
	}
}
