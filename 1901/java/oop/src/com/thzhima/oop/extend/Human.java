package com.thzhima.oop.extend;

public class Human {
	public String name;
	public String gender;
	
	public Human(String name, String gender) {
		System.out.println("---�����вι���--");
		this.name = name;
		this.gender = gender;
	}
	
	public Human() {
		System.out.println("--����Ĺ���--");
	}
	
	public void work() {
		System.out.println("������........");
	}
}
