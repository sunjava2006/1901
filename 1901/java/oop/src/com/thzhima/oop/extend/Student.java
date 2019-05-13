package com.thzhima.oop.extend;

import com.thzhima.oop.A;

public class Student extends Human{

	public String school;
	
	public Student() {
		super();// （显示）默认的就会调用父类的构造。
		System.out.println("---子类构造中--");
	}
	
	public Student(String name, String gender, String school) {
		super(name, gender);
//		this.name = name;
//		super.gender = gender;
		this.school = school;
		
	}
	
	public void study() {
		System.out.println("学习。。。。");
	}
	
	public static void main(String[] args) {
		Student s = new Student("张方", "女", "南京大学");
//		s.name = "张明";
//		s.gender = "男";
		
		System.out.println(s.name);
		System.out.println(s.gender);
		
		s.work();
		s.study();
	}
}
