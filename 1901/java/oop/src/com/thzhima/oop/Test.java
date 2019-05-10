package com.thzhima.oop;

public class Test {

	public static void main(String[] args) {
		// 创建对象
		People p ;
		p = new People(); // new 构造方法（）
		
		System.out.println(p.name);
		System.out.println(p.gender);
		System.out.println(p.height);
		
		People p2 = new People("female", "Zhang");
		System.out.println(p2.name);
		System.out.println(p2.gender);
		System.out.println(p2.height);
		
		People p3 = new People("male", "Fang");
		System.out.println(p3.name);
		System.out.println(p3.gender);
		System.out.println(p3.height);
		
		p.add("aa", 1);
		
	}
}
