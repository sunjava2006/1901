package com.thzhima.oop.access;

public class People {
	public String gender;
	public String name;
	
	private int money=100000;
	
    protected int getMoney() {
		return this.money/2;
	}
}
