package com.thzhima.oop.extend;

public class Human {
	public String name;
	public String gender;
	
	public Human(String name, String gender) {
		System.out.println("---父类有参构造--");
		this.name = name;
		this.gender = gender;
	}
	
	public Human() {
		System.out.println("--父类的构造--");
	}
	
	public void work() {
		System.out.println("工作中........");
	}
}
