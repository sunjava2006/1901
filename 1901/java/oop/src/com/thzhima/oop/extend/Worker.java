package com.thzhima.oop.extend;

public class Worker extends Human{
	
	public String name ="李洋";
	
	@Override // 方法重写，方法覆盖
	public void work() {
		System.out.println("装配机器");
	}
}
