package com.thzhima.oop.access.otherpackage;

import com.thzhima.oop.access.People;

public class Student extends People{

	{
		System.out.println();
	}
	public void printMoney() {
		//System.out.println(super.money);
		this.getMoney();
	}
	
	@Override
	 protected int getMoney() {
			return this.getMoney()*2;
	 }
	 
	 
	public static void main(String[] args) {
		Student s = new Student();
	
	}
}
