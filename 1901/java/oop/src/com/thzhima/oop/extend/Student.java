package com.thzhima.oop.extend;

import com.thzhima.oop.A;

public class Student extends Human{

	public String school;
	
	public Student() {
		super();// ����ʾ��Ĭ�ϵľͻ���ø���Ĺ��졣
		System.out.println("---���๹����--");
	}
	
	public Student(String name, String gender, String school) {
		super(name, gender);
//		this.name = name;
//		super.gender = gender;
		Student.this.school = school;
		
	}
	
	public void study() {
		System.out.println("ѧϰ��������");
	}

}
