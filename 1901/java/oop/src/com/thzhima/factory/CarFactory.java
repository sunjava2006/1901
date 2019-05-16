package com.thzhima.factory;

// ����ʵ������ģʽ
public class CarFactory {
	private CarFactory(){}
	
	private static CarFactory f = new CarFactory();
	
	public static CarFactory getFactoryInstance(){
		return f;
	}

	public Car createCar(){
		return new Car(){

			@Override
			public void run() {
				System.out.println("run...");
			}

			@Override
			public void openDoor() {
				System.out.println("open door...");
			}
			
		};
	}
}
