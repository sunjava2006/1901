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
		this.school = school;
		
	}
	
	public void study() {
		System.out.println("ѧϰ��������");
	}
	
	public static void main(String[] args) {
		Student s = new Student("�ŷ�", "Ů", "�Ͼ���ѧ");
//		s.name = "����";
//		s.gender = "��";
		
		System.out.println(s.name);
		System.out.println(s.gender);
		
		s.work();
		s.study();
	}
}
