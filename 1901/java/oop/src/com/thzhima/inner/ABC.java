package com.thzhima.inner;

import com.thzhima.oop.extend.Student;

public class ABC {

	public static void main(String[] args) {
		Test t = new MyTest();
		t.sum(1, 3);
		
		// new 匿名类，产生Test类的子类对象。
		// 这个子类没有定义名字，new 直接生成了对象。
		Test t2 = new Test() {
			public int sum(int a, int b) {
				return a+b;
			}
		};
		
		t2.sum(100, 200);
		
		Student s = new Student() {
			public void study() {
				System.out.println("........");
			}
		};
		
		s.study();
		
	}
}
