package com.thzhima.factory;

public class Test {

	public static void main(String[] args) {
//		TVFactory f = new TVFactory();
//		TV tv = f.create();
		
//		tv.watch();
		
		TV tv2 = TVFactory.create();
		
		CarFactory f = CarFactory.getFactoryInstance();
		Car c = f.createCar();
		
		CarFactory f2 = CarFactory.getFactoryInstance();
		System.out.println(f == f2);
	}
}
